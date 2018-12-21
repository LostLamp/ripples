package com.wave.ripples.web.ui.mapper;

import com.wave.ripples.domain.Article;
import org.springframework.stereotype.Repository;

/**
 * 消息 对象关系映射接口
 * <p>@Title ArticleMapper </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/18 15:32
 */
@Repository
public interface ArticleMapper {

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
