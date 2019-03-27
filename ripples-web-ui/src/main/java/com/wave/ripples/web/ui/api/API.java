package com.wave.ripples.web.ui.api;

public class API {
    // 主机地址
    public static final String HOST = "http://localhost:8081/api/v1";

    // 会员管理接口
    public static final String API_MEMBER = HOST + "/member/login";

    // 会员修改密码
    public static final String API_MEMBER_MODIFY = HOST + "/member/modify";

    // 动态消息获取接口
    public static final String API_ARTICLE = HOST + "/article/show";

    // 根据会员 id 查询对应消息
    public static final String API_MEMBER_ARTICLE = HOST + "/member/article";

    // 发布动态消息
    public static final String API_ARTICLE_RELEASE = HOST + "/article/release";

    // 删除动态消息
    public static final String API_ARTICLE_DELETE = HOST + "article/delete";

    // 获取某条消息所有父评论
    public static final String API_COMMENT = HOST + "comment/get/parent/comment";

    // 获取某条评论的所有子评论
    public static final String API_COMMENT_SON = HOST + "comment/get/son/comment";
}
