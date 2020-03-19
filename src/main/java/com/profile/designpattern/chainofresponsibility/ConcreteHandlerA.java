package com.profile.designpattern.chainofresponsibility;

public class ConcreteHandlerA extends Handler {

	@Override
	public void handleRequest(String reqName) {
		System.out.println("processing ConcreteHandlerA method...");
		if (reqName.equals("a")) {
			System.out.println("handle by ConcreteHandlerA a.");
		} else if (getHandler() != null){
			System.out.println("entrance to ConcreteHandlerA chain...");
			getHandler().handleRequest("b");
		} else {
			System.out.println("ConcreteHandlerA Can't deal this request.");
		}
	}
}
