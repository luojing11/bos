package com.sj.controller.sys;

import com.sj.entity.sys.SysUser;
import com.sj.service.sys.SysUserService;
import com.sj.util.ResponseResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class SysUserController {
    //依赖注入业务类
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("info")
    public ResponseResult info(String token){
        // 根据用户名查询用户信息
       // SysUser user = sysUserService.findUserByUserName(token);
        // 根据用户名查询角色信息
      //  List<String> roles = sysUserService.findUserRoles(token);
        //获取登录的主题
        Subject subject=SecurityUtils.getSubject();
        Session session=subject.getSession();
        System.out.println("=="+subject.getSession().getId().toString());
        ResponseResult result = new ResponseResult();
        if (token.equals(subject.getSession().getId().toString())){
              //从shiro的session里保存用户的信息
             SysUser loginUser= (SysUser) session.getAttribute("USER_SESSION");
             //获取角色字符串
            List<String> roles = (List<String>) session.getAttribute("roles");
             if (loginUser!=null){
                 roles=sysUserService.findUserRoles(loginUser.getUsername());
                 result.getData().put("roles",roles);
                 result.getData().put("introduction",loginUser.getIntroduction());
                 result.getData().put("avatar",loginUser.getAvatar());
                 result.getData().put("name",loginUser.getUsername());
                 return result;
             }
        }
        return  null;
    }

    @RequestMapping("login")
    public ResponseResult login(SysUser sysUser){
        ResponseResult result = new ResponseResult();
        UsernamePasswordToken token=new UsernamePasswordToken(sysUser.getUsername(),sysUser.getPassword());
        //获取主题
        Subject subject= SecurityUtils.getSubject();
        //调用登录的方法
        subject.login(token);
        //返回前台唯一的token,唯一标识符
        result.getData().put("token",subject.getSession().getId());
        return result;

    }

    @RequestMapping("list")
    @RequiresPermissions("user:list")
    public ResponseResult UserList(SysUser sysUser,Integer page, Integer limit){
        ResponseResult result = new ResponseResult();
       // PageHelper.startPage(page,limit);
      Map map =sysUserService.UserList(sysUser.getUsername(),page,limit);
       result.getData().putAll(map);
       return  result;
    }

    @RequestMapping("add")
    @RequiresPermissions("user:add")
    public ResponseResult UserAdd(SysUser sysUser,String token){
        ResponseResult result=new ResponseResult();
        if (sysUser!=null&&sysUser.getUsername()!=null){
            List<SysUser> list=sysUserService.listUser(sysUser);
            for (SysUser user:list){
                if (user.getUsername().equals(sysUser.getUsername())){
                    result.getData().put("title","失败");
                    result.getData().put("message","用户已存在");
                    return  result;
                }
            }

        }
        sysUserService.UserAdd(sysUser,token);
        result.getData().put("message","添加成功");
        result.getData().put("title","成功");
        return result;
    }

    @RequestMapping("deleteUser")
    @RequiresPermissions("user:delete")
    public ResponseResult deleteUser(Long id,String token,SysUser sysUser){
        ResponseResult result=new ResponseResult();
//       if (sysUser!=null&&sysUser.getUsername().equals("admin")){
//           result.getData().put("title","失败");
//           result.getData().put("message","没有权限");
//           return result;
//       }
       sysUserService.deleteUser(id);
       result.getData().put("message","成功");
       result.getData().put("title","删除成功");
       return result;
    }

    //修改
    @RequestMapping("updateUser")
    @RequiresPermissions("user:update")
    public ResponseResult updateUser(SysUser sysUser){
        if (sysUser!=null){
            sysUserService.updateUser(sysUser);
            ResponseResult result=new ResponseResult();
            result.getData().put("message","修改成功");
            return result;
        }
        return  null;
    }

    @RequestMapping("logout")
    public ResponseResult logout(){
        ResponseResult result = new ResponseResult();
        Subject subject = SecurityUtils.getSubject();
        // 只需调用shiro的logout方法就可以了
        subject.logout();
        return result;
    }


}
