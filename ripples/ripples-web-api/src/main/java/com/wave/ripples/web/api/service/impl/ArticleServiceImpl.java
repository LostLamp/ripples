package com.wave.ripples.web.api.service.impl;

import com.wave.ripples.domain.Article;
import com.wave.ripples.web.api.mapper.ArticleMapper;
import com.wave.ripples.web.api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public ArticleMapper articleMapper;


    /**
     * 根据 id 查找
     * @param id
     * @return
     */
    public Article getById(Long id){
        return articleMapper.getById(id);
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
     * 删除动态消息
     *
     * @param id
     * @return
     */
    @Override
    public boolean delete(Long id) {
        Article articleById = getById(id);
        if (articleById != null) {
            articleMapper.delete(id);
            return true;
        }
        return false;
    }
}
