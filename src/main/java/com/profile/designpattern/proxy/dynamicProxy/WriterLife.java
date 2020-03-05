package com.profile.designpattern.proxy.dynamicProxy;

public class WriterLife implements Life {
	
	public String name;
	
	public WriterLife(String nameStr) {
		name = nameStr;
	}

	public void live() {
		System.out.printf("My name is %s, I am a writer.", name);
		System.out.println();
	}
}
