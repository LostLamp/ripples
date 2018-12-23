package com.wave.ripples.web.admin.service.impl;

import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.commons.validation.BeanValidator;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.mapper.IMemberMapper;
import com.wave.ripples.web.admin.service.IProfileService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;


@Service
public class ProfileServiceImpl extends BaseServiceImpl<Member,IMemberMapper> implements IProfileService {
    @Autowired
    private IMemberMapper memberMapper;

    /**
     * 获取登录用户信息
     * @param loginId(用户名，邮箱，手机号)
     * @return
     */
    @Override
    public Member getMember(String loginId,String password) {
        Member member = new Member();
        member.setMemberName(loginId);
        member.setPhone(loginId);
        member.setEmail(loginId);

        member = memberMapper.getByLoginId(loginId);

        if (member != null){
            //密码加密
            password = DigestUtils.md5DigestAsHex(password.getBytes());
            //密码正确
            if(password.equals(member.getPassword())){
                return member;
            }
            //密码错误
            else {
                return null;
            }
        }
        return null;
    }

    /**
     * 修改用户信息
     * @param member
     */
    @Override
    public BaseResult updateMember(Member member) {
        String validator = BeanValidator.validator(member);
        if(validator == null){
            memberMapper.update(member);
            return BaseResult.success("修改用户成功");
        }
        return BaseResult.faile(validator);
    }

    /**
     * 修改密码
     * @param member
     * @return 0/成功，1/旧密码校验失败，2/新密码校验失败
     */
    @Override
    public int changePwd(Member member) {
        //根据id查询用户实例
        Member profile = memberMapper.selectById(member.getMemberId());
        System.out.println(profile);
        //加密旧密码
        String oldPwd = DigestUtils.md5DigestAsHex(member.getOldPwd().getBytes());

        //校验旧密码
        if(!StringUtils.equals(profile.getPassword(),oldPwd)){
            return Member.CHACK_OLD_PWD_FALSE;
        }

        //校验新密码
        if (StringUtils.isBlank(member.getNewPwd())){
            return Member.CHACK_NEW_PWD_FALSE;
        }

        //修改密码
        profile.setPassword(DigestUtils.md5DigestAsHex(member.getNewPwd().getBytes()));
        memberMapper.update(profile);
        return Member.CHACK_OK;
    }


}
