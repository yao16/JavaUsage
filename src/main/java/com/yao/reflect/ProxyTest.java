package com.yao.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Enumeration;
import java.util.Vector;

/**
 * 代理类
 * @author yaoxiao
 *
 */

public class ProxyTest {
	
	class MyInvocationHandler implements InvocationHandler{

		private Object beProxy;
		
		
		public MyInvocationHandler(Object beProxy) {
			super();
			this.beProxy = beProxy;
		}

		public MyInvocationHandler() {
			super();
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args)
				throws Throwable {
			System.out.println("the method being executed is : " + method);
			if (args != null) {
				for(Object val : args) {
					System.out.println(val);
				}
				method.invoke(beProxy, args);
			} else {
				System.out.println("the method being executed has no params");
				method.invoke(beProxy, args);
			}
			return null;
		}
	}
	
	public static void main(String[] args) {
		InvocationHandler handler = new ProxyTest().new MyInvocationHandler(new Orange());
		Fruit f = (Fruit) Proxy.newProxyInstance(Fruit.class.getClassLoader(), new Class[]{Fruit.class}, handler);
		f.setWeight(12d);
		f.name();
	}

}
