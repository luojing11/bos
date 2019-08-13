package com.sj.service.impl.reportforms;

import com.sj.entity.reportforms.Accworkorder;
import com.sj.entity.reportforms.Reportforms;
import com.sj.mapper.reportforms.AccworkorderMapper;
import com.sj.mapper.reportforms.ReportformsMapper;
import com.sj.service.reportforms.AccworkorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class AccworkorderServiceImpl implements AccworkorderService {

    @Autowired
    private AccworkorderMapper accworkorderMapper;

    @Override
    public int succeedList() {
        return accworkorderMapper.succeedList();
    }

    @Override
    public int defeatedList() {
        return accworkorderMapper.defeatedList();
    }

    @Override
    public int dayList() {
        return accworkorderMapper.dayList();
    }


}
