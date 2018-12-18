package com.wave.ripples.web.admin.service.impl;

import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.mapper.MemberMapper;
import com.wave.ripples.web.admin.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public Member login(String loginId, String loginPwd) {
        Member params = new Member();
        params.setMembername(loginId);
        params.setPhone(loginId);
        params.setEmail(loginId);

        Member member = memberMapper.getByLoginId(params);
        // 密码加密
        String password = DigestUtils.md5DigestAsHex(loginPwd.getBytes());
        if (member != null) {
            // 判断密码是否正确
            if (password.equals(member.getPassword())) {
                return member;
            }
        }
        return null;
    }
}
