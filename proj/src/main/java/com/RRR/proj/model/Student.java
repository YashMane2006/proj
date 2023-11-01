package com.RRR.proj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long roll_no;
	private String name,address;
	private String emailid,password;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address, String emailid, String password) {
		super();
//		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
		this.emailid = emailid;
		this.password = password;
	}
	public long getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(long roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", address=" + address + ", emailid=" + emailid
				+ ", password=" + password + "]";
	}
	
	

}
