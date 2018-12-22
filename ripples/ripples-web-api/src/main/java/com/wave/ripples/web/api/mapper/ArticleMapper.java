package com.wave.ripples.web.api.mapper;

import com.wave.ripples.domain.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 动态消息 对象关系映射
 * <p>@Title ArticleMapper </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/21 23:27
 */
@Repository
public interface ArticleMapper {

    /**
     * 展示动态消息
     *
     * @param start
     * @param length
     * @return
     */
    List<Article> getAllArticle(Integer start, Integer length);
}
