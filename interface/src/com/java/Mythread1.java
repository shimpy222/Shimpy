package com.java;

	class pari extends Thread

	{
		public pari(String value)
		{
			super(value);
		}
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
				
		public class Mythread1 {
			public static void main(String[] args)
			{ pari Myobject1=new pari("Thread a");
			Myobject1.start();
			pari Myobject2=new pari("Thread b");
			Myobject2.start();
			
			}

}
