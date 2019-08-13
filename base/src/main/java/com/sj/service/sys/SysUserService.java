package com.sj.service.sys;

import com.sj.entity.sys.SysUser;

import java.util.List;
import java.util.Map;

public interface SysUserService {

    //根据登录的用户去查id
    public SysUser userId(String username);

    //修改用户
    public void updateUser(SysUser sysUser);

    //删除用户
    public void deleteUser(Long id);

    //添加用户
    public void UserAdd(SysUser sysUser, String token);

    public List<SysUser> listUser(SysUser sysUser);
   /*
   * 查询全部以及分页
   * */
    public Map UserList(String name, Integer page, Integer limit);
    /**
     *
     * 用户登录
     * @param sysUser
     * @return
     */
    public SysUser login(SysUser sysUser);

   /**
     * 根据用户名查询用户信息
     * @return
     */
    public SysUser findUserByUserName(String username);

    /**
     * 根据用户名获得角色的集合
     * @param username
     * @return
     */
    public List<String> findUserRoles(String username);

    /**
     * 根据用户名查询用户角色和权限
     * @param username 用户名
     * @return
     */
    public SysUser findUserByNameAndRoleAndMenu(String username);
}
