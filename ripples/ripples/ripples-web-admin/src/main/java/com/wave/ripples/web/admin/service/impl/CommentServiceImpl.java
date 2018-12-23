package com.wave.ripples.web.admin.service.impl;

import com.wave.ripples.domain.Comment;
import com.wave.ripples.web.admin.mapper.ICommentMapper;
import com.wave.ripples.web.admin.service.ICommentService;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl extends BaseServiceImpl<Comment, ICommentMapper> implements ICommentService {

}
