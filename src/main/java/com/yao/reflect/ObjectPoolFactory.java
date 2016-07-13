package com.yao.reflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class ObjectPoolFactory {
	private Map<String, Object> objectPool = new HashMap<>();

	private Object createObject(String clazzName)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> clazz = Class.forName(clazzName);
		return clazz.newInstance();
	}
	
	public void init(String fileName) throws
			ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			Properties props = new Properties();
			props.load(fis);
			for (String name : props.stringPropertyNames()) {
				objectPool.put(name, createObject(props.getProperty(name)));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Object getObject(String name) {
		return objectPool.get(name);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ObjectPoolFactory factory = new ObjectPoolFactory();
		factory.init("obj.txt");
		System.out.println(factory.getObject("a"));
		System.out.println(factory.getObject("b"));
	}
}
