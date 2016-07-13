package com.yao.reflect;

/**
 * 从文件中读取键值对，生成相应的对象。
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ExtendedObjectPoolFactory {
	private Map<String, Object> objectPool = new HashMap<>();
	private Properties props = new Properties();
	private Object createObject(String clazzName)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> clazz = Class.forName(clazzName);
		return clazz.newInstance();
	}
	
	public void init(String fileName) throws
			ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			props.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initPool() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		for (String name : props.stringPropertyNames()) {
			//如果key中不包含%，则表示该key-value用来创建对象
			if (!name.contains("%"))
				objectPool.put(name, createObject(props.getProperty(name)));
		}
	}
	
	public void initProperty() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		for (String name : props.stringPropertyNames()) {
			if (name.contains("%")) {
				String[] objAndProp = name.split("%");
				//获取执行方法的对象
				Object object = objectPool.get(objAndProp[0]);
				//构造方法名,形式setXdad()
				String mtdName = "set" + objAndProp[1].substring(0, 1).toUpperCase() + objAndProp[1].substring(1); 
				//获取执行方法对象对应类的Class对象，用来获取相应的方法
				Class<?> objectClazz = object.getClass();
				Method mtd = objectClazz.getMethod(mtdName, String.class);
				mtd.invoke(object, props.getProperty(name));
			}
		}
	}
	
	public Object getObject(String name) {
		return objectPool.get(name);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		ExtendedObjectPoolFactory factory = new ExtendedObjectPoolFactory();
		factory.init("obj1.txt");
		factory.initPool();
		factory.initProperty();
		System.out.println(factory.getObject("a"));
	}
}
