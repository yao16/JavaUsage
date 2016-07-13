package com.yao.reflect;

import java.lang.reflect.Proxy;

/**
 * 模拟spring aop，将AnimalUtil中的方法注入到dog中，实现Dog与Anaimal的解耦，Dog中调用Animal中的方法，不用采用硬编码的方式。
 * @author yaoxiao
 *
 */
public class DogProxyFactory {
	
	public Dog getDog(Dog dog) {
		DogProxyHandler handler = new DogProxyHandler(dog);
		return (Dog) Proxy.newProxyInstance(dog.getClass().getClassLoader(), dog.getClass().getInterfaces(), handler);
	}

	public static void main(String[] args) {
		DogProxyFactory factory = new DogProxyFactory();
		Dog dog = factory.getDog(new GunDog());
		dog.run();
		dog.say();
	}
}
