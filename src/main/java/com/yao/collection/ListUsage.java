package com.yao.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListUsage {

	public void changeUnitTraves() {

	}

	public void name() {

	}

	public static int removeElement(int[] nums, int val) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == val) {
				int tmp = nums[n - 1];
				nums[n - 1] = nums[i];
				nums[i] = tmp;
				i--;
				n--;
			}
		}
		return n;
	}

	public static void change(int[] nums) {
		int tmp = nums[0];
		nums[0] = nums[1];
		nums[1] = tmp;

	}

	public static void main(String[] args) {
		List<String> s = new ArrayList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			if (it.next().equals("1"))
				it.remove();
		}
		for (String s1 : s)
			System.out.println(s1);
	}
}
