package com.sj.controller.sys;

import com.sj.entity.sys.SysDept;
import com.sj.entity.sys.SysMenu;
import com.sj.service.sys.SysDeptService;
import com.sj.service.sys.SysMenuService;
import com.sj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("menu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("list")
    public ResponseResult menuList(SysMenu sysMenu){
        List<SysMenu> list=sysMenuService.menuList(sysMenu);
        ResponseResult result=new ResponseResult();
        result.getData().put("total",list.size());
        result.getData().put("items",list);
        return  result;
    }

    @RequestMapping("listUtil")
    public ResponseResult listUtil(SysMenu sysMenu){
        List<SysMenu> list=sysMenuService.menuListUtil(sysMenu);
        ResponseResult result=new ResponseResult();
        result.getData().put("total",list.size());
        result.getData().put("items",list);
        return  result;
    }

//    @RestController
//    @RequestMapping("dept")
//    public static class SysDeptController {
//
//        @Autowired
//         private SysDeptService sysDeptService;
//
//        @RequestMapping("groupDept")
//        public ResponseResult groupDept(){
//            ResponseResult result=new ResponseResult();
//            result.getData().put("deptList",sysDeptService.groupDept());
//            return result;
//        }
//
//        //查询全部
//        @RequestMapping("deptList")
//        public ResponseResult deptList(SysDept sysDept, Integer page, Integer limit){
//            ResponseResult result=new ResponseResult();
//            Map map=sysDeptService.deptList(sysDept,page,limit);
//            result.getData().putAll(map);
//            return  result;
//        }
//
//        //添加部门
//        @RequestMapping("deptAdd")
//        public ResponseResult deptAdd(SysDept sysDept){
//            ResponseResult result=new ResponseResult();
//            sysDeptService.deptAdd(sysDept);
//            result.getData().put("message","添加成功");
//            return result;
//        }
//
//        //修改部门
//        @RequestMapping("deptUpdate")
//        public ResponseResult deptUpdate(SysDept sysDept){
//           ResponseResult result= new ResponseResult();
//           sysDeptService.deptUpdate(sysDept);
//           result.getData().put("message","修改成功");
//           return result;
//        }
//
//        //删除
//        @RequestMapping("deleteDept")
//        public ResponseResult deleteDept(SysDept sysDept){
//            ResponseResult result=new ResponseResult();
//            sysDeptService.deptDelete(sysDept);
//            result.getData().put("message","修改成功");
//            return result;
//        }
//
//
//    }
}
