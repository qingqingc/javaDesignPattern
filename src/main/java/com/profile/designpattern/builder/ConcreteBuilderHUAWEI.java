package com.profile.designpattern.builder;

public class ConcreteBuilderHUAWEI extends Builder {
	private String tradeMark = "HUAWEI";

	@Override
	public void builderComponentA() {
		p.setComponentA(tradeMark + " microphone1.1");
	}

	@Override
	public void builderComponentB() {
		// TODO Auto-generated method stub
		p.setComponentB(tradeMark + " good screen1.1");
	}

}
