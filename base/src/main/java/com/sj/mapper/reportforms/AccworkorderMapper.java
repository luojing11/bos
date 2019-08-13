package com.sj.mapper.reportforms;

import com.sj.entity.reportforms.Accworkorder;
import com.sj.entity.reportforms.AccworkorderExample;
import com.sj.entity.reportforms.Reportforms;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccworkorderMapper {

    //查询工单表成功的
    @Select("SELECT COUNT(ID) FROM acc_workorder WHERE DATE_FORMAT( WorkGenerationTime, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) and PickupStatus=2")
    public int succeedList();

    //查询工单表失败的
    @Select("SELECT COUNT(ID) FROM acc_workorder WHERE DATE_FORMAT( WorkGenerationTime, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) and PickupStatus=0")
    public int defeatedList();

    //查询当前是第几月
    @Select("select MONTH(CURDATE())")
    public int dayList();

    //向report_forms表里面修改数据
    public int updateReportforms(Reportforms reportforms);

    int countByExample(AccworkorderExample example);

    int deleteByExample(AccworkorderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Accworkorder record);

    int insertSelective(Accworkorder record);

    List<Accworkorder> selectByExample(AccworkorderExample example);

    Accworkorder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Accworkorder record, @Param("example") AccworkorderExample example);

    int updateByExample(@Param("record") Accworkorder record, @Param("example") AccworkorderExample example);

    int updateByPrimaryKeySelective(Accworkorder record);

    int updateByPrimaryKey(Accworkorder record);
}