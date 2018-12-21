package com.wave.ripples.web.ui.api;

import com.wave.ripples.commons.utils.HttpClientUtils;
import com.wave.ripples.commons.utils.MapperUtils;
import com.wave.ripples.web.ui.dto.Member;


/**
 * 会员管理接口
 * <p>@Title MemberApi </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/20 21:14
 */
public class MemberApi {
    /**
     * 根据登录 id 查找实例
     *
     * @param loginId
     * @return
     */
    public static Member findMemberByLoginId(String loginId) {
        String result = HttpClientUtils.doGet(API.API_MEMBER + loginId);
        Member member = null;
        try {
            member = MapperUtils.json2pojoByTree(result, "data", Member.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }
}
