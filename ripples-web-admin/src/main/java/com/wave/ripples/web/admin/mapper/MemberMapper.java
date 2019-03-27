package com.wave.ripples.web.admin.mapper;

import com.wave.ripples.domain.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberMapper {
    /**
     * 根据登陆账号获取用户信息
     * */
    Member getByLoginId(Member member);
}
