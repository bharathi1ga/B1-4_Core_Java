package com.tns.application;

import com.tns.framework.BankAcc;
import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{

	private static float accBal;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		MMSavingAcc.accBal=accBal;
	}
	@Override
	public void withdraw(float accBal)
	{
		System.out.println("Account No: "+BankAcc.getAccNo()+"\n"+"Account Name: "+BankAcc.getAccNm()+"\n"+"Account Balance: "+BankAcc.getAccBal()+"\n"+"Mininum Balance: "+SavingAcc.getMINBAL());
	}
	public static float getaccBal()
	{
		return MMSavingAcc.accBal;
				
	}
	@Override
	public void deposite(float deposite_id)
	{
		
	}
	@Override
	public String toString()
	{
		return "MMSavingAcc [toString()="+super.toString()+",getaccBal()+"+getaccBal()+"]";
	}
   
	

}
