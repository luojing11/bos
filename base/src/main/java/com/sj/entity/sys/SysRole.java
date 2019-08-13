package com.sj.entity.sys;

import com.sj.entity.sys.SysMenu;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class SysRole implements Serializable {
    private  List<SysMenu> menus=new ArrayList<>();

    private Long id;

    private String name;

    private String remark;

    private String createBy;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createTime;

    private String lastUpdateBy;

    private Date lastUpdateTime;

    private Byte delFlag;

    private static final long serialVersionUID = 1L;

}