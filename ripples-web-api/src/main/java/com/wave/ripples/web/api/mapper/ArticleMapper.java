package com.wave.ripples.web.api.mapper;

import com.wave.ripples.domain.Article;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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
     * 根据 id 查找实例
     *
     * @return
     */
    Article getById(Long id);

    /**
     * 根据会员 id 查找对应动态消息
     * @param memberId
     * @return
     */
    List<Article> getByMemberId(Long memberId);

    /**
     * 展示动态消息
     *
     * @return
     */
    List<Article> getAllArticle(Map<String, Object> map);

    /**
     * 发布动态消息
     *
     * @param article
     */
    void release(Article article);

    /**
     * 删除动态消息
     *
     * @param id
     */
    void delete(Long id);
}
