package com.sj.mapper.reportforms;

import com.sj.entity.reportforms.Accworkorder;
import com.sj.entity.reportforms.AccworkorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccworkorderMapper {
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