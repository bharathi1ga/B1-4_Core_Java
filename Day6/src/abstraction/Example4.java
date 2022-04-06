package abstraction;
final class Example11
{
	 void display()
	{
		System.out.println("Bharathi");
	}
}
public class Example4 extends Example11 
{
	 void display()
	    {
	    	
	    	System.out.println("Welcome");
	    }


	public static void main(String[] args) {
		Example4 e=new Example4();
		e.display();
	}

}
