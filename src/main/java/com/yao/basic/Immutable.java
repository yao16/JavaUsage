package com.yao.basic;

//不可变类  缓存练习
public class Immutable {

	public static void main(String[] args) {
		Integer a = new Integer(1);
		Integer b = new Integer(1);
		Integer c1 = Integer.valueOf(1);
		Integer c2 = Integer.valueOf(1);
		
		Integer c3 = Integer.parseInt("1");
		System.out.println(a == b);
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
	}
}
