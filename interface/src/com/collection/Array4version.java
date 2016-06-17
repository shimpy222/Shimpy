package com.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Array4version
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add ("Apple");
		list.add( "mango");
		//list.add (new integer(20))	;
		
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			String value=(String) iterator.next();
			System.out.println(value);
		}
				
	}

}
