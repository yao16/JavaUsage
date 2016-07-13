package com.yao.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class DogProxyHandler implements InvocationHandler {
	
	private Object proxy;
	
	public DogProxyHandler() {
	}

	public DogProxyHandler(Object proxy) {
		this.proxy = proxy;
	}

	public Object getProxy() {
		return proxy;
	}

	public void setProxy(Object proxy) {
		this.proxy = proxy;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		AnimalUtil util = new AnimalUtil();
		util.M1();
		method.invoke(this.proxy, args);
		util.M2();
		return null;
	}
	
}