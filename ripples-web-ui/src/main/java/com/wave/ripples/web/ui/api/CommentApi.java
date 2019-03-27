package com.wave.ripples.web.ui.api;

import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.commons.utils.HttpClientUtils;
import com.wave.ripples.commons.utils.MapperUtils;
import com.wave.ripples.web.ui.dto.Comment;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * 评论 管理接口
 * <p>@Title CommentApi </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/24 16:14
 */
public class CommentApi {

    /**
     * 查找某条动态消息的所有父评论
     *
     * @param articleId
     * @return
     */
    public static List<Comment> getParentComment(Long articleId) throws Exception {
        List<BasicNameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("articleId", articleId.toString()));
        String parentJson = HttpClientUtils.doPost(API.API_COMMENT, params.toArray(new BasicNameValuePair[params.size()]));
        List<Comment> parentComment = MapperUtils.json2listByTree(parentJson, "data", Comment.class);
        return parentComment;
    }

    /**
     * 查找某条父评论的所有子评论
     *
     * @param commentId
     * @return
     */
    public static List<Comment> getSonComment(Long commentId) throws Exception {
        List<BasicNameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("commentId", commentId.toString()));
        String sonJson = HttpClientUtils.doPost(API.API_COMMENT_SON, params.toArray(new BasicNameValuePair[params.size()]));
        List<Comment> sonComment = MapperUtils.json2listByTree(sonJson, "data", Comment.class);
        return sonComment;
    }

    /**
     * 发布一条评论
     *
     * @param comment
     * @return
     */
    public static BaseResult release(Comment comment) throws Exception {
        List<BasicNameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("comment", MapperUtils.obj2jsonIgnoreNull(comment)));
        String json = HttpClientUtils.doPost(API.API_ARTICLE_RELEASE, params.toArray(new BasicNameValuePair[params.size()]));
        String message = MapperUtils.json2pojoByTree(json, "message", String.class);
        if (message == "成功") {
            return BaseResult.success("发布成功");
        }
        return BaseResult.fail("发布失败");
    }

}
