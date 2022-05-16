package com.tns.application;

import com.tns.framework.BankAcc;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMCurrentAcc extends CurrentAcc
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(float creditLimit) {
		float creditLimit1= creditLimit+CurrentAcc.getAccBal();
		System.out.println("Account No: "+CurrentAcc.getAccNo()+"\n"+"Account Name: "+CurrentAcc.getAccNm()+"\n"+"Account Balance: "+CurrentAcc.getAccBal()+"\n"+"Credit limit: "+CurrentAcc.getcreditLimit());
	}
    @Override
	public void deposite(float accBal) {
		System.out.println();
		}
	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" +super.toString()+" ,getAccBal()"+getAccBal()+"]";
				 	}
     
}
