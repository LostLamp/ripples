package com.wave.ripples.web.api.service;

import com.wave.ripples.domain.Article;

import java.util.List;

/**
 * 动态消息 业务处理接口
 * <p>@Title ArticleService </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/21 23:34
 */
public interface ArticleService {

    /**
     * 根据 id 查找
     *
     * @param id
     * @return
     */
    Article getById(Long id);

    /**
     * 根据会员 id 查找对应动态消息
     *
     * @param memberId
     * @return
     */
    List<Article> getByMemberId(Long memberId);

    /**
     * 展示动态消息
     *
     * @return
     */
    List<Article> getAllArticle(Integer begin, Integer length);

    /**
     * 发布动态消息
     *
     * @param article
     */
    boolean release(Article article);

    /**
     * 删除某条动态消息的所有评论
     *
     * @param article
     */
    boolean deleteMulti(Article article);
}
