package com.chen.dao;

import com.chen.entity.Book;

import java.util.List;

/**
 * @Author en
 * @Date 2021/7/20 14:43
 */
public interface BookDao {
    void add(Book book);
    void del(String id);
    void up(Book book);
    int count();
    Book fdBook(String id);
    List<Book> fdAllBook();
}
