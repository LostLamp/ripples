package com.wave.ripples.web.api.web.controller.v1;

import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.domain.Article;
import com.wave.ripples.web.api.service.ArticleService;
import com.wave.ripples.web.api.web.dto.ArticleDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 动态消息 API 模块控制器
 * <p>@Title ArticleController </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/21 23:01
 */
@RequestMapping(value = "${api.path.v1}/article")
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @ModelAttribute
    public Article getByid(Long id) {
        Article article = null;
        if (id != null) {
            article = new Article();
        }
        //
        else {
            article = articleService.getById(id);
        }
        return article;
    }

    /**
     * 展示动态信息
     *
     * @param start
     * @param length
     * @return
     */
    @PostMapping(value = "show/{start}/{length}")
    public BaseResult getAllArticle(@PathVariable(value = "start") Integer start, @PathVariable(value = "length") Integer length) {
        if (length != 0) {
            // 将数据传进 dto 传输集合中
            List<ArticleDto> articleDtoList = null;
            List<Article> articleList = articleService.getAllArticle(start, length);
            if (articleList != null && articleList.size() > 0) {
                articleDtoList = new ArrayList<>();
                for (Article article : articleList) {
                    ArticleDto articleDto = new ArticleDto();
                    BeanUtils.copyProperties(article, articleDto);
                    articleDtoList.add(articleDto);
                }
            }
            // 将 dto 集合传输给 ui
            return BaseResult.success("成功", articleDtoList);
        }
        // 查询的长度的为0时，提示查询失败
        else {
            return BaseResult.fail("查询失败，请检查你的网络");
        }
    }

    /**
     * 发布动态消息
     *
     * @param article
     * @return
     */
    @PostMapping(value = "release")
    public BaseResult release(Article article) {
        if (article != null) {
            boolean release = articleService.release(article);
            if (release) {
                return BaseResult.success("发布成功");
            }
        }
        return BaseResult.fail("发布失败");
    }

    /**
     * 删除动态消息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "delete/{id}")
    public BaseResult delete(@PathVariable(value = "id") Long id) {
        if (id != null) {
            boolean delete = articleService.delete(id);
            if (delete) {
                return BaseResult.success("删除成功");
            }
        }
        return BaseResult.fail("删除失败");
    }
}
