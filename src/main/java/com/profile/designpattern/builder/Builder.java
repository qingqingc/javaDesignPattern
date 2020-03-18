package com.profile.designpattern.builder;

public abstract class Builder {
	public Product p = new Product();
	
	public Product getP() {
		return p;
	}
	
	public abstract void builderComponentA();
	public abstract void builderComponentB();
}
