class Employee{
	public static void main(String args[]){
	Employe e1=new Employe();
	Employe e2=new Employe(100,"ayehsa");
	Employe e3=new Employe(20,"maria",30000);
	Employe e4=new Employe(30,"atika",5000);
	Employe e5=new Employe(40,"zainab",60000);
	e1.showSummary();
	e2.showSummary();
	e3.showSummary();
	e4.showSummary();
	e5.showSummary();
	e1.raiseSalary(10);
	}
		}
