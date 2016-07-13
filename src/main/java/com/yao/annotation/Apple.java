package com.yao.annotation;

public class Apple extends Fruit {

	private double weight;
	//@Override 用于强制子类重写父类的方法，并且只能用于方法，不能用于其他元素
	//该注释可以再子类重写父类方法时，用于方法名写错的提示作用，例如info写成info1
	@Override
	public void info() {
		System.out.println("苹果重写了水果父类的info方法...");
	}
	
	@Deprecated
	public void weight() {
		System.out.println("该苹果的重量为:" + this.weight);
	}
	
	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.info();
		apple.weight();
	}
}
