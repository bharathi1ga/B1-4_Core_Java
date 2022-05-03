package com.tns.enum1;
enum Bike
{
	Pulser,R15,KTM,R3
}
public class Example3 {

	public static void main(String[] args) {
		Bike b=Bike.R3;
		switch(b)
		{
		case Pulser:
			System.out.println("You choose Pulser");
			break;
		case R15:
			System.out.println("You choose R15");
			break;
		case KTM:
			System.out.println("You choose KTM");
			break;
		default:
			System.out.println("You choose R3");
			break;
			
					
		}

	}

}
