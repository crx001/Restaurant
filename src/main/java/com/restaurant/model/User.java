package com.restaurant.model;

import org.springframework.stereotype.Controller;

@Controller
public class User {
    private Integer uid;
    private String uname;

    private String upwd;

    private Integer uvip;

    private Double ubalance;

    public User() {
		super();
	}

	public User(Integer uid, String uname, String upwd, Integer uvip, Double ubalance) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.uvip = uvip;
		this.ubalance = ubalance;
	}

	public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
  
    public String getUname() {
        return uname;
    }
  
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public Integer getUvip() {
        return uvip;
    }

    public void setUvip(Integer uvip) {
        this.uvip = uvip;
    }

    public Double getUbalance() {
        return ubalance;
    }

    public void setUbalance(Double ubalance) {
        this.ubalance = ubalance;
    }

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", uvip=" + uvip + ", ubalance=" + ubalance
				+ "]";
	}
    
    
}