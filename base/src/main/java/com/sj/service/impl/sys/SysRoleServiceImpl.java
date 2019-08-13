package com.sj.service.impl.sys;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sj.entity.sys.SysRole;
import com.sj.entity.sys.SysRoleExample;
import com.sj.mapper.sys.SysRoleMapper;
import com.sj.service.sys.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> listRole(SysRole sysRole) {
        Map<String,Object> map=new HashMap<>();
        SysRoleExample example=new SysRoleExample();
        SysRoleExample.Criteria criteria=example.createCriteria();
        List<SysRole> list=sysRoleMapper.selectByExample(example);
        return list;
    }

    @Override
    public Map roleList(SysRole sysRole,Integer page,Integer limit) {
        Map<String,Object> map=new HashMap<>();
        SysRoleExample example=new SysRoleExample();
        SysRoleExample.Criteria criteria=example.createCriteria();
        criteria.andDelFlagEqualTo((byte)0);
        if (sysRole!=null){
            if (sysRole.getName()!=null){
                criteria.andNameLike("%"+sysRole.getName()+"%");
            }
        }
        Page p= PageHelper.startPage(page,limit,true);
        sysRoleMapper.selectByExample(example);
        map.put("items",p.getResult());
        map.put("total",p.getTotal());
        return map;
    }

    @Override
    public void roleAdd(SysRole sysRole) {
        sysRoleMapper.insertSelective(sysRole);
    }

    @Override
    public void roleUpdate(SysRole sysRole) {
        sysRoleMapper.updateByPrimaryKeySelective(sysRole);
    }

    @Override
    public void roleDelete(Long id) {
       //sysRole.setDelFlag(new Byte("-1"));
       sysRoleMapper.deleteByPrimaryKey(id);
    }
}
