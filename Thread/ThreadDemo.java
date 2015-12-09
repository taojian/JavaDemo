package com.tj.test;

public class ThreadDemo extends Thread{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				System.out.println("--id--"+Thread.currentThread().getId());
				sleep(1000*100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void print(){
			System.out.println("--id--"+Thread.currentThread().getId());
			for(int i =0; i< 10; i++)
				System.out.println("hello world");
		}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new ThreadDemo();
		t.start();
		((ThreadDemo) t).print();
	}

}
