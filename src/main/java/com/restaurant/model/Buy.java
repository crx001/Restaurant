package com.restaurant.model;

import org.springframework.stereotype.Controller;

@Controller
public class Buy {
    private Integer cid;

    private String cname;

    private String cfood;

    private Double cprice;

    private Integer cfid;

    private Integer cnum;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCfood() {
        return cfood;
    }

    public void setCfood(String cfood) {
        this.cfood = cfood == null ? null : cfood.trim();
    }

    public Double getCprice() {
        return cprice;
    }

    public void setCprice(Double cprice) {
        this.cprice = cprice;
    }

    public Integer getCfid() {
        return cfid;
    }

    public void setCfid(Integer cfid) {
        this.cfid = cfid;
    }

    public Integer getCnum() {
        return cnum;
    }

    public void setCnum(Integer cnum) {
        this.cnum = cnum;
    }
}