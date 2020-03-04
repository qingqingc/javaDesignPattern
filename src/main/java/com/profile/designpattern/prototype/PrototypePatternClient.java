package com.profile.designpattern.prototype;

public class PrototypePatternClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype p = new Prototype();
		p.setName("yu");
		Prototype p1 = (Prototype)p.copyOne();
		p1.setName("an");
		
		p.description();
		p1.description();
	}

}
