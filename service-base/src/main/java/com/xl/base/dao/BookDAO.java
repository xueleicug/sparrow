package com.xl.base.dao;

import com.xl.base.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookDAO extends JpaRepository<Book, Integer>, CrudRepository<Book, Integer> {

    @Query(value = "SELECT DISTINCT press FROM Book")
    public List<String> findPressDistinct();

    public List<Book> findAllByOrderByBuytimeDesc();

    public Book findByName(String name);

    @Query(value = "DELETE from Book WHERE name=?1")
    @Modifying
    public void deleteBookByName(String name);

}
