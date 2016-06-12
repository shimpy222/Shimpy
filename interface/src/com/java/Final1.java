package com.java;

class Z
{
	public void getdata1()
	{
		System.out.println("Class Z>>getdata1");
		
	}

}
 class Y extends Z
{
	public void getdata2()
	{
		System.out.println("Class Y>>getdata2");
		
	}

}
final class X extends Y
{
	public void getdata3()
	{
		System.out.println("Class X>>getdata3");
		
	}

}
public class Final1
{
	public static void main(String[] args)
	{
		Y obj=new Y();
		obj.getdata1();
		obj.getdata2();
		X obj1=new X();
		obj1.getdata3();
	}
}	
	