package abstraction;
class Example11
{
	final void display()
	{
		System.out.println("Bharathi");
	}
}
public class Example3 extends Example11 
{
	 void display()
	    {
	    	
	    	System.out.println("Welcome");
	    }

	public static void main(String[] args) 
	{
		Example3 e=new Example3();
		e.display();
	}

}
