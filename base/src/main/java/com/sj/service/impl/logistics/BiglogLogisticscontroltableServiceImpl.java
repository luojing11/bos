package com.sj.service.impl.logistics;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sj.entity.logistics.BiglogLogisticscontroltable;
import com.sj.entity.logistics.BiglogLogisticscontroltable2;
import com.sj.entity.logistics.BiglogLogisticscontroltableExample;
import com.sj.entity.sys.SysRole;
import com.sj.entity.sys.SysUser;
import com.sj.mapper.logistics.BiglogLogisticscontroltableMapper;
import com.sj.service.logistics.BiglogLogisticscontroltableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BiglogLogisticscontroltableServiceImpl implements BiglogLogisticscontroltableService {
    @Autowired
    private BiglogLogisticscontroltableMapper biglogLogisticscontroltableMapper;

    @Override
    public String selectWorkSheetNo() {
        return  biglogLogisticscontroltableMapper.selectWorkSheetNo();
    }

    @Override
    public String selectWaybillID() {
        return biglogLogisticscontroltableMapper.selectWaybillID();
    }


    @Override
    public Map biglogLogisticscontroltableList(BiglogLogisticscontroltable biglogLogisticscontroltable, Integer page, Integer limit) {
        Map<String,Object> map=new HashMap<>();
//        BiglogLogisticscontroltableExample example=new BiglogLogisticscontroltableExample();
//        BiglogLogisticscontroltableExample.Criteria criteria=example.createCriteria();
//        if (biglogLogisticscontroltable!=null){
//            if (biglogLogisticscontroltable.getWorksheetno()!=null){
//                criteria.andWorksheetnoLike("%"+biglogLogisticscontroltable.getWorksheetno()+"%");
//            }
//            if (biglogLogisticscontroltable.getCorporation()!=null){
//                criteria.andCorporationLike("%"+biglogLogisticscontroltable.getCorporation()+"%");
//            }
//        }
        Page p= PageHelper.startPage(page,limit,true);
        biglogLogisticscontroltableMapper.biglogLogisticscontroltableUserDept(biglogLogisticscontroltable);
        map.put("items",p.getResult());
        map.put("total",p.getTotal());
        return map;
    }

    @Override
    public void biglogLogisticscontroltableAdd(BiglogLogisticscontroltable biglogLogisticscontroltable) {
        biglogLogisticscontroltableMapper.insertSelective(biglogLogisticscontroltable);
    }

    @Override
    public void biglogLogisticscontroltableUpdate(BiglogLogisticscontroltable2 biglogLogisticscontroltable) {
        biglogLogisticscontroltableMapper.updateByPrimaryKeySelective(biglogLogisticscontroltable);
    }

    @Override
    public void biglogLogisticscontroltableDelete(Integer id) {
        biglogLogisticscontroltableMapper.deleteByPrimaryKey(id);
    }
}
