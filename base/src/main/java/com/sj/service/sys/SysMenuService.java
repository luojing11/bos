package com.sj.service.sys;

import com.sj.entity.sys.SysMenu;

import java.util.List;

public interface SysMenuService {
    //查询全部菜单
    public List<SysMenu> menuList(SysMenu sysMenu);

    public List<SysMenu> menuListUtil(SysMenu sysMenu);
}
