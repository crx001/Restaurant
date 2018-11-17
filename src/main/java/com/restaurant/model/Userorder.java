package com.restaurant.model;

import org.springframework.stereotype.Controller;

@Controller
public class Userorder {
    private Integer oid;

    private String oname;

    private String ofood;

    private Integer ofid;

    private Integer onum;

    private Double oprice;

    private String odate;

    public Userorder() {
		super();
	}

	public Userorder(String oname, String ofood, Integer ofid, Integer onum, Double oprice, String odate) {
		super();
		this.oname = oname;
		this.ofood = ofood;
		this.ofid = ofid;
		this.onum = onum;
		this.oprice = oprice;
		this.odate = odate;
	}

	public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getOfood() {
        return ofood;
    }

    public void setOfood(String ofood) {
        this.ofood = ofood == null ? null : ofood.trim();
    }

    public Integer getOfid() {
        return ofid;
    }

    public void setOfid(Integer ofid) {
        this.ofid = ofid;
    }

    public Integer getOnum() {
        return onum;
    }

    public void setOnum(Integer onum) {
        this.onum = onum;
    }

    public Double getOprice() {
        return oprice;
    }

    public void setOprice(Double oprice) {
        this.oprice = oprice;
    }

    public String getOdate() {
        return odate;
    }

    public void setOdate(String odate) {
        this.odate = odate == null ? null : odate.trim();
    }

	@Override
	public String toString() {
		return "Userorder [oid=" + oid + ", oname=" + oname + ", ofood=" + ofood + ", ofid=" + ofid + ", onum=" + onum
				+ ", oprice=" + oprice + ", odate=" + odate + "]";
	}
    
}