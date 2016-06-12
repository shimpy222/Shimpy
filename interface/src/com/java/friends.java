package com.java;

abstract class Account 
 {
	
	
	private int Irr=4;
	public int getIrr()
	{
		return Irr;
	}
	
	public abstract String getAccountType();
	
 }
class SavingAccount extends Account

{
	public String getAccountType()
	{
		return "Savings Account";
	}
}
class CurrentAccount extends Account

{
	public String getAccountType()
	{
		return "Current Account";
	}
}

 public class friends
 {
	 public static void main(String[] args)
	 {
		 Account myAccount=new SavingAccount();
		 System.out.println("AccountType::"+myAccount.getAccountType());
		 System.out.println("Irr:"+myAccount.getIrr());
	 }
 }	 
	
    

	


