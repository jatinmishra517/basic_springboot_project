package com.jatin.demo.model;

//import javax.persistence.Entity;
//import javax.persistence.Entity;
//import javax.persistence.Id;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document("sources")
public class Source {
	@Id
	private int sid;
	private String sname;
	private int svalue;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSvalue() {
		return svalue;
	}
	public void setSvalue(int svalue) {
		this.svalue = svalue;
	}
	@Override
	public String toString() {
		return "Source [sid=" + sid + ", sname=" + sname + ", svalue=" + svalue + "]";
	}
	
	

}
