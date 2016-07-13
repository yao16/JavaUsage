package com.yao.generic;

public class Base<T extends Number> {

	public void info() {
		System.out.println(this.getClass());
	}
	
	public static void main(String[] args) {
		Base<Integer> i = new Base<Integer>();
		Class<?> obj = i.getClass().getSuperclass();
		System.out.println(i.getClass().isInstance(new Base<Number>()));
		System.out.println(i);
		System.out.println(obj.getClass());
		System.out.println(obj.isInstance(new Base<Number>().getClass()));
		System.out.println(obj.isInstance(new Base<Integer>().getClass()));
		System.out.println(obj.isInstance(new Base<Number>()));
		System.out.println(obj.getClass().isInstance(new Base<Number>().getClass()));
		System.out.println(obj.getClass().isInstance(new Base<Number>()));
	}
}
