package com.yao.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		List<String > l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		System.out.println(l1.getClass() == l2.getClass());
		System.out.println(l1 instanceof List);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_EXPONENT);
		System.out.println(Double.MIN_EXPONENT);
		System.out.println(Double.MIN_NORMAL);
	}
}
