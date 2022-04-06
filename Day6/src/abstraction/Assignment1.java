package abstraction;

public class Assignment1
{
Assignment1()
{
	System.out.println("assignment1 is the class constructor");
}
}
class Student extends Assignment1
{
	Student()
	{
		super();
		System.out.println("this is the subclass class constructor");
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Student1 s=new Student1();
		
	}

}
