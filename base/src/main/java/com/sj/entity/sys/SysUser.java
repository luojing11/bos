package com.sj.entity.sys;

import com.sj.entity.sys.SysRole;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class SysUser implements Serializable {
    private List<SysRole> roles=new ArrayList<>();//角色集合

    private Long id;

    private String username;

    private String password;

    private String salt;

    private String email;

    private String mobile;

    private Byte status;

    private Long deptId;

    private String createBy;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createTime;

    private String lastUpdateBy;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date lastUpdateTime;

    private Byte delFlag;

    private String introduction;

    private String avatar;

    private static final long serialVersionUID = 1L;


}