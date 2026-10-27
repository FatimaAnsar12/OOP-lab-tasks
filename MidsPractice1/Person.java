public class Person{
String personId;
String name;

public Person(String personId,String name){
	this.name=name;
	this.personId=personId;
}
public void displayInfo(){
	System.out.println("Person name : "+name);
	System.out.println("Person id : "+ personId);
}

}	