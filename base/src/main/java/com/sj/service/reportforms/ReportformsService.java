package com.sj.service.reportforms;

import com.sj.entity.reportforms.Reportforms;

import java.util.List;

public interface ReportformsService {

    public List<Integer> selectDefeated();
    public List<Integer> selectSucceed();
    public String[] selectWattname();
    ///向report_forms表里面修改数据
    public int updateReportforms(Reportforms reportforms);

    public List<Reportforms> selectReportforms();
}
