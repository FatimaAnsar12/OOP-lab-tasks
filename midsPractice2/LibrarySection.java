public class LibrarySection{
	private String name;
	private LibraryItems[] items=new LibraryItems[4];
	private int count=0;
public LibrarySection(String name){
	this.name=name;}
public void addItem(LibraryItems item){
	if(count<items.length){
	items[count]=item;
	count++;}
	else
	System.out.println("section full");			
}
public void getSectionName(){
	System.out.println("SECTION NAME :"+ name);
	}
	
public void displayItems(){
	for(int i=0;i<count;i++){
		System.out.println("Displaying items : ");
	items[i].displayInfo();
}
	}
		}