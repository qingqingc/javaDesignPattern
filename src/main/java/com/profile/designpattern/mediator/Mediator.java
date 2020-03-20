package com.profile.designpattern.mediator;

public abstract class Mediator {
	public abstract void register(Colleague c);
	public abstract void relay(Colleague c);

}
