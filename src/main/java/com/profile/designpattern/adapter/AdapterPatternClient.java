package com.profile.designpattern.adapter;

public class AdapterPatternClient {
	public static void main(String[] args) {
		Athlete 姚明 = new 姚明();
		Athlete liuxiang = new 刘翔();
		Athlete berry = new Berry();
		姚明.jump();
		liuxiang.run();
		berry.run();
		berry.jump();
	}
}