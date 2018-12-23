package com.wave.ripples.web.admin.web.controller;

import com.wave.ripples.domain.Article;
import com.wave.ripples.web.admin.service.IArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "article")
public class ArticleController extends BaseController<Article, IArticleService> {

    /**
     * 消息列表
     * @return
     */
    @GetMapping(value = "list")
    public String articleList(){
        return "article/list";
    }

    @GetMapping(value = "delete")
    public String delete(Article article){
        service.delete(article.getArchiveId());
        return "redirect:/article/list";
    }
}
