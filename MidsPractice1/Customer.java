 public class Customer extends Person{
private String adress;

public Customer(String personId,String name,String adress){
	super(personId,name);
	this.adress=adress;
}
@Override
public void displayInfo(){
	super.displayInfo();
	System.out.println("adress"+adress);
}
	}
