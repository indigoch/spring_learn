import com.xiaochen.config.SpringConfig;
import com.xiaochen.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author en
 * @Date 2021/7/3 11:15
 */
public class MyTest {
    @Test
    public void UserServiceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void UserServiceTest1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

}
