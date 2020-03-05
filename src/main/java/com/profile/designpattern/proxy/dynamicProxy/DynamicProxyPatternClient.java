package com.profile.designpattern.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class DynamicProxyPatternClient {
	public static void main(String[] args) {
		Life developer = new DeveloperLife("Simple programmer");
		Life writer = new WriterLife("Chun Shang Chun Shu");
		
		LifeDynamicProxy proxyD = new LifeDynamicProxy(developer);
		LifeDynamicProxy proxyW = new LifeDynamicProxy(writer);
		
		Life pd = (Life)Proxy.newProxyInstance(proxyD.getClass().getClassLoader(), new Class[] {Life.class},  proxyD);
		Life pw = (Life)Proxy.newProxyInstance(proxyW.getClass().getClassLoader(), new Class[] {Life.class}, proxyW);
		
		pd.live();
		System.out.println("-----------------------------");
		pw.live();
	}
}
