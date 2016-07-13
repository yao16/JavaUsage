package com.yao.threadusage;

import com.yao.bean.TestBean;

public class ThreadUsage implements Runnable {

	private TestBean tb; 
	
	public ThreadUsage() {
		super();
		this.tb = new TestBean();
	}

	public void run() {
		System.out.println(tb);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tb);
	}
	
	public static void main(String[] args) {
		ThreadPool tp = new ThreadPool(1);
		tp.addTask(new ThreadUsage());
		//tp.close();
		if (tp.isTerminated()) {
			System.out.println(1);
			
		}
		
		
	}
}
