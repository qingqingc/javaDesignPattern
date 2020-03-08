package com.profile.designpattern.foctory.simplefactory;

public enum ProductType {
	CUP("cup",15), PENCIL("pencil",22);

	private ProductType(String nameStr, int valueInt) {
		name = nameStr;
		value = valueInt;
	}
	private String name;
	private int value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
