package com.collection;
public class Letters
{
public static void main(String[] args)
{
	StringBuffer name=new StringBuffer("sachin  ");
	name.append("tendulkar");
	System.out.println(name);
	
	StringBuffer name1=new StringBuffer("Sachin");
	{
		System.out.println(name.substring(4,6));
	}
}
}


