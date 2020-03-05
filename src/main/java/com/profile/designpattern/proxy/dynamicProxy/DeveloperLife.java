package com.profile.designpattern.proxy.dynamicProxy;

public class DeveloperLife implements Life {
	
	private String name;
	
	public DeveloperLife(String nameStr) {
		name = nameStr;
	}

	public void live() {
		System.out.printf("My name is %s, I am a developer.", name);
		System.out.println();
	}

}
