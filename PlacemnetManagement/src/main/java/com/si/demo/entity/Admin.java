package com.si.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Admin {
	@Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long adminid;
   private String adminname;
   private String adminpassword;
public long getAdminid() {
	return adminid;
}
public void setAdminid(long adminid) {
	this.adminid = adminid;
}
public String getAdminname() {
	return adminname;
}
public void setAdminname(String adminname) {
	this.adminname = adminname;
}
public String getAdminpassword() {
	return adminpassword;
}
public void setAdminpassword(String adminpassword) {
	this.adminpassword = adminpassword;
}
public Admin(long adminid, String adminname, String adminpassword) {
	super();
	this.adminid = adminid;
	this.adminname = adminname;
	this.adminpassword = adminpassword;
}
@Override
public String toString() {
	return "Admin [adminid=" + adminid + ", adminname=" + adminname + ", adminpassword=" + adminpassword + "]";
}

}
