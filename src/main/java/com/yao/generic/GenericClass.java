package com.yao.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * java 不存在泛型类
 * @author yaoxiao
 *
 */
@SuppressWarnings(value="unchecked")
public class GenericClass {


	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<String> l2 = new ArrayList<String>();
		System.out.println(l1.getClass() == l2.getClass());
		
		List l3 = new ArrayList();
		List l4 = new ArrayList();
		System.out.println(l3 == l4);
		System.out.println(l3.getClass() == l4.getClass());
	}
}
