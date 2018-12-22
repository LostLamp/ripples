package com.wave.ripples.web.api.service.impl;

import com.wave.ripples.domain.Article;
import com.wave.ripples.web.api.mapper.ArticleMapper;
import com.wave.ripples.web.api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public ArticleMapper articleMapper;

    @Override
    public List<Article> getAllArticle(Integer start, Integer length) {
        List<Article> articleList = null;
        if (length != 0) {
            articleList = articleMapper.getAllArticle(start, length);
        }
        return articleList;
    }
}
