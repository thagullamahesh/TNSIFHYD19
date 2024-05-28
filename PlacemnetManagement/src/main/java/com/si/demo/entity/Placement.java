package com.si.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


	@Entity
	public class Placement {
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long plcid;
		private String plcname;
		private String plcqualification;
		private int plcyear;
		public Long getPlcid() {
			return plcid;
		}
		public void setPlcid(Long plcid) {
			this.plcid = plcid;
		}
		public String getPlcname() {
			return plcname;
		}
		public void setPlcname(String plcname) {
			this.plcname = plcname;
		}
		public String getPlcqualification() {
			return plcqualification;
		}
		public void setPlcqualification(String plcqualification) {
			this.plcqualification = plcqualification;
		}
		public int getPlcyear() {
			return plcyear;
		}
		public void setPlcyear(int plcyear) {
			this.plcyear = plcyear;
		}
		public Placement(Long plcid, String plcname, String plcqualification, int plcyear) {
			super();
			this.plcid = plcid;
			this.plcname = plcname;
			this.plcqualification = plcqualification;
			this.plcyear = plcyear;
		}
		@Override
		public String toString() {
			return "Placement [plcid=" + plcid + ", plcname=" + plcname + ", plcqualification=" + plcqualification
					+ ", plcyear=" + plcyear + "]";
		}
		

}
