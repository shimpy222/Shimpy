package com.collection;

public class Immutable 
{
public static void main(String[] args)
{
	StringBuffer name=new StringBuffer("sachin  ");
	name.append("tendulkar");
	System.out.println(name);
	System.out.println("Reverse::"+name.reverse());
	System.out.println("Length::"+name.length());
	
	char[] charArray=name.toString().toCharArray();
	for(int i=0;i<charArray.length;i++)
	{
		System.out.println(charArray[i]);
	}
			
}
}
