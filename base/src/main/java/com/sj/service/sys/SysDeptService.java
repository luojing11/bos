package com.sj.service.sys;

import com.sj.entity.sys.SysDept;

import java.util.List;
import java.util.Map;

public interface SysDeptService {
    //分组查询
    public List<SysDept> groupDept();

    //查询全部
    public Map deptList(SysDept sysDept, Integer page, Integer limit);

    //添加部门
    public void  deptAdd(SysDept sysDept);

    //删除部门
    public void deptDelete(SysDept sysDept);

    //修改部门
    public void deptUpdate(SysDept sysDept);


}
