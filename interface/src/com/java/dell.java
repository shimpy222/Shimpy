package com.java;

interface SBI_Account
{
public int getIrr();
public String getAccountType();
}

class HDFC_CurrentAccount implements SBI_Account
{
public int getIrr()

{
	return 6;
}


public String getAccountType()
{
	return "Current Account";
}
}
class SBI_SavingAccount implements SBI_Account
{
public int getIrr()

{
	return 5;
}


public String getAccountType()
{
	return "Saving Account";
}
}


public  class dell
{
	public static void main(String[] args)
	 {
		 SBI_SavingAccount myAccount=new SBI_SavingAccount();
		 System.out.println("AccountType::"+myAccount.getAccountType());
		 System.out.println("Irr:"+myAccount.getIrr());
	 }

}

