package com.xl.bussiness.base.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Data
public class IdEntity implements Serializable {

    private static final long serialVersionUID = 2384080237196346611L;

    @Column(name = "id", unique = true, nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
