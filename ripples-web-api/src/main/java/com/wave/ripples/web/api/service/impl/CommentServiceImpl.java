package com.wave.ripples.web.api.service.impl;

import com.wave.ripples.domain.Article;
import com.wave.ripples.domain.Comment;
import com.wave.ripples.web.api.mapper.CommentMapper;
import com.wave.ripples.web.api.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 评论 业务处理实现类
 * <p>@Title CommentServiceImpl </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/23 15:09
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    /**
     * 根据 id 查找实例
     *
     * @param id
     * @return
     */
    @Override
    public Comment getById(Long id) {
        Comment comment = null;
        if (id != null) {
            comment = commentMapper.getById(id);
        }
        return comment;
    }

    /**
     * 查找某条动态消息的所有父评论
     *
     * @return
     */
    @Override
    public List<Comment> getParentComment(Article article) {
        List<Comment> parentCommentList = null;
        if (article != null) {
            parentCommentList = commentMapper.getParentComment(article);
        }
        return parentCommentList;
    }

    /**
     * 查找某条父评论的所有子评论
     *
     * @param comment
     * @return
     */
    @Override
    public List<Comment> getSonComment(Comment comment) {
        List<Comment> sonCommentList = null;
        if (comment != null) {
            sonCommentList = commentMapper.getSonComment(comment);
        }
        return sonCommentList;
    }

    /**
     * 发表一条评论
     *
     * @param comment
     * @return
     */
    @Override
    public boolean add(Comment comment) {
        if (comment != null) {
            commentMapper.add(comment);
            return true;
        }
        return false;
    }
}
