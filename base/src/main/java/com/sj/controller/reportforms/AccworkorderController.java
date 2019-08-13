package com.sj.controller.reportforms;

import com.sj.entity.reportforms.Accworkorder;
import com.sj.entity.reportforms.Reportforms;
import com.sj.service.reportforms.AccworkorderService;
import com.sj.service.reportforms.ReportformsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AccworkorderController {


    @Autowired
    private AccworkorderService accworkorderService;

    @Autowired
    private ReportformsService reportformsService;

    //向统计表里面插入数据
    @Scheduled(cron="0 0 23 L * ?")
    public void  succeedAccworkorder(){
        System.out.println("Reportforms表里面插入数据开始");
        int su=accworkorderService.succeedList();
        int de=accworkorderService.defeatedList();
        int accDay=accworkorderService.dayList();
        Reportforms reportforms=new Reportforms();
        reportforms.setSucceed(su);
        reportforms.setDefeated(de);
        reportforms.setId(accDay);
        reportformsService.updateReportforms(reportforms);
    }


}
