package com.sj.service.impl.sys;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sj.entity.sys.SysDept;
import com.sj.entity.sys.SysDeptExample;
import com.sj.mapper.sys.SysDeptMapper;
import com.sj.service.sys.SysDeptService;
import com.sj.util.SysDeptGroupUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Override
    public List<SysDept> groupDept() {
        SysDeptExample example=new SysDeptExample();
        SysDeptExample.Criteria criteria=example.createCriteria();
        criteria.andDelFlagEqualTo(new Byte("0"));
        List<SysDept> list=sysDeptMapper.selectByExample(example);
        SysDeptGroupUtil sysDeptGroupUtil=new SysDeptGroupUtil();
        list=sysDeptGroupUtil.getFirstDept(list);
        return list;
    }

    @Override
    public Map deptList(SysDept sysDept,Integer page, Integer limit) {
        Map<String,Object> map=new HashMap<>();
        SysDeptExample example=new SysDeptExample();
        SysDeptExample.Criteria criteria=example.createCriteria();
        criteria.andDelFlagEqualTo((byte) 0);
        if (sysDept!=null&&sysDept.getName()!=null){
            criteria.andNameLike("%"+sysDept.getName()+"%");
        }
        Page p= PageHelper.startPage(page,limit,true);
        List<SysDept> list=sysDeptMapper.selectByExample(example);
        for (SysDept dept:list){
            for (SysDept dept1:list){
                if (dept.getParentId()==dept1.getId()){
                    dept.setParentStr(dept1.getName());
                }
                if (dept.getParentId()==0){
                    dept.setParentStr("无");
                }
            }
        }
        map.put("items",list);
        map.put("total",p.getTotal());
        return map;
    }

    @Override
    public void deptAdd(SysDept sysDept) {
        sysDeptMapper.insertSelective(sysDept);
    }

    @Override
    public void deptDelete(SysDept sysDept) {
        sysDept.setDelFlag((byte)-1);
        sysDeptMapper.updateByPrimaryKeySelective(sysDept);
    }

    @Override
    public void deptUpdate(SysDept sysDept) {
        sysDeptMapper.updateByPrimaryKeySelective(sysDept);
    }
}
