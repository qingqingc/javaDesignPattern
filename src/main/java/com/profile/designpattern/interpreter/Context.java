package com.profile.designpattern.interpreter;

public class Context {
	private String[] cityArr = {"长沙", "南昌","西安"};
	private String[] personArr = {"老年人","小孩","残疾人"};
	private CityExpression cityEx;
	private PersonExpression personEx;
	private AndExpression andEx;
	public Context() {
		cityEx = new CityExpression(cityArr);
		personEx = new PersonExpression(personArr);
		andEx = new AndExpression(cityEx, personEx);
	}
	public void interpreter(String str) {
		boolean t = andEx.interpreter(str);
		if (t) {
			System.out.println(str + "是属于免费条件里的事情。");
		} else {
			System.out.println(str + "不能免费。");
		}
	}
}
