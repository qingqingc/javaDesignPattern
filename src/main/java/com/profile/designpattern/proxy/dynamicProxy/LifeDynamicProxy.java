package com.profile.designpattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LifeDynamicProxy implements InvocationHandler {
	private Life life;
	
	public LifeDynamicProxy(Life l) {
		life = l;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		doPre();
		Object rlt = method.invoke(life, args);
		doPost();
		return rlt;
	}
	
	private void doPre() {
		System.out.println("do some prepare...");
	}
	
	private void doPost() {
		System.out.println("after do something.");
	}
}
