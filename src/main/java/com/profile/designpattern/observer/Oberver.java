package com.profile.designpattern.observer;

public class Oberver {
	private Subject sbj;
	private String observerName;
	private ObserverListener listener;
	public void update(String newMsg) {
		System.out.println("I am " + observerName + 
				" I update a massage " + newMsg);
		sbj.setMsg(newMsg);
		if (listener != null) {
			listener.notifyAllObserver();
		}
	}
	
	public void newMsg() {
		System.out.println("I am " + observerName + 
				" and receive a massage " + sbj.getMsg());
	}
	
	public Oberver(Subject s, String observerName, ObserverListener listener) {
		sbj = s;
		this.observerName = observerName;
		if (listener != null) {
			this.listener = listener;
			addListener();
		}
		
		newMsg();
	}
	
	public void addListener() {
		listener.addToListener(this);
	}
	
	public void removeListener() {
		listener.removeFromListener(this);
	}
}
