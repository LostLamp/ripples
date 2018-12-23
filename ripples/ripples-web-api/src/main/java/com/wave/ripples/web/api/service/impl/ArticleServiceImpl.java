package com.wave.ripples.web.api.service.impl;

import com.wave.ripples.domain.Article;
import com.wave.ripples.domain.Comment;
import com.wave.ripples.web.api.mapper.ArticleMapper;
import com.wave.ripples.web.api.mapper.CommentMapper;
import com.wave.ripples.web.api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 动态消息 业务处理实现类
 * <p>@Title ArticleServiceImpl </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/21 23:37
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private CommentMapper commentMapper;

    /**
     * 根据 id 查找
     *
     * @param id
     * @return
     */
    public Article getById(Long id) {
        return articleMapper.getById(id);
    }

    /**
     * 根据会员 id 查找对应动态消息
     *
     * @param memberId
     * @return
     */
    @Override
    public List<Article> getByMemberId(Long memberId) {
        List<Article> articleList = null;
        if (memberId != null) {
            articleList = articleMapper.getByMemberId(memberId);

        }
        return articleList;
    }

    /**
     * 展示动态消息
     *
     * @param start
     * @param length
     * @return
     */
    @Override
    public List<Article> getAllArticle(Integer start, Integer length) {
        List<Article> articleList = null;
        HashMap<String, Object> map = new HashMap<>();
        if (length != 0) {
            // 将分页的数据放入 map 集合
            map.put("start", start);
            map.put("length", length);
            articleList = articleMapper.getAllArticle(map);
        }
        return articleList;
    }

    /**
     * 发布动态消息
     *
     * @param article
     */
    @Override
    public boolean release(Article article) {
        if (article != null) {
            articleMapper.release(article);
            return true;
        }
        // 为空则不操作
        else {
            return false;
        }
    }

    /**
     * 删除某条动态消息时删除所有评论
     *
     * @param article
     */
    @Override
    public boolean deleteMulti(Article article) {
        if (article != null) {
            // 获取某条消息的所有父评论
            List<Comment> parentComment = commentMapper.getParentComment(article);
            // 定义一个存放所有评论的 id 的集合
            List<Long> commentIdList = new ArrayList<>();
            // 定义空的子评论集合
            List<Comment> sonComment = null;
            // 遍历父评论集合
            for (Comment parent : parentComment) {
                // 添加每一条父评论 id
                commentIdList.add(parent.getCommemtId());
                // 获取每一条父评论的所有子评论集合
                sonComment = commentMapper.getSonComment(parent);
                // 遍历每一条子评论
                for (Comment son : sonComment) {
                    // 添加每条子评论进 id 集合
                    commentIdList.add(son.getCommemtId());
                }
            }
            // 将所有 id 集合里的评论都删除
            commentMapper.deleteMulti((Long[]) commentIdList.toArray());
            // 删除 id 对应的动态消息
            articleMapper.delete(article.getArticleId());
            return true;
        }
        return false;
    }
}
