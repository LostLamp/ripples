package com.wave.ripples.web.ui.service.impl;

import com.wave.ripples.web.ui.entity.TbMember;
import com.wave.ripples.web.ui.mapper.TbMemberMapper;
import com.wave.ripples.web.ui.service.TbMemberLoginService;
import com.wave.ripples.web.ui.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
@Service
public class TbMemberLoginServiceImpl implements TbMemberLoginService {
    @Autowired
    private TbMemberMapper tbMemberMapper;

    @Override
    public TbMember login(String loginId, String password) {
        System.out.println(password);
        //将账号名，或邮箱，电话存入实例
        TbMember params = new TbMember();
        params.setMembername(loginId);
        params.setEmail(loginId);
        params.setPhone(loginId);
        //通过账号。。。。获取实例
        TbMember tbMember = tbMemberMapper.getByLoginId(params);
        //将传进来的密码加密处理
        String PWD =DigestUtils.md5DigestAsHex(password.getBytes());
        //判断密码是否正确
        if (PWD.equals(tbMember.getPassword())) {
            //密码正确，返回实例
            return tbMember;
        }
        //密码错误，返回空
        else {

            return null;
        }
    }
}