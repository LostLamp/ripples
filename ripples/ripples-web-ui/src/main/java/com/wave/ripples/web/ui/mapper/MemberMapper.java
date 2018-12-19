package com.wave.ripples.web.ui.mapper;


import com.wave.ripples.domain.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberMapper {
    /**
     * 根据用户账号查找用户实例
     * @param member
     * @return
     */
    Member getByLoginId(Member member);
}
