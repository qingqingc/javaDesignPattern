package com.profile.designpattern.builder;

public class ConcreteBuilderAPPLE extends Builder {
	private String tradeMark = "apple";

	@Override
	public void builderComponentA() {
		p.setComponentA(tradeMark + " microphone1.2");
	}

	@Override
	public void builderComponentB() {
		// TODO Auto-generated method stub
		p.setComponentB(tradeMark + " good screen1.5");
	}

}