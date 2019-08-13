package com.sj.mapper.reportforms;

import com.sj.entity.reportforms.Reportforms;
import com.sj.entity.reportforms.ReportformsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ReportformsMapper {
    //查询失败的
    @Select("select defeated from report_forms")
    public List<Integer> selectDefeated();
    //查询成功的
    @Select("select succeed from report_forms")
    public List<Integer> selectSucceed();
    //查询月份
    @Select("select wattname from report_forms")
    public String[] selectWattname();
    //修改Reportforms
    public int updateReportforms(Reportforms reportforms);
    //查询
    @Select("select id,wattname,succeed,defeated from report_forms")
    public List<Reportforms> selectReportforms();

    int countByExample(ReportformsExample example);

    int deleteByExample(ReportformsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Reportforms record);

    int insertSelective(Reportforms record);

    List<Reportforms> selectByExample(ReportformsExample example);

    Reportforms selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Reportforms record, @Param("example") ReportformsExample example);

    int updateByExample(@Param("record") Reportforms record, @Param("example") ReportformsExample example);

    int updateByPrimaryKeySelective(Reportforms record);

    int updateByPrimaryKey(Reportforms record);
}