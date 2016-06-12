package com.java;

class S
{
	private int a=10;
	private final int b=20;
	
	public void setdata()
	{
		a=20;
		
		
	}

public void getdata()
{
	System.out.println("values::"+a+"::"+b);
}
}

public class Final2
{
	public static void main(String[] args)
	{
		S obj=new S();
		obj.setdata();
		obj.getdata();
	}
}