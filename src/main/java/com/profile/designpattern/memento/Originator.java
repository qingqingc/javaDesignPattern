package com.profile.designpattern.memento;

public class Originator {
	private String state;
	private Memento metmento;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Memento getMetmento() {
		return metmento;
	}
	public void setMetmento(Memento metmento) {
		this.metmento = metmento;
	}
	
	public Memento createMemento() {
		Memento m = new Memento(state);
		return m;
	}
	
	public void restoreState(Memento m) {
		this.state = m.getState();
	}
}
