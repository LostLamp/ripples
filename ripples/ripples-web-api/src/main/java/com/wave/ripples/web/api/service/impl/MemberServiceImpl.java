package com.wave.ripples.web.api.service.impl;

import com.wave.ripples.domain.Member;
import com.wave.ripples.web.api.mapper.MemberMapper;
import com.wave.ripples.web.api.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * 会员 业务逻辑处理 实现类
 * <p>@Title MemberServiceImpl </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/20 14:40
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    /**
     * 登录
     *
     * @param loginId
     * @return
     */
    @Override
    public Member login(String loginId, String password) {
        Member loginMember = new Member();
        loginMember.setMemberName(loginId);
        loginMember.setEmail(loginId);
        loginMember.setPhone(loginId);

        Member member = memberMapper.login(loginMember);
        if (member != null) {
            // 将明文密码加密
            String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
            // 输入的密码加密后与查找到的会员密码相同则返回会员实例
            if (member.getPassword().equals(md5Password)) {
                return member;
            }
        }
        // 密码不匹配返回空
        return null;
    }

    /**
     * 根据 id 查找实例
     *
     * @param id
     * @return
     */
    @Override
    public Member getById(Long id) {
        return memberMapper.getById(id);
    }

    /**
     * 修改实例信息
     *
     * @param member
     */
    @Override
    public void modify(Member member) {
        memberMapper.modify(member);
    }
}
