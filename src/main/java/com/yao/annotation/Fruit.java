package com.yao.annotation;

import java.util.ArrayList;
import java.util.List;

public class Fruit {

	public void info() {
		System.out.println("水果的info方法...");
	}
	
	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Apple());
		fruits.add(new Fruit());
		
	}
	
}
