package com;

import javax.persistence.*;

@Entity
@Table
public class Principle {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	int pid;
@Column
String pname;
@Column
String paddr;
@Column
float psal;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPaddr() {
	return paddr;
}
public void setPaddr(String paddr) {
	this.paddr = paddr;
}
public float getPsal() {
	return psal;
}
public void setPsal(float psal) {
	this.psal = psal;
}
@Override
public String toString() {
	return "Principle [pid=" + pid + ", pname=" + pname + ", paddr=" + paddr + ", psal=" + psal + "]";
}
}