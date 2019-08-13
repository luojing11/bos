package com.sj.entity.sys;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class SysDept implements Serializable {
    private List<SysDept> items=new ArrayList<SysDept>();

    private Long id;

    private String name;

    private String parentStr;

    private Long parentId;

    private Integer orderNum;

    private String createBy;

    private Date createTime;

    private String lastUpdateBy;

    private Date lastUpdateTime;

    private Byte delFlag;

    private static final long serialVersionUID = 1L;

}