package com.profile.designpattern.chainofresponsibility;

public abstract class Handler {
	public Handler handler;
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	public Handler getHandler() {
		return handler;
	}
	
	public abstract void handleRequest(String reqName);
}
