package com.yao.basic;

/**
 * 初始化
 * @author yaoxiao
 *
 */
public class ClassInit {

	private Integer i;
	private int k;
	
	public void init() {
		int j;
		System.out.println(i);
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		new ClassInit().init();
	}
}
