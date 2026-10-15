class Student{
	String name;
	int rollNum;
	String department;

	Student(){
		this("Zainab",52);
	name="Fatima";
	rollNum=20;
	department="CS";

			
	}
	Student(String name,int rollNum){
		this("Maham",27,"CS");
		this.name=name;
		this.rollNum=rollNum;
		
		}
	Student(String name,int rollNum, String department){
		this.name=name;
		this.department=department;
		this.rollNum=rollNum;
	}
		
	void displayDetails(){
		System.out.println(name);
		System.out.println(rollNum);
		System.out.println(department);

	}

		}
public class Constructors{
	public static void main(String args[]){

	Student s1=new Student();
	Student s2=new Student("Zainab",52);
	Student s3=new Student("Maham",27,"CS");

	s2.displayDetails();
	s1.displayDetails();
	s3.displayDetails();
	}
		}	
