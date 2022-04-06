package abstraction;
abstract class Animal
{
	abstract void eat();
}
class Herbivores extends Animal
{
	void eat()
	{
		System.out.println("I am vegetarian");
	}
}
class Carnivores extends Animal
{
	void eat()
	{
		System.out.println("I am  Non-vegetarian");
	}
}
public class Abstract {

	public static void main(String[] args) 
	{
		Herbivores h=new Herbivores();
		Carnivores c=new Carnivores();
		h.eat();
		c.eat();
	}

}
