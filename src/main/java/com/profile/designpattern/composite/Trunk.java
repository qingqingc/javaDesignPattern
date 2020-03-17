package com.profile.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Trunk implements Component {
	
	private List<Component> tree = new ArrayList<Component>();
    private String trunkName;
    public Trunk(String trunkName) {
    	this.trunkName = trunkName;
    }
	
    @Override
    public String toString() {
    	return trunkName;
    }
    
	public void add(Component c) {
		// TODO Auto-generated method stub
		tree.add(c);
	}

	public void remove(Component c) {
		// TODO Auto-generated method stub
		c.remove(c);
	}

	public List<Component> getChirld() {
		// TODO Auto-generated method stub
		return tree;
	}

	public void operation() {
		System.out.println("this is a trunk and contain:" + trunkName);
		for (Component c : tree) {
			iteratorTree(c);
		}
	}
	
	private void iteratorTree(Component c) {
		if (c != null) {
			if (c instanceof Leaf) {
				c.operation();
				return;
			} else {
				if (c instanceof Trunk) {
					System.out.println(c);
					List<Component> arr = c.getChirld();
					if (arr !=null) {
						for (Component cc : arr) {
							iteratorTree(cc);
						}
					}
				}
			}
		}
	}
}
