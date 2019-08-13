package com.sj.entity.logistics;

import java.io.Serializable;
import java.util.Date;

public class BiglogLogisticscontroltable implements Serializable {
    private Integer id;

    private String worksheetno;

    private Integer ctype;

    private String corporation;

    private String waybillid;

    private String remarks;

    private Integer inputperson;

    private Date inputdate;

    private Integer inputcompany;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public Integer getCtype() {
        return ctype;
    }

    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation == null ? null : corporation.trim();
    }

    public String getWaybillid() {
        return waybillid;
    }

    public void setWaybillid(String waybillid) {
        this.waybillid = waybillid == null ? null : waybillid.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getInputperson() {
        return inputperson;
    }

    public void setInputperson(Integer inputperson) {
        this.inputperson = inputperson;
    }

    public Date getInputdate() {
        return inputdate;
    }

    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    public Integer getInputcompany() {
        return inputcompany;
    }

    public void setInputcompany(Integer inputcompany) {
        this.inputcompany = inputcompany;
    }
}