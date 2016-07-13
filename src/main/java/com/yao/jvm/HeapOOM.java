package com.yao.jvm;

import java.util.ArrayList;
import java.util.List;
/**
 * VM args:-verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
 *         -XX:+HeapDumpOnOutOfMemoryError
 *         
 * -Xms 初始堆大小
 * -Xmx 最大堆大小
 * -Xmn 年轻代大小
 * -Xss 每个线程的栈大小
 * @author ict_gis
 *
 */
public class HeapOOM {
	
	static class OOMClass {
		
	}

	public static void main(String[] args) {
		List<OOMClass> list = new ArrayList<OOMClass>();
		
		int i = 0;
		while (true) {
			list.add(new OOMClass());
//			System.out.println(i++);
		}
		
	}
}
