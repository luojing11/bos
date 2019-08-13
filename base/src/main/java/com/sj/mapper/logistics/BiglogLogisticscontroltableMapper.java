package com.sj.mapper.logistics;

import com.sj.entity.logistics.BiglogLogisticscontroltable;
import com.sj.entity.logistics.BiglogLogisticscontroltable2;
import com.sj.entity.logistics.BiglogLogisticscontroltableExample;
import com.sj.entity.sys.SysDept;
import com.sj.entity.sys.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BiglogLogisticscontroltableMapper {

    //查询工作单号
    @Select("select WorkSheetNo from biglog_logisticscontroltable order by id desc limit 1")
    public String selectWorkSheetNo();

    //查询货票号
    @Select("select WaybillID from biglog_logisticscontroltable order by id desc limit 1")
    public  String selectWaybillID();
    //根据用户去查部门
    public SysDept deptId(Integer id);

    //查询物流员工部门表
    public List<BiglogLogisticscontroltable> biglogLogisticscontroltableUserDept(BiglogLogisticscontroltable biglogLogisticscontroltable);

    int countByExample(BiglogLogisticscontroltableExample example);

    int deleteByExample(BiglogLogisticscontroltableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BiglogLogisticscontroltable record);

    int insertSelective(BiglogLogisticscontroltable record);

    List<BiglogLogisticscontroltable> selectByExample(BiglogLogisticscontroltableExample example);

    BiglogLogisticscontroltable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BiglogLogisticscontroltable record, @Param("example") BiglogLogisticscontroltableExample example);

    int updateByExample(@Param("record") BiglogLogisticscontroltable record, @Param("example") BiglogLogisticscontroltableExample example);

    int updateByPrimaryKeySelective(BiglogLogisticscontroltable2 record);

    int updateByPrimaryKey(BiglogLogisticscontroltable record);
}