package com.yao.reflect;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoaderPropTest {

	public static void main(String[] args) throws IOException {
		ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
		Enumeration<URL> eml = systemLoader.getResources("");
		while (eml.hasMoreElements()) {
			System.out.println(eml.nextElement());
		}
	}
}
