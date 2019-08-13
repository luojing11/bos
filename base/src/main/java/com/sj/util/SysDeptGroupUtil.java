package com.sj.util;

import com.sj.entity.sys.SysDept;

import java.util.ArrayList;
import java.util.List;

//递归进行分组
public class SysDeptGroupUtil {

    //获取一级部门
    public List<SysDept> getFirstDept(List<SysDept> list){
        List<SysDept> deptList=new ArrayList<SysDept>();
        for (SysDept dept:list){
          if (dept.getParentId().longValue()==0){
              dept.setItems(getChildrenDept(dept.getId(),list));
              deptList.add(dept);
          }
        }
        return  deptList;
    }


    //递归调用所有的部门子集

    public List<SysDept> getChildrenDept(Long parentId,List<SysDept> list){
        List<SysDept> deptList=new ArrayList<SysDept>();
        for (SysDept dept:list){
            if (dept.getParentId().longValue()==0){
                continue;
            }
            if (dept.getParentId().longValue()==parentId)
            {
                dept.setItems(getChildrenDept(dept.getId(),list));
                deptList.add(dept);
            }
        }
        return  deptList;
    }
}
