package com.si.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


	@Entity
	public class College {
		
	@Id
	private Long id;
	@GeneratedValue(strategy = GenerationType.AUTO)
	//private User collegeAdmin;
	private String collegeName;
	private String location;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public College(Long id, String collegeName, String location) {
		super();
		this.id = id;
		this.collegeName = collegeName;
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", collegeName=" + collegeName + ", location=" + location + "]";
	}

}
