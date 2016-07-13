package com.yao.jvm;

import java.lang.reflect.Method;

/**
 * @Description:JVM方法区内存溢出测试
 * VM args:-verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:PermSize=128k -XX:MaxPermSize=128k -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * @author ict_gis
 * -XX:+DisableExplicitGC -XX:+UseConcMarkSweepGC -XX:+CMSParallelRemarkEnabled -XX:+UseCMSCompactAtFullCollection -XX:LargePageSizeInBytes=256m -XX:+UseFastAccessorMethods -XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=70 
 * -XX:+HeapDumpOnOutOfMemoryError  -XX:+PrintGCDetails -XX:+PrintGCTimeStamps
 *
 */
public class JVMMethodAreaOOM {
//	private static int[] area = new int[1024];
	public static void main(String[] args) throws InterruptedException {
		String[] s1 = new String[100];
		String[] s2 = new String[100];
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			s1[i] = new String("" + i);
		}
		method1(s1, s2);
		System.out.println(s2[99]);
	}
	
	private static void method1(String[] s1, String[] s2) {
		for (int i = 0; i < 100; i++) {
			s2[i] = s1[i];
		}
		
	}
}
