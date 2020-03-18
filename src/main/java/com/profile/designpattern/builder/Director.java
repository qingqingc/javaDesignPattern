package com.profile.designpattern.builder;

public class Director {
	private Builder b;
	public Director(Builder b) {
		this.b = b;
	}
	
	public Product constructProducter() {
		Product prd = b.getP();
		b.builderComponentA();
		b.builderComponentB();
		return prd;
	}
}
