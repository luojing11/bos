package com.sj.service.impl.reportforms;

import com.sj.entity.reportforms.Reportforms;
import com.sj.mapper.reportforms.ReportformsMapper;
import com.sj.service.reportforms.ReportformsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportformsServiceImpl implements ReportformsService {

    @Autowired
    private ReportformsMapper reportformsMapper;

    @Override
    public List<Integer> selectDefeated() {
        return reportformsMapper.selectDefeated();
    }

    @Override
    public List<Integer> selectSucceed() {
        return reportformsMapper.selectSucceed();
    }

    @Override
    public String[]selectWattname() {
        return reportformsMapper.selectWattname();
    }

    @Override
    public int updateReportforms(Reportforms reportforms) {
        return reportformsMapper.updateReportforms(reportforms);
    }

    @Override
    public List<Reportforms> selectReportforms() {
        return reportformsMapper.selectReportforms();
    }
}
