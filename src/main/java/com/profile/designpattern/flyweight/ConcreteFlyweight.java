package com.profile.designpattern.flyweight;

public class ConcreteFlyweight implements Flyweight {
	private String tag;

	public ConcreteFlyweight(String tagStr) {
		System.out.println("construct a new " + tagStr + " object.");
		this.tag = tagStr;
	}
	public void operation() {
		System.out.println("I am " + tag + " the ConcreteFlyweight things.");
	}
}
