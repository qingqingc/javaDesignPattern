package com.profile.designpattern.mediator;

public class ConcreteColleague2 extends Colleague {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteColleague2 will send a msg.");
		m.relay(this);
	}

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteColleague2 receive a msg.");
	}

}
