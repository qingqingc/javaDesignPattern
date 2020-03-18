package com.profile.designpattern.builder;

public class BuilderPatternClient {

	public static void main(String[] args) {
		Builder b = new ConcreteBuilderHUAWEI();
		Director d = new Director(b);
		Product p = d.constructProducter();
		p.show();
		
		Builder bb = new ConcreteBuilderAPPLE();
		Director dd = new Director(bb);
		Product pp = dd.constructProducter();
		pp.show();
	}
}
