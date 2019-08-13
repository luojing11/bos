package com.sj.service.impl.sys;

import com.sj.entity.sys.SysMenu;
import com.sj.entity.sys.SysMenuExample;
import com.sj.mapper.sys.SysMenuMapper;
import com.sj.service.sys.SysMenuService;
import com.sj.util.TreeNodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> menuList(SysMenu sysMenu) {
        SysMenuExample example=new SysMenuExample();
        SysMenuExample.Criteria criteria=example.createCriteria();
        if (sysMenu!=null){
            if (sysMenu.getName()!=null){
                criteria.andNameLike("%"+sysMenu.getName()+"%");
            }
        }
        List<SysMenu> list=sysMenuMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<SysMenu> menuListUtil(SysMenu sysMenu) {
        SysMenuExample example=new SysMenuExample();
        SysMenuExample.Criteria criteria=example.createCriteria();
        if (sysMenu!=null){
            if (sysMenu.getName()!=null){
                criteria.andNameLike("%"+sysMenu.getName()+"%");
            }
        }
        List<SysMenu> list=sysMenuMapper.selectByExample(example);
        TreeNodeUtil treeNodeUtil=new TreeNodeUtil();
        list=treeNodeUtil.getFatherMenu(list);
        return list;
    }
}
