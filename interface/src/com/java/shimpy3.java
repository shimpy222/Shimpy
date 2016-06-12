package com.java;

class Outer
{
private int i=10;

   class Innerclass1
   {
	   public Innerclass1()
{
		   System.out.println("Innerclass1 Constructor");
		   
}
	   public void getInnerclass1Data()
	   {
		   System.out.println("Inner class1 calling and value of i is"+i);
		   
	   }
   }
   
   public void getOuterclassData()
   {
	   System.out.println("Outer class calling");
    
   
   Innerclass1 obj=new Innerclass1();
   obj.getInnerclass1Data();
   }
}
   public class shimpy3
   {
	   public static void main(String args[])
	   {
		   Outer obj=new Outer();
		   obj.getOuterclassData();
		   Outer.Innerclass1 obj1=new Outer().new Innerclass1();
		   obj1.getInnerclass1Data();
		   
	   }
	   }
	   
   
   