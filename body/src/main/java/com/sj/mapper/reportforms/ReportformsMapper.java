package com.sj.mapper.reportforms;

import com.sj.entity.reportforms.Reportforms;
import com.sj.entity.reportforms.ReportformsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportformsMapper {
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