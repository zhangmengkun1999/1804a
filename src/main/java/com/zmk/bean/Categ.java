package com.zmk.bean;

public class Categ {
	private Integer cid;
	private String cname;
	private Integer bcound;
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
		this.cname = cname;
	}
	public Integer getBcound() {
		return bcound;
	}
	public void setBcound(Integer bcound) {
		this.bcound = bcound;
	}
	public Categ(Integer cid, String cname, Integer bcound) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.bcound = bcound;
	}
	@Override
	public String toString() {
		return "Categ [cid=" + cid + ", cname=" + cname + ", bcound=" + bcound + "]";
	}
	public Categ() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
