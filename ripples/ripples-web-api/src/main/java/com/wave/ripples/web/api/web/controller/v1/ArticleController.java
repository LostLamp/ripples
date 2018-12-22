package com.wave.ripples.web.api.web.controller.v1;

import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.domain.Article;
import com.wave.ripples.web.api.service.ArticleService;
import com.wave.ripples.web.api.web.dto.ArticleDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /**
     * 展示动态信息
     *
     * @param start
     * @param length
     * @return
     */
    @GetMapping(value = "start/{start}/length/{length}")
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
}
