package com.wave.ripples.web.api.service;

import com.wave.ripples.domain.Article;
import com.wave.ripples.domain.Comment;

import java.lang.reflect.Array;
import java.util.List;

/**
 * 评论
 * <p>@Title CommentService </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/23 15:09
 */
public interface CommentService {

    /**
     * 根据 id 查找实例
     *
     * @param id
     * @return
     */
    Comment getById(Long id);

    /**
     * 查找某条动态消息所有父评论
     *
     * @return
     */
    List<Comment> getParentComment(Article article);

    /**
     * 查找某条评论所有子评论
     *
     * @param comment
     * @return
     */
    List<Comment> getSonComment(Comment comment);

    /**
     * 发表一条评论
     *
     * @param comment
     */
    boolean add(Comment comment);
}
