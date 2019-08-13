package com.sj.entity.reportforms;

import java.io.Serializable;
import java.util.Date;

public class Accworkorder implements Serializable {
    private Integer id;

    private String businessnoticeno;

    private String customno;

    private String jobno;

    private Integer jobtype;

    private Integer pickupstatus;

    private Integer shortmessageint;

    private Date workgenerationtime;

    private Integer aftersinglenum;

    private Integer smallmembernum;

    private Integer pickupunit;

    private Date pickuptime;

    private String sortingcode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessnoticeno() {
        return businessnoticeno;
    }

    public void setBusinessnoticeno(String businessnoticeno) {
        this.businessnoticeno = businessnoticeno == null ? null : businessnoticeno.trim();
    }

    public String getCustomno() {
        return customno;
    }

    public void setCustomno(String customno) {
        this.customno = customno == null ? null : customno.trim();
    }

    public String getJobno() {
        return jobno;
    }

    public void setJobno(String jobno) {
        this.jobno = jobno == null ? null : jobno.trim();
    }

    public Integer getJobtype() {
        return jobtype;
    }

    public void setJobtype(Integer jobtype) {
        this.jobtype = jobtype;
    }

    public Integer getPickupstatus() {
        return pickupstatus;
    }

    public void setPickupstatus(Integer pickupstatus) {
        this.pickupstatus = pickupstatus;
    }

    public Integer getShortmessageint() {
        return shortmessageint;
    }

    public void setShortmessageint(Integer shortmessageint) {
        this.shortmessageint = shortmessageint;
    }

    public Date getWorkgenerationtime() {
        return workgenerationtime;
    }

    public void setWorkgenerationtime(Date workgenerationtime) {
        this.workgenerationtime = workgenerationtime;
    }

    public Integer getAftersinglenum() {
        return aftersinglenum;
    }

    public void setAftersinglenum(Integer aftersinglenum) {
        this.aftersinglenum = aftersinglenum;
    }

    public Integer getSmallmembernum() {
        return smallmembernum;
    }

    public void setSmallmembernum(Integer smallmembernum) {
        this.smallmembernum = smallmembernum;
    }

    public Integer getPickupunit() {
        return pickupunit;
    }

    public void setPickupunit(Integer pickupunit) {
        this.pickupunit = pickupunit;
    }

    public Date getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(Date pickuptime) {
        this.pickuptime = pickuptime;
    }

    public String getSortingcode() {
        return sortingcode;
    }

    public void setSortingcode(String sortingcode) {
        this.sortingcode = sortingcode == null ? null : sortingcode.trim();
    }
}