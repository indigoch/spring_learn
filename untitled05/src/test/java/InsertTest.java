import com.chen.entity.Book;
import com.chen.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author en
 * @Date 2021/7/20 15:08
 */
public class InsertTest {
    @Test
    public void addTest() {
        Book book = new Book();
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        for (int i = 0; i < 100; i++) {
            book.setUsername(i + "");
            book.setUstatus(i + "");
            book.setUserId(i + "");
            bookService.addBook(book);
        }

    }

    @Test
    public void delTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService service = context.getBean("bookService", BookService.class);
        service.delBook("2");
    }

    @Test
    public void upTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService serviceBook = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUsername("test");
        book.setUstatus("1");
        book.setUserId("2");
        serviceBook.upBook(book);
    }

    @Test
    public void countTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService serviceBook = context.getBean("bookService", BookService.class);
        System.out.println(serviceBook.findCount());
    }

    @Test
    public void findBookTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService serviceBook = context.getBean("bookService", BookService.class);
        for (int i = 0; i < 100; i++) {
            Book book = serviceBook.findBook(Integer.toString(i));
            System.out.println(book.toString());
        }
    }

    @Test
    public void findAllBookTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService serviceBook = context.getBean("bookService", BookService.class);
        List<Book> allBook = serviceBook.findAllBook();
        System.out.println(allBook);
    }
}
