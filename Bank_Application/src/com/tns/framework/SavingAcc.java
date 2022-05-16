package com.tns.framework;

public abstract class SavingAcc extends BankAcc
{ 
	private static boolean isSalaried;
	private static final float MINBAL=0.0f;
	
	public SavingAcc(int accNo,String accNm,float accBal,boolean isSalaried) {
		super(accNo,accNm,accBal);
		//this.isSalaried = isSalaried;
		SavingAcc.isSalaried=isSalaried;
	}
	
	public static boolean getisSalaried() {
		return isSalaried;
	}
    public static float getMINBAL() {
		return MINBAL;
	}

}
