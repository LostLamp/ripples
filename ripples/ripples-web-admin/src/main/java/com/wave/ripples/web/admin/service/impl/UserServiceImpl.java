package com.wave.ripples.web.admin.service.impl;

import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.commons.validation.BeanValidator;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.mapper.IMemberMapper;
import com.wave.ripples.web.admin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.util.Date;


@Service
public class UserServiceImpl extends BaseServiceImpl<Member,IMemberMapper> implements IUserService {

    @Autowired
    private IMemberMapper mapper;

    /**
     * 保存用户信息
     * @param member
     * @return
     */
    @Override
    public BaseResult save(Member member) {
        String validator = BeanValidator.validator(member);
        //验证不通过
        if(validator != null){
            return BaseResult.faile(validator);
        }
        //验证通过
        else {
            member.setUpdated(new Date());
            Long id = member.getMemberId();
            //新增
            if(id == null){
                member.setCreated(new Date());
                member.setPassword(DigestUtils.md5DigestAsHex(member.getPassword().getBytes()));
                mapper.insert(member);
            }

            //修改
            else {
                String oldPwd = mapper.selectById(id).getPassword();
                String newPwd = member.getPassword();
                //修改了密码
                if(!StringUtils.pathEquals(oldPwd,newPwd)){
                    //加密
                    member.setPassword(DigestUtils.md5DigestAsHex(newPwd.getBytes()));
                }
                mapper.update(member);
            }

            return BaseResult.success("保存用户成功");
        }
    }

    @Override
    public void delete(Long id ) {
        mapper.delete(id);
    }
}
