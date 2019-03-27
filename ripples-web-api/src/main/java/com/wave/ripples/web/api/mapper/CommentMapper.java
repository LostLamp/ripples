package com.wave.ripples.web.api.mapper;

import com.wave.ripples.domain.Article;
import com.wave.ripples.domain.Comment;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.List;

/**
 * 评论 对象关系映射
 * <p>@Title CommentMapper </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/22 15:51
 */
@Repository
public interface CommentMapper {

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
     * 删除某条动态消息的所有评论
     *
     * @param commentIdArr
     */
    void deleteMulti(Long[] commentIdArr);

    /**
     * 发表一条评论
     * @param comment
     */
    void add(Comment comment);
}
