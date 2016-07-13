package com.yao.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JFrame;

/**
 * 通过反射，并且利用指定的构造器来生成JFrame对象
 * @author yaoxiao
 *
 */
public class JFrameCreator {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> jframeClazz = Class.forName("javax.swing.JFrame");
		Constructor constructor = jframeClazz.getConstructor(String.class);
		Object object = constructor.newInstance("My first JFrame");
		JFrame jFrame = (JFrame) object;
		System.out.println(object);
	}
}
