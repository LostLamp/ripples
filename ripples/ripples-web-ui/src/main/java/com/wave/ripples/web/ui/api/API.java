package com.wave.ripples.web.ui.api;

public class API {
    // 主机地址
    public static final String HOST = "http://localhost:8081/api/v1";

    // 会员管理接口
    public static final String API_MEMBER = HOST + "/member/login";

    // 动态消息获取接口
    public static final String API_ARTICLE = HOST + "/article/show";

    // 发布动态消息
    public static final String API_ARTICLE_RELEASE = HOST + "/article/release";

    // 删除动态消息
    public static final String API_ARTICLE_DELETE = HOST + "article/delete";
}
