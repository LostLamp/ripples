package com.wave.ripples.web.ui.api;

import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.commons.utils.HttpClientUtils;
import com.wave.ripples.commons.utils.MapperUtils;
import com.wave.ripples.web.ui.dto.Member;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;


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
     * 登录
     *
     * @param loginId
     * @param password
     * @return
     */
    public static Member login(String loginId, String password) throws Exception {
        // 设置请求的参数
        List<BasicNameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("loginId", loginId));
        params.add(new BasicNameValuePair("password", password));
        String json = HttpClientUtils.doPost(API.API_MEMBER, params.toArray(new BasicNameValuePair[params.size()]));
        Member member = MapperUtils.json2pojoByTree(json, "data", Member.class);
        return member;
    }
}
