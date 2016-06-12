package com.java;

class ananya implements Runnable {
	
	
		
		public void run()
		{
			try
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println(Thread.currentThread()+"::"+i);
					Thread.sleep(5000);
				}
			}
				catch(InterruptedException e){
					e.printStackTrace();
					
				}
			

			} } 		
				
		public class Mythread2 {
			public static void main(String[] args)
			{
				Thread obj1=new Thread (new ananya());
				obj1.setName("thread a");
				obj1.start();
				Thread Myobject2=new Thread (new ananya());
				Myobject2.setName("thread b");
				Myobject2.start();
			}
		
			}


