package com.sj.service.impl.sys;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sj.entity.sys.SysUser;
import com.sj.entity.sys.SysUserExample;
import com.sj.mapper.sys.SysUserMapper;
import com.sj.service.sys.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser userId(String username) {
        SysUser sysUser=sysUserMapper.userId(username);
        return sysUser;
    }

    @Override
    public void updateUser(SysUser sysUser) {
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public void deleteUser(Long id) {
        SysUser sysUser=new SysUser();
        sysUser.setId(id);
        sysUser.setDelFlag(new Byte("-1"));
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public void UserAdd(SysUser sysUser,String token) {
        sysUser.setStatus((byte)1);
        sysUser.setLastUpdateBy(token);
        sysUser.setLastUpdateTime(new Date());
        sysUserMapper.insertSelective(sysUser);
    }

    @Override
    public List<SysUser> listUser(SysUser sysUser) {
        Map<String,Object> map=new HashMap<>();
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        if(sysUser!=null&&sysUser.getUsername()!=""){
            criteria.andUsernameLike("%"+sysUser.getUsername()+"%");
            // 还可以添加其他属性的条件
        }
        List<SysUser> list=sysUserMapper.selectByExample(example);
        return list;
    }

    @Override
    public Map UserList(String name, Integer page, Integer limit) {
        Map<String,Object> map=new HashMap<>();
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andDelFlagEqualTo((byte) 0);
        if(name!=null&&name!=""){
                criteria.andUsernameLike("%"+name+"%");
            // 还可以添加其他属性的条件
        }
        Page p= PageHelper.startPage(page,limit,true);
        sysUserMapper.selectByExample(example);
        map.put("items",p.getResult());
        map.put("total",p.getTotal());
        return map;
    }

    @Override
    public SysUser login(SysUser sysUser) {
        SysUserExample example=new SysUserExample();
        SysUserExample.Criteria criteria=example.createCriteria();
        criteria.andUsernameEqualTo(sysUser.getUsername());
        criteria.andPasswordEqualTo(sysUser.getPassword());
        List<SysUser> list =  sysUserMapper.selectByExample(example);
        if(list!=null && list.size()==1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public SysUser findUserByUserName(String username) {
        SysUserExample example=new SysUserExample();
        SysUserExample.Criteria criteria=example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<SysUser> list=sysUserMapper.selectByExample(example);
        if(list!=null && list.size()==1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<String> findUserRoles(String username) {
        List<String> roles=sysUserMapper.findUserRoles(username);
        return roles;
    }

    @Override
    public SysUser findUserByNameAndRoleAndMenu(String username) {
        List<SysUser> list = sysUserMapper.findUserByNameAndRoleAndMenu(username);
        if(list!=null && list.size()==1){
            return list.get(0);
        }
        return null;
    }
}
