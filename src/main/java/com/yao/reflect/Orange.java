package com.yao.reflect;

public class Orange implements Fruit {

	@Override
	public void name() {
		System.out.println("Orange");

	}

	@Override
	public void setWeight(double weight) {
		System.out.println("weight is " + weight);

	}

}
