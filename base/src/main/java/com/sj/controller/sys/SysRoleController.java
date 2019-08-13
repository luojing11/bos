package com.sj.controller.sys;

import com.sj.entity.sys.SysRole;
import com.sj.service.sys.SysRoleService;
import com.sj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("role")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("list")
    public ResponseResult roleList(SysRole sysRole,Integer page, Integer limit){
        ResponseResult result=new ResponseResult();
         Map map=sysRoleService.roleList(sysRole,page,limit);
        result.getData().putAll(map);
        return result;

    }

    //添加
    @RequestMapping("roleAdd")
    public ResponseResult roleAdd(SysRole sysRole){
        ResponseResult result =new ResponseResult();
        List<SysRole> list=sysRoleService.listRole(sysRole);
        for (SysRole role:list){
            if (sysRole.getName().equals(role.getName())){
                result.getData().put("message","角色已存在");
                result.getData().put("title","失败");
                return  result;
            }
        }
        sysRoleService.roleAdd(sysRole);
        result.getData().put("message","添加成功");
        result.getData().put("title","成功");
        return  result;
    }

    //修改角色
    @RequestMapping("roleUpdate")
    public  ResponseResult roleUpdate(SysRole sysRole){
        sysRoleService.roleUpdate(sysRole);
        ResponseResult result=new ResponseResult();
        result.getData().put("message","修改成功");
        return  result;
    }

    //删除角色
    @RequestMapping("roleDelete")
    public  ResponseResult roleDelete(Long id){
        sysRoleService.roleDelete(id);
        ResponseResult result=new ResponseResult();
        return  result;
    }
}
