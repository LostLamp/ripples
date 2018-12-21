package com.wave.ripples.web.api.service.impl;

import com.wave.ripples.domain.Member;
import com.wave.ripples.web.api.mapper.MemberMapper;
import com.wave.ripples.web.api.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     * 根据登录 id 查找实例
     *
     * @param loginId
     * @return
     */
    @Override
    public Member getByLoginId(String loginId) {
        Member loginMember = new Member();
        loginMember.setMembername(loginId);
        loginMember.setEmail(loginId);
        loginMember.setPhone(loginId);
        return memberMapper.getByLoginId(loginMember);
    }
}
