package com.profile.designpattern.chainofresponsibility;

public class ConcreteHandlerB extends Handler {

	@Override
	public void handleRequest(String reqName) {
		System.out.println("processing ConcreteHandlerB method...");
		if (reqName.equals("b")) {
			System.out.println("handle by b.");
		} else if (getHandler() != null){
			System.out.println("entrance to ConcreteHandlerB chain...");
			getHandler().handleRequest("a");
		} else {
			System.out.println("Can't deal this request.");
		}
	}

}
