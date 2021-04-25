package com;

import javax.persistence.*;

@Entity
@Table
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
int cid;
	@Column
String cname;
	@Column
String caddr;
//one college has one Principal
@OneToOne(cascade=CascadeType.ALL)
	Principle pri;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCaddr() {
	return caddr;
}
public void setCaddr(String caddr) {
	this.caddr = caddr;
}
public Principle getPri() {
	return pri;
}
public void setPri(Principle pri) {
	this.pri = pri;
}
@Override
public String toString() {
	return "College [cid=" + cid + ", cname=" + cname + ", caddr=" + caddr + ", pri=" + pri + "]";
}
}