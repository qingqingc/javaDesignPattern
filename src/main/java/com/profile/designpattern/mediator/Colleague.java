package com.profile.designpattern.mediator;

public abstract class Colleague {
	public Mediator m;
	public void setM(Mediator m) {
		this.m = m;
	}
	
	public abstract void send();
	public abstract void receive();
}
