package com.wave.ripples.web.ui.web.controller;

import com.wave.ripples.domain.Article;
import com.wave.ripples.web.ui.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 消息 对象控制器
 * <p>@Title ArticleController </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/18 15:40
 */
@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;



    /**
     * 保存发布消息
     *
     * @param article
     * @return
     */
    @PostMapping(value = "save")
    public String save(Article article) {

        return null;
    }
}
