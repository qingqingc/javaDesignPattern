package com.profile.designpattern.state;

public class Environment {
	private State state;

	public Environment() {
		state = new ConcreteStateOne();
	}
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void handle() {
		state.handle(this);
	}
}
