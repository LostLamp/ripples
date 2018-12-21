package com.wave.ripples.web.api.mapper;

import com.wave.ripples.domain.Member;
import org.springframework.stereotype.Repository;

/**
 * 会员 关系映射接口
 * <p>@Title MemberMapper </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/20 14:37
 */
@Repository
public interface MemberMapper {

    /**
     * 根据登录 id 查找实例
     * @param member
     * @return
     */
    Member login(Member member);
}
