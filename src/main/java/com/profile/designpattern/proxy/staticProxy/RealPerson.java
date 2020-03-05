package com.profile.designpattern.proxy.staticProxy;

public class RealPerson implements Person {
	private String name;
	
	public RealPerson(String nameStr) {
		name = nameStr;
	}

	public void doSomething() {
		System.out.printf("My name is %s,I am a good man.", name);
		System.out.println();
	}
}
