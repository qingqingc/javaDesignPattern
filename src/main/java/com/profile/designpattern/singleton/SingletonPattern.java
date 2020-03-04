package com.profile.designpattern.singleton;

import com.profile.designpattern.singleton.LazySingleton;

public class SingletonPattern {

	public static void main(String[] args) {
		//lazy singleton.
		LazySingleton singletonInstance = LazySingleton.getSingletonInstance();
		String initStr = singletonInstance.initDB();
		System.out.println(initStr);
		
		//hungry Singleton
		for (int i = 0; i < 10; i++) {
			HungrySingleton hungrySingleton = HungrySingleton.getHungrySingletonInstance();
		}
	}

}
