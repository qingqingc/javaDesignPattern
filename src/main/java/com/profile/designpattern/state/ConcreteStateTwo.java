package com.profile.designpattern.state;

public class ConcreteStateTwo implements State {

	public void handle(Environment en) {
		System.out.println("I am Two.");
		en.setState(new ConcreteStateOne());
	}

}
