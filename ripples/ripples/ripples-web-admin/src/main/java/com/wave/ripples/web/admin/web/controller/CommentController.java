package com.wave.ripples.web.admin.web.controller;

import com.wave.ripples.domain.Comment;
import com.wave.ripples.web.admin.service.ICommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "comment")
public class CommentController extends BaseController<Comment, ICommentService>{

    /**
     * 评论列表
     * @return
     */
    @GetMapping(value = "list")
    public String commentList(){
        return "comment/list";
    }

    @GetMapping(value = "delete")
    public String delete(Comment comment){
        service.delete(comment.getCommentId());
        return "redirect:/comment/list";
    }
}
