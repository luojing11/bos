package com.sj;

import com.sj.entity.sys.SysMenu;
import com.sj.entity.sys.SysRole;
import com.sj.entity.sys.SysUser;
import com.sj.mapper.sys.SysUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseApplicationTests {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testFindUserByNameAndRoleAndMenu(){
        List<SysUser> list = sysUserMapper.findUserByNameAndRoleAndMenu("admin");
        for(SysUser user :list){
            System.out.println("用户名："+user.getUsername());
            for(SysRole role : user.getRoles()){
                System.out.println("\t\t角色名："+role.getName());
                for (SysMenu menu :role.getMenus()){
                    System.out.println("\t\t\t\t权限名："+menu.getName());
                }
            }
        }
    }
}
