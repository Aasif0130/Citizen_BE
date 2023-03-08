package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="citizen")

public class Citizen {
	@Id
	@Column(name="Aid")
	private long aid;
	@Column(name="cname")
	private String cname;
	@Column(name="password")
	private String password;
	@Column(name="cstate")
	private String cstate;
	@Column(name="carea")
	private String carea;
	@Column(name="age")
	private int age;
	@Column(name="csalary")
	private int csalary;
//	unique id given to citizen
	@Column(name="cid")
	private int cid;
	public Citizen() {} ;
	public Citizen(long aid,String cname,String cstate,String carea,int age,int csalary,int cid,String password)
	{
		super();
		this.aid=aid;
		this.cname=cname;		
		this.cstate=cstate;
		this.carea=carea;
		this.age=age;
		this.csalary=csalary;
		this.cid=cid;
		this.password=password;
	}
	public long getAid() {
		return aid;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCstate() {
		return cstate;
	}
	public void setCstate(String cstate) {
		this.cstate = cstate;
	}
	public String getCarea() {
		return carea;
	}
	public void setCarea(String carea) {
		this.carea = carea;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public int getCsalary() {
		return csalary;
	}
	public void setCsalary(int csalary) {
		this.csalary= csalary;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid= cid;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password=password;
	}
	
}