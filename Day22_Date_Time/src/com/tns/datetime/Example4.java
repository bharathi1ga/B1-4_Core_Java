package com.tns.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Example4 {

	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();//27
		LocalDate date2=date1.plusDays(3);//+3
		System.out.println(date2);//30days total
		long df=ChronoUnit.DAYS.between(date1,date2);
		System.out.println(df);
	}

}
