package com.wave.ripples.web.api.service;

import com.wave.ripples.domain.Member;

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
}
