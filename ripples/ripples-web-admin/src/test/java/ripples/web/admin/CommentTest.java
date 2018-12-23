package ripples.web.admin;


import com.wave.ripples.commons.dto.PageInfo;
import com.wave.ripples.domain.Article;
import com.wave.ripples.domain.Comment;
import com.wave.ripples.web.admin.mapper.ICommentMapper;
import com.wave.ripples.web.admin.service.ICommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class CommentTest {
    @Autowired
    ICommentService commentService;

    @Test
    public void pageTest(){
        Map map = new HashMap();
        map.put("start",0);
        map.put("length",10);
        Comment comment = new Comment();
        PageInfo<Comment> page = commentService.page(1, 0, 10, comment);
        System.out.println(page);
    }

    @Test
    public void testDelete(){
        commentService.delete(1l);
    }
}