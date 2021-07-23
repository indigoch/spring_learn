package com.chen.service;

import com.chen.dao.BookDao;
import com.chen.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author en
 * @Date 2021/7/20 14:43
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book) {
        bookDao.add(book);
    }

    public void delBook(String id) {
        bookDao.del(id);
    }

    public void upBook(Book book) {
        bookDao.up(book);
    }

    public int findCount() {
        return bookDao.count();
    }
    public Book findBook(String id){
        return  bookDao.fdBook(id);
    }
    public List<Book> findAllBook(){
        return bookDao.fdAllBook();
    }
}
