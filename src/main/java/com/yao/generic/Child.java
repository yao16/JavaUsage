package com.yao.generic;

import java.util.ArrayList;
import java.util.List;

public class Child extends Base{

	public void info() {
		System.out.println(this.getClass());
	}
	
	public static void main(String[] args) {
		Base<Integer> i = new Base<Integer>();
		Child child = new Child();
		System.out.println(i.getClass() == child.getClass());
		List<String> list = new ArrayList<String>();
	}
}
