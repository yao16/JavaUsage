package com.yao.annotation;

import java.lang.reflect.Method;

/**
 * 基本Annotation用法练习
 * 基本Annotation包括4个，分别是@Override、@Deprcated、@Suppress Warning、@SafaVarargs
 * 1、@Override 限定重写父类方法  用法参见Fruit和Aplle类，用于强制一个子类必须覆盖父类的方法
 * 2、@Deprecated 标记已过时  用法参见Apple的weight方法，用于表示某个程序元素已过时
 * 3、@SuppressWarning 抑制编译器警告  用法参见SuppressWaringTest类
 * 4、@SafeVarargs 消除堆污染警告用法参见ErrorUtils类
 * @author yaoxiao
 *
 */
public class BasicAnnotation {

	public BasicAnnotation() {
		super();
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Class<BasicAnnotation>  ba = BasicAnnotation.class;
		System.out.println(ba.getAnnotations());
	}
}
