package com.sj.entity.logistics;

import com.sj.entity.sys.SysDept;
import com.sj.entity.sys.SysUser;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


@Data
public class BiglogLogisticscontroltable implements Serializable {
    private String username;

    private SysUser sysUser;

    private SysDept sysDept;

    private Integer id;

    private String worksheetno;//工作单号

    private Boolean ctype;//类型

    private String corporation;//代理公司

    private String waybillid;//货票号


    private String remarks;//备注

    private Integer inputperson;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date inputdate;

    private Integer inputcompany;

    private static final long serialVersionUID = 1L;


}