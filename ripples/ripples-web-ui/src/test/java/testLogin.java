import com.wave.ripples.web.ui.entity.TbMember;
import com.wave.ripples.web.ui.service.TbMemberLoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-context-druid.xml","classpath:spring-context-mybatis.xml"})
public class testLogin {

    private TbMemberLoginService tbMemberLoginService;
    @Test
    public void login(){
        TbMember login = tbMemberLoginService.login("123", "13600112243");
        System.out.println(login);

    }
}
