package com.profile.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyIterator<T> {
	private int index = 0;
	private List<T> lst = new ArrayList<T>();
	public MyIterator(List<T> arr) {
		lst = arr;
	}
	
	public T first() {
		T first = null;
		if (!lst.isEmpty()) {
			index = 0;
			first = lst.get(index);
		}
		
		return first;
	}
	
	public T next() {
		T rlt = null;
		rlt = lst.get(++index);
		return rlt;
	}
	
	public boolean hasNext() {
		boolean hasTag = false;
		if (index < lst.size() - 1) {
			hasTag = true;
		}
		return hasTag;
	}
}
