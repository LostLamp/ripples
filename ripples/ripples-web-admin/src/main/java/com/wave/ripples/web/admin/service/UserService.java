package com.wave.ripples.web.admin.service;


import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.commons.PageInfo;

import java.util.List;

/**
 * 用户管理
 */
public interface UserService {

    /**
     * 查询全部实例
     */
    List<Member> selectAll();

    /**
     * 分页查询
     */
    PageInfo<Member> page(Member member, int start, int length);

    /**
     * 查询总笔数
     */
    int count(Member member);
}
