package com.profile.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorPatternClient {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("bananas");
		fruits.add("orange");
		fruits.add("pear");
		
		MyIterator<String> it = new MyIterator<String>(fruits);
		System.out.println(it.first());
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
