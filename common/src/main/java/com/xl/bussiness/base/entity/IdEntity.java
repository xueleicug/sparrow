package com.xl.bussiness.base.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Data
public class IdEntity implements Serializable {

    private static final long serialVersionUID = 2384080237196346611L;

    @Column(name = "id")
    @Id
    private Integer id;
}
