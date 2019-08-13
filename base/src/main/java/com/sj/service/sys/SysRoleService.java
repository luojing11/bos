package com.sj.service.sys;

import com.sj.entity.sys.SysRole;

import java.util.List;
import java.util.Map;

public interface SysRoleService {
    public List<SysRole> listRole(SysRole sysRole);

    //查询所有角色
    public Map roleList(SysRole sysRole, Integer page, Integer limit);

    //添加角色
    public void roleAdd(SysRole sysRole);

    //修改角色
    public  void roleUpdate(SysRole sysRole);

    //删除角色
    public  void  roleDelete(Long id);
}
