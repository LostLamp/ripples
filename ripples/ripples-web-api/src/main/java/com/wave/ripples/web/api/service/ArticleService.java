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
     * 展示动态消息
     *
     * @param start
     * @param length
     * @return
     */
    List<Article> getAllArticle(Integer start, Integer length);
}
