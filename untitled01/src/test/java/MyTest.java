import com.xiaochen.dao.Book;
import com.xiaochen.dao.Orders;
import com.xiaochen.dao.User;
import com.xiaochen.service.UserService;
import com.xiaochen.service.UserService1;
import com.xiaochen.内部bean.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author en
 * @Date 2021/7/2 14:47
 */
public class MyTest {
    @Test
    public void UserTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void BookTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void OrdersTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
    }

    //    名称空间注入
    @Test
    public void BookTest1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book bookO = context.getBean("bookP", Book.class);
        System.out.println(bookO);
    }

    //    注入外部bean
    @Test
    public void UserServiceTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    //    内部bean
    @Test
    public void EmpTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    //    级联赋值
    @Test
    public void EmpTest1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Emp emp = context.getBean("emp1", Emp.class);
        System.out.println(emp);
    }

    //    工厂bean
    @Test
    public void MyBeanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Emp myBean = context.getBean("myBean", Emp.class);
        System.out.println(myBean);
    }
    @Test
    public void UserService1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService1 userService1 = context.getBean("userService1", UserService1.class);
        userService1.add();
    }
}