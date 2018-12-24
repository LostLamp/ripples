package com.wave.ripples.web.admin.service.impl;

import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.mapper.IMemberMapper;
import com.wave.ripples.web.admin.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private IMemberMapper memberMapper;

    @Override
    public Member login(String loginId, String loginPwd) {
        Member params = new Member();
        params.setMemberName(loginId);
        params.setPhone(loginId);
        params.setEmail(loginId);

        Member member = memberMapper.getByLoginId(loginId);
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

    /**
     * 获取邮箱，用于发送信息
     * @param email
     * @return
     */
    @Override
    public Member getEmail(String email) {
        return memberMapper.getEmail(email);

    }
}
