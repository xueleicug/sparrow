package com.xl.base.dao;

import com.xl.base.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookDAO extends JpaRepository<Book, Integer> {

    @Query("SELECT DISTINCT press FROM Book")
    public List<String> findPressDistinct();

    public List<Book> findAllByOrderByBuytimeDesc();
}
