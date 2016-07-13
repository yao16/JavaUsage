package com.yao.threadusage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	private ExecutorService exe = null;// 线程池

	/**
	 * @return the exe
	 */
	public ExecutorService getExe() {
		return exe;
	}

	public void setExe(ExecutorService exe) {
		this.exe = exe;
	}

	public ThreadPool(int pool_size){
		exe = Executors.newFixedThreadPool(pool_size);// 创建线程池
		System.out.println("the server is ready");
	}
	
	public void addTask(Runnable r){
		exe.execute(r);
	}
	public void close(){
		exe.shutdown();
	}
	
	public boolean isTerminated() {
		return exe.isTerminated();
	}
	public static void main(String args[]){
		ThreadPool tp = new ThreadPool(3);
		//tp.addTask(new SingleProductBuildTask((long)1,1, 0));
//		ProductIndexService service = new ProductIndexService();
		for(int i=0;i<10;i++){
			TaskWork tw = tp.new TaskWork(i);
			tp.addTask(tw);
		}
	}
	
	public class TaskWork implements Runnable{
		int worknum=0;
		TaskWork(int worknum){
			this.worknum = worknum;
		}
		public void run() {
			try {
				Thread.sleep(1000);
				System.out.println(worknum);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
