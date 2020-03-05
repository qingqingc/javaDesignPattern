package com.profile.designpattern.proxy.staticProxy;

public class PersonProxy {

	private Person person;
	
	public PersonProxy(Person p) {
		person = p;
	}

	public void doSomething() {
		preDoSomething();
		person.doSomething();
		afterDoSomething();
	}
	
	private void preDoSomething() {
		System.out.println("before say...");
	}
	
	private void afterDoSomething() {
		System.out.println("after say.");
	}
}
