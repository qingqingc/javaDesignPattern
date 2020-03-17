package com.profile.designpattern.composite;

import java.util.List;

public interface Component {
	public void add(Component c);
	public void remove(Component c);
	public List<Component> getChirld();
	public void operation();
}
