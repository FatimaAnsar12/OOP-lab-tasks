public class Book extends LibraryItems {
	private String author;
public Book(String itemId, String title, String barcodeNo,String shelfCode,String author){
	super(itemId,title,barcodeNo,shelfCode);

	this.author=author;
}	
@Override
public void displayInfo(){
	super.displayInfo();
	System.out.println("Author name : "+ author);
	}
 }