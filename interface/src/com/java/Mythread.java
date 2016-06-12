package com.java;
class yahoo extends Thread

{
	public yahoo(String value)
	{
		super(value);
	}
	public void run()
	{
		System.out.println("yahoo:: gm");
	}}
public class Mythread {
	public static void main(String args[])
	{
		System.out.println("mythread::gm>>1");
		
		yahoo myobject=new yahoo("mythread");
		myobject.start();
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("mythread:: gm>>2");
	}
}
		
	


