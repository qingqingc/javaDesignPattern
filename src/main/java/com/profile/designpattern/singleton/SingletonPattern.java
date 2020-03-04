package com.profile.designpattern.singleton;

import com.profile.designpattern.singleton.Singleton;

public class SingletonPattern {

	public static void main(String[] args) {
		Singleton singletonInstance = Singleton.getSingletonInstance();
		String initStr = singletonInstance.initDB();
		System.out.println(initStr);
	}

}
