package com.profile.designpattern.foctory.abstractfactory;

public enum HouseType {
	SOUTH_BIG("south_big", 1, 1), 
	NORTHSMALL("north_small",2, 29), 
	DEFAULT_ONE("default_type",0, 0);

	private String typeName;
	private int typeValue;
	private int defaultTypeValue;

	private HouseType(String typeNme, int typeVle, int defaultVle) {
		typeName = typeNme;
		typeValue = typeVle;
		defaultTypeValue = defaultVle;
	}
	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getTypeValue() {
		return typeValue;
	}

	public void setTypeValue(int typeValue) {
		this.typeValue = typeValue;
	}

	public int getDefaultTypeValue() {
		return defaultTypeValue;
	}

	public void setDefaultTypeValue(int defaultTypeValue) {
		this.defaultTypeValue = defaultTypeValue;
	}
}
