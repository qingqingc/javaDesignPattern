package com.profile.designpattern.prototype;

public class Prototype implements Cloneable {

	private int age = 18;
	private String name;
	private String sex = "felman";
	private String statement = "we all love programming.";

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public void description() {
		System.out.printf("My name is %s, I am a %s," + "%s years old,I want to say %s ", name, sex, age, statement);
		System.out.println();
	}

	public Object copyOne() throws CloneNotSupportedException {
		return super.clone();
	}
}