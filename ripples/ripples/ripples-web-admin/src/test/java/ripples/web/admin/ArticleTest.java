package ripples.web.admin;

import com.wave.ripples.commons.dto.PageInfo;
import com.wave.ripples.domain.Article;
import com.wave.ripples.web.admin.service.IArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})

public class ArticleTest {
    @Autowired
    IArticleService articleService;

    @Test
    public void testPage(){
        Map map = new HashMap();
        map.put("start",0);
        map.put("length",10);
        Article article = new Article();
        article.setCommentNum(1l);
        PageInfo page = articleService.page(1, 0, 10, article);
        System.out.println(page);
    }

    @Test
    public void testDelete(){
        articleService.delete(2l);
    }

    @Test
    public void testSelectById(){
        System.out.println(articleService.selectById(6l));
    }
}
