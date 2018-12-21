package com.wave.ripples.web.admin.service;

import com.wave.ripples.domain.Member;
/**
 * 个人信息管理
 * @Author wodef
 * @version 1.0.0
 * @Date 2018/12/19
 */
public interface IProfileService {
    /**
     * 保存信息
     * */
    String save(Member member);

    /**
     * 修改密码
     * @return 0/成功，1/旧密码错误，2/新密码与旧密码一致，3/新密码不符合规范
     */
    int modifyPassword(Member member);


}
