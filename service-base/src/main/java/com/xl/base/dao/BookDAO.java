package com.xl.base.dao;

import com.xl.base.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDAO extends JpaRepository<Book, Integer>,
        CrudRepository<Book, Integer>,
        PagingAndSortingRepository<Book, Integer>,
        BookSweeper {

    @Query(value = "SELECT DISTINCT press FROM Book")
    public List<String> findPressDistinct();

    public List<Book> findAllByOrderByBuytimeDesc();

    public Book findByName(String name);

    public Book findById(Integer id);

    @Query(value = "DELETE FROM Book WHERE name = ?1")
    @Modifying
    public void deleteBookByName(String name);

    @Query(value = "DELETE FROM Book WHERE id = ?1")
    @Modifying
    public void deleteBookById(Integer id);

}
