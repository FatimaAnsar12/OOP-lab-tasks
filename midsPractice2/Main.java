public class Main{
public static void main(String args[]){
	Book b1=new Book("A1","PROGRAMMING","A001","A","MARIAM");
	Book b2=new Book("B1","Discrete MATHS","B001","B","SANIA");
	Magazine m1=new Magazine("M1","DAILYNEWS","M001","M",001);
	LibrarySection section= new LibrarySection("Computing Section");

        section.addItem(b1);
        section.addItem(b2);
        section.addItem(m1);
	section.getSectionName();
	Book b3=new Book("C1","OOP","C001","C","ISSAC NEWTON");
	section.addItem(b3);
	Book b4=new Book("C1","OOP","C001","C","ISSAC NEWTON");
	section.addItem(b4);

 	section.displayItems();

	}
	}















