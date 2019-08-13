package com.sj.controller.logistics;

import com.sj.entity.logistics.BiglogLogisticscontroltable;
import com.sj.entity.logistics.BiglogLogisticscontroltable2;
import com.sj.entity.sys.SysDept;
import com.sj.entity.sys.SysUser;
import com.sj.service.logistics.BiglogLogisticscontroltableService;
import com.sj.service.sys.SysUserService;
import com.sj.util.ResponseResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("logistics")
public class BiglogLogisticscontroltableController {

    @Autowired
    private BiglogLogisticscontroltableService biglogLogisticscontroltableService;

    @Autowired
    private SysUserService sysUserService;


    //查询物流全部
    @RequestMapping("listLogistics")
    public ResponseResult listLogistics(BiglogLogisticscontroltable biglogLogisticscontroltable,Integer page,Integer limit){
       ResponseResult result=new ResponseResult();
        String wn=biglogLogisticscontroltableService.selectWorkSheetNo();
        String wi=biglogLogisticscontroltableService.selectWaybillID();
        String i = wn;
        String ii=wi;
        String param = i.substring(3);
        String param1 = ii.substring(2);
        int s=Integer.parseInt(param);
        int s1=Integer.parseInt(param1);
        s=++s;
        s1=++s1;
        s=s==1000?1:s;
        s1=s1==1000?1:s1;//这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
        String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型
        String resluts1=s1>=10?(s1>=100?s1+"":"0"+s1):"00"+s1; // 计算 转型
        String MaxNo = "GZD"+resluts;
        String MaxNo1 = "FP"+resluts1;
       Map map=biglogLogisticscontroltableService.biglogLogisticscontroltableList(biglogLogisticscontroltable,page,limit);
        result.getData().putAll(map);
        result.getData().put("GZD",MaxNo);
        result.getData().put("FP",MaxNo1);
       return  result;
    }

    //添加成功
    @PostMapping("addLogistics")
    public  ResponseResult addLogistics(BiglogLogisticscontroltable biglogLogisticscontroltable){
        ResponseResult result=new ResponseResult();
        if (biglogLogisticscontroltable!=null){
            Subject subject= SecurityUtils.getSubject();
            Session session=subject.getSession();
            SysUser loginUser= (SysUser) session.getAttribute("USER_SESSION");
            SysUser sysUser=sysUserService.userId(loginUser.getUsername());
            biglogLogisticscontroltable.setCtype(true);
            biglogLogisticscontroltable.setInputdate(new Date());
            biglogLogisticscontroltable.setInputperson(sysUser.getId().intValue());
            biglogLogisticscontroltable.setInputcompany(sysUser.getId().intValue());
            biglogLogisticscontroltableService.biglogLogisticscontroltableAdd(biglogLogisticscontroltable);
            result.getData().put("message","添加成功");
            result.getData().put("title","成功");
            return  result;
        }
        return  null;
    }

    //修改
    @RequestMapping("updateLogistics")
    public ResponseResult updateLogistics(BiglogLogisticscontroltable2 biglogLogisticscontroltable2, SysUser user, SysDept dept){
        ResponseResult result=new ResponseResult();
        if (biglogLogisticscontroltable2!=null){
            biglogLogisticscontroltableService.biglogLogisticscontroltableUpdate(biglogLogisticscontroltable2);
            result.getData().put("message","修改成功");
            result.getData().put("title","成功");
            return  result;
        }
        result.getData().put("message","修改失败");
        result.getData().put("title","失败");
        return  result;
    }

    @RequestMapping("deleteLogistics")
    public ResponseResult deleteLogistics(Integer id){
        ResponseResult result=new ResponseResult();
        if (id!=null){
            biglogLogisticscontroltableService.biglogLogisticscontroltableDelete(id);
            result.getData().put("message","删除成功");
            result.getData().put("title","成功");
            return result;
        }
        result.getData().put("message","删除失败");
        result.getData().put("title","失败");
        return result;
    }
}
