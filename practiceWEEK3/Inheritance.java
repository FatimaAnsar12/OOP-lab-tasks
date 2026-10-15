 class Animal{
	void eat()
	{
		  System.out.println("dog eats meat");
		}	
			}
class Dog extends Animal{
	void bark()
	{
		System.out.println("dogs bark");
	}
			}
public class Inheritance{
	public static void main(String args[]){
		Dog d1=new Dog();
		d1.eat();
		d1.bark();	
}
	}	
