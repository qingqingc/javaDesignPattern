package com.profile.designpattern.builder;

public class Product {
	private String componentA;
	private String componentB;
	
	public String getComponentA() {
		return componentA;
	}

	public void setComponentA(String componentA) {
		this.componentA = componentA;
	}

	public String getComponentB() {
		return componentB;
	}

	public void setComponentB(String componentB) {
		this.componentB = componentB;
	}

	public void show() {
		System.out.println("This product is:" + componentA + 
				" and " + componentB);
	}
}
