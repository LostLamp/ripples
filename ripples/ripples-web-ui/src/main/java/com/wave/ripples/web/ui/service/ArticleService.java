package com.wave.ripples.web.ui.service;

import com.wave.ripples.domain.Article;

/**
 * 消息 业务逻辑处理接口
 * <p>@Title ArticleService </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/18 15:34
 */
public interface ArticleService {

    /**
     * 发布一条消息
     *
     * @param article
     */
    void insert(Article article);

    /**
     * 删除一条消息
     *
     * @param article
     */
    void delete(Article article);
}
