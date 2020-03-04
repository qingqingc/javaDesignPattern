package com.profile.designpattern.singleton;

/*
 * 饿汉模式
 */
public class HungrySingleton {
	private static int count = 0;
	private static final HungrySingleton hungrySingleton = new HungrySingleton();
	
	private HungrySingleton() {
		System.out.println("init HungrySingleton...");
	}
	
	public static HungrySingleton getHungrySingletonInstance() {
		count++;
		System.out.println("init" +  count + " a HungrySingleton's db begin...");
		return hungrySingleton;
	}
}
