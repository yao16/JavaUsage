package com.yao.jvm;
/**
 * -verbose:gc -Xms20m -Xmx20m -Xmn10m -Xss128k -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * @author ict_gis
 *
 */
public class JavaVMStackSOF {

	private int stackLength = 1;
	
	public void stackLeak() {
		stackLength++;
		stackLeak();
	}
	
	public static void main(String[] args) throws Throwable{
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try {
			oom.stackLeak();
		} catch (Throwable e) {
			System.out.println("Stack Length:" + oom.stackLength);
			throw e;
		}
	}
}
