package com.profile.designpattern.observer;

public class Subject {
	public String msg;

	public Subject(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}