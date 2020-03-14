package com.profile.designpattern.state;

public class ConcreteStateOne implements State {

	public void handle(Environment en) {
		// TODO Auto-generated method stub
		System.out.println("I am One.");
		en.setState(new ConcreteStateTwo());
	}
}
