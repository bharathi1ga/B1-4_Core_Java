package abstraction;

 class Assignment
{
    void message()
    {
    	System.out.println("This is the first super class");
    }
}
 class Student extends Assignment
    {
    	void message()
    	{
    		System.out.println("This is the first subclass");
    	}
    	void display()
    	{
    		message();
    		super.message();
    	}
    }
 class Main
 {
	public static void main(String[] args) 
	{
		Student s = new  Student();
		s.display();
	}

}
