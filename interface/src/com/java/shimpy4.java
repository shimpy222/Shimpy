package com.java;

class A
{
	public int a=10;
	public static int b=20;
	public void getData()
	{
		System.out.println("value of a::"+a);
		System.out.println("value of b::"+b);
		
	}

}
public class shimpy4
{
	public static void main(String[] args)
	{
		A obj1=new A();
		obj1.getData();
		
	}
}
