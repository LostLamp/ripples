package ripples.web.admin;

import com.wave.ripples.commons.dto.PageInfo;
import com.wave.ripples.domain.Article;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class MemberTest {

    @Autowired
    IUserService userService;

    @Test
    public void testPage(){
        Map map = new HashMap();
        map.put("start",0);
        map.put("length",10);
        Member member = new Member();
        PageInfo page = userService.page(1, 0, 10, member);
        System.out.println(page);
    }

    @Test
    public void testDelete(){
        userService.delete(2l);
    }
}
