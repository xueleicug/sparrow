package com.xl.base.entity;

import com.xl.bussiness.base.entity.IdEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Table(name = "book")
@EqualsAndHashCode(callSuper = false)
public class Book extends IdEntity {

    private static final long serialVersionUID = -1505466158512344867L;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "translator")
    private String translator;

    @Column(name = "description")
    private String description;

    @Column(name = "press")
    private String press;

    @Column(name = "category")
    private String category;

    @Column(name = "press_time")
    private Date presstime;

    @Column(name = "buy_time")
    private String buytime;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "word_count")
    private Integer wordcount;

    @Column(name = "price")
    private Float price;

}
