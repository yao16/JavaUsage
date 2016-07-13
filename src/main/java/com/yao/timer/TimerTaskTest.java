package com.yao.timer;

import java.util.Timer;
import java.util.TimerTask;

import com.yao.bean.TestBean;

public class TimerTaskTest extends TimerTask {

	private TestBean tb; 
	
	public TimerTaskTest() {
		super();
		tb = new TestBean();
	}

	@Override
	public void run() {
		tb.print();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Timer().schedule(new TimerTaskTest(), 0, 1000);
	}
}
