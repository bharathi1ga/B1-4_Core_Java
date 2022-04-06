package abstraction;
class A
{
	String name="Bharathi";
}
class B extends A
{
	String name="Chandana";
	void print()
	{
		System.out.println("Hi, I am "+name);
		System.out.println("Hi, I am "+super.name);

	}
}
public class Example5 {

	public static void main(String[] args) {
		B b=new B();
		b.print();
		// TODO Auto-generated method stub

	}

}
