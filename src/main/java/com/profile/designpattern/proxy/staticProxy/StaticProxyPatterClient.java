package com.profile.designpattern.proxy.staticProxy;

public class StaticProxyPatterClient {

	public static void main(String[] args) {
		Person p = new RealPerson("workman");
		PersonProxy pxy = new PersonProxy(p);
		pxy.doSomething();
	}

}
