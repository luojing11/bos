package com.sj.entity.reportforms;

import lombok.Data;

import java.io.Serializable;

@Data
public class Reportforms implements Serializable {
    private Integer id;

    private String wattname;

    private Integer succeed;

    private Integer defeated;

    private static final long serialVersionUID = 1L;

}