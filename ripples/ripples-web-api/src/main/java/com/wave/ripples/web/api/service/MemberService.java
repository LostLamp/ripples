package com.wave.ripples.web.api.service;

import com.wave.ripples.domain.Article;
import com.wave.ripples.domain.Member;

import java.util.List;

/**
 * 会员 业务逻辑处理 接口
 * <p>@Title MemberService </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/20 14:38
 */
public interface MemberService {
    /**
     * 根据登录 id 查找实例
     *
     * @param loginId
     * @return
     */
    Member login(String loginId, String password);

    /**
     * 根据 id 查找实例
     *
     * @param id
     * @return
     */
    Member getById(Long id);

    /**
     * 修改实例信息
     *
     * @param member
     */
    void modify(Member member);

}
