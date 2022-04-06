package com.tns.polymorphism;

public class Overloaing_constructor
{
  String colour;
  int speed;
  Overloaing_constructor()
  {
	  System.out.println("I brought Renault tribo in 2021");
  }
  Overloaing_constructor(String colour,int speed)
  {
	  this.colour=colour;
	  this.speed=speed;
  }
	public static void main(String[] args) {
		Overloaing_constructor r=new Overloaing_constructor();
		Overloaing_constructor r1=new Overloaing_constructor("yellow",50);
		System.out.println(r1.colour+" "+r1.speed);
		// TODO Auto-generated method stub

	}

}
