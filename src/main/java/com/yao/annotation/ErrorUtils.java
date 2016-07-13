package com.yao.annotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ErrorUtils {

	@SafeVarargs
	public static void faultyMethod(List<String>... listStrArray) {
		List[] listArray = listStrArray;//此处引起堆污染
		List<Integer> mylist = new ArrayList<Integer>();
		mylist.add(new Random().nextInt(100));
		listArray[0] = mylist;
		String s = (String) listArray[1].get(0);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		ErrorUtils.faultyMethod(Arrays.asList("Hello"), Arrays.asList("World!"));
	}
}
