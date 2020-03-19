package com.profile.designpattern.chainofresponsibility;

/**
 * 
 * 责任链设计模式
 *
 */
public class ChainOfResponsibilityClient {

	public static void main(String[] args) {
		Handler c1 = new ConcreteHandlerA();
		Handler c2 = new ConcreteHandlerB();
		c1.setHandler(c2);
		c1.handleRequest("a");
	}
}
