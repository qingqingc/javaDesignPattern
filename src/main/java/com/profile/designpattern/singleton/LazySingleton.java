package com.profile.designpattern.singleton;

//懒汉单例模式
public class LazySingleton {
	private static int count = 0;
	private static volatile LazySingleton singleton = null;
	
	private LazySingleton() {
		System.out.println("init a single java pattern class.");
	}
	
	public synchronized static LazySingleton getSingletonInstance() {
		if (singleton == null) {// I think this place will lead to multithread problem.
			return new LazySingleton();
		}
		
		return singleton;
	}
	
	public String initDB() {
		String str = "it's succ.";
		System.out.println("init a db begin...");
		count++;
		if (count != 1) {
			str = "it's failure.";
		}
		return str;
	}
}
