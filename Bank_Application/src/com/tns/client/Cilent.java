package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Cilent {

	public static void main(String[] args) 
	{
		BankFactory obj=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(1001,"Bharathi",500.0f,true);
		CurrentAcc c=new MMCurrentAcc(1002,"Nikitha",1000.0f,50000.0f);
		System.out.println("Saving Account: ");
		s.withdraw(200);
		System.out.println();
		System.out.println("Current Account: ");
		c.withdraw(200);
		System.out.println(s);
		System.out.println();
		System.out.println(c);
		
		
	}

}
