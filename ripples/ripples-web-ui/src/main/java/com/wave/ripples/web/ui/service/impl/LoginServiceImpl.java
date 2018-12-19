package com.wave.ripples.web.ui.service.impl;


import com.wave.ripples.domain.Member;
import com.wave.ripples.web.ui.mapper.MemberMapper;
import com.wave.ripples.web.ui.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public Member login(String loginId, String password) {

        //将账号名，或邮箱，电话存入实例
        Member params = new Member();
        params.setMembername(loginId);
        params.setEmail(loginId);
        params.setPhone(loginId);
        //通过账号。。。。获取实例
        Member member = memberMapper.getByLoginId(params);
        //将传进来的密码加密处理
        String PWD = DigestUtils.md5DigestAsHex(password.getBytes());
        //判断密码是否正确

        if (PWD.equals(member.getPassword())) {
            //密码正确，返回实例
            return member;
        }
        //密码错误，返回空
        else {

            return null;
        }
    }
}