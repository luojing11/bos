package com.sj.mapper.sys;

import com.sj.entity.sys.SysUser;
import com.sj.entity.sys.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface SysUserMapper {
    //根据登录用户去查用户id
    public SysUser userId(String username);
    /**
     * 根据用户名查询用户角色和权限
     * @param username 用户名
     * @return
     */
    public List<SysUser> findUserByNameAndRoleAndMenu(String username);

    public List<SysUser> UserList();

    public List<String> findUserRoles(String username);

    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}