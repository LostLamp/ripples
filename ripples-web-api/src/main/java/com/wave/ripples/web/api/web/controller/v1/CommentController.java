package com.wave.ripples.web.api.web.controller.v1;

import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.domain.Article;
import com.wave.ripples.domain.Comment;
import com.wave.ripples.web.api.service.ArticleService;
import com.wave.ripples.web.api.service.CommentService;
import com.wave.ripples.web.api.web.dto.CommentDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 评论 控制器
 * <p>@Title CommentController </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/23 16:45
 */
@RestController
@RequestMapping(value = "${api.path.v1}/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private ArticleService articleService;

    @ModelAttribute
    public Comment getById(String commentId) {
        Long id = Long.parseLong(commentId);
        Comment comment = null;
        if (id == null) {
            comment = new Comment();
        }
        //
        else {
            comment = commentService.getById(id);
        }

        return comment;
    }

    /**
     * 获取所有父评论
     *
     * @param articleId
     * @return
     */
    @GetMapping("get/parent/comment/{articleId}")
    public BaseResult getParentComment(@PathVariable(value = "articleId") String articleId) {
        // 获取动态消息
        Article article = articleService.getById(Long.parseLong(articleId));
        if (article != null) {
            // 获取所有父评论集合
            List<Comment> parenList = commentService.getParentComment(article);
            // 定义空的传输对象集合
            List<CommentDto> commentDtoList = setDtoList(parenList);
            return BaseResult.success("成功", commentDtoList);
        }
        return BaseResult.fail("失败");
    }

    /**
     * 获取某条评论的所有子评论
     *
     * @param parentId
     * @return
     */
    @GetMapping(value = "get/son/comment/{parentId}")
    public BaseResult getSonComment(@PathVariable(value = "parentId") String parentId) {
        Comment comment = commentService.getById(Long.parseLong(parentId));
        if (comment != null) {
            List<Comment> sonComment = commentService.getSonComment(comment);
            List<CommentDto> commentDtoList = setDtoList(sonComment);
            return BaseResult.success("成功", commentDtoList);
        }
        return BaseResult.fail("失败");
    }

    /**
     * 发表一条评论
     *
     * @param comment
     * @return
     */
    @PostMapping(value = "add")
    public BaseResult add(Comment comment) {
        if (comment != null) {
            commentService.add(comment);
            return BaseResult.success("成功");
        }
        return BaseResult.fail("失败");
    }

    /**
     * 设置传输对象集合
     *
     * @param commentList
     * @return
     */
    private List<CommentDto> setDtoList(List<Comment> commentList) {
        List<CommentDto> dtoList = new ArrayList<>();
        for (Comment comment : commentList) {
            CommentDto commentDto = new CommentDto();
            BeanUtils.copyProperties(comment, commentDto, CommentDto.class);
            dtoList.add(commentDto);
        }
        return dtoList;
    }
}
