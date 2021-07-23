import com.xiaochen.config.SpringConfig;
import com.xiaochen.dao.Book;
import com.xiaochen.dao.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author en
 * @Date 2021/7/5 10:44
 */
public class MyTest {
    @Test
    public void UserProxyTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDaoImpl userDaoImpl = context.getBean("userDaoImpl", UserDaoImpl.class);
        userDaoImpl.add();
    }
    @Test
    public void UserProxyTest1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDaoImpl userDaoImpl = context.getBean("userDaoImpl", UserDaoImpl.class);
        userDaoImpl.add();
    }
    @Test
    public void BookProxyTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
