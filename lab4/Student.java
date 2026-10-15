public class Student{
	int id;
	String name ;
	int completedCredits ;

 void printSummary(){
	System.out.println(name + id + completedCredits);
	}
}
 class Demo{
	public static void main(String []args){
	
	Student s1=new Student();
	s1.name="Fatima Ansar";
	s1.id=20;
	s1.completedCredits=18;
	s1.printSummary();
	}
}
