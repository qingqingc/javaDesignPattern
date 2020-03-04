package com.profile.designpattern.singleton;

public class Singleton {
	private static int count = 0;
	private static Singleton singleton;
	
	private Singleton() {
		System.out.println("init a single java pattern class.");
	}
	
	public synchronized static Singleton getSingletonInstance() {
		if (singleton == null) {// I think this place will cause multithread problem.
			return new Singleton();
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
