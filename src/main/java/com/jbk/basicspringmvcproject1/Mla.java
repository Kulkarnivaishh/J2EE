package com.jbk.basicspringmvcproject1;

import org.springframework.stereotype.Component;

@Component
public class Mla {
String name;
String loc;
public Mla() {
	super();
	// TODO Auto-generated constructor stub
}
public Mla(String name, String loc) {
	super();
	this.name = name;
	this.loc = loc;
}
@Override
public String toString() {
	return "Mla [name=" + name + ", loc=" + loc + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}

}
