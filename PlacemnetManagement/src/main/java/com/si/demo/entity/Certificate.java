package com.si.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Certificate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long crtid;
	private int crtyear;
	private String crtcollege;
	public long getCrtid() {
		return crtid;
	}
	public void setCrtid(long crtid) {
		this.crtid = crtid;
	}
	public int getCrtyear() {
		return crtyear;
	}
	public void setCrtyear(int string) {
		this.crtyear = string;
	}
	public String getCrtcollege() {
		return crtcollege;
	}
	public void setCrtcollege(String crtcollege) {
		this.crtcollege = crtcollege;
	}
	public Certificate(long crtid, int crtyear, String crtcollege) {
		super();
		this.crtid = crtid;
		this.crtyear = crtyear;
		this.crtcollege = crtcollege;
	}
	@Override
	public String toString() {
		return "Certificate [crtid=" + crtid + ", crtyear=" + crtyear + ", crtcollege=" + crtcollege + "]";
	}

}
