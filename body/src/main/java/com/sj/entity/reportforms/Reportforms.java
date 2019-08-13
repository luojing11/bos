package com.sj.entity.reportforms;

import java.io.Serializable;

public class Reportforms implements Serializable {
    private Integer id;

    private String wattname;

    private Integer succeed;

    private Integer defeated;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWattname() {
        return wattname;
    }

    public void setWattname(String wattname) {
        this.wattname = wattname == null ? null : wattname.trim();
    }

    public Integer getSucceed() {
        return succeed;
    }

    public void setSucceed(Integer succeed) {
        this.succeed = succeed;
    }

    public Integer getDefeated() {
        return defeated;
    }

    public void setDefeated(Integer defeated) {
        this.defeated = defeated;
    }
}