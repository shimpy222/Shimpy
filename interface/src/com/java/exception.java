package com.java;

public class exception
{

	public static void main(String[] args) 
	{
		int number=0;
		try
		{
			number=10/0;
		}
catch(ArithmeticException exception)
		{
	       System.out.println("Exception:"+exception);
		}
		 System.out.println("Result:"+number);
	}
}


