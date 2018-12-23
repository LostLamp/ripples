package com.wave.ripples.web.admin.service;


import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.domain.Member;

public interface IProfileService extends IBaseService<Member> {


    /**
     * 获取登录用户信息
     * @param loginId(用户名，邮箱，手机号)
     * @param password 密码
     * @return
     */
    public Member getMember(String loginId, String password);

    /**
     * 修改用户
     */
    public BaseResult updateMember(Member member);

    /**
     * 修改密码
     * @param member
     * @return
     */
    public int changePwd(Member member);

}
