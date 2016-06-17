package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	public static void main(String[] args)
	{
		List<Integer> MyList=new ArrayList<Integer>();
		
		MyList.add(10);
		MyList.add(20);
		MyList.add(30);
		MyList.add(40);
		MyList.add(50);
		
		System.out.println(MyList);
		
		for(int value:MyList)
		{
			System.out.println(value);
		}
		
	}

}
