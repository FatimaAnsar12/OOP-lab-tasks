public class LibraryItems{
	private String itemId;
	private String title;
	private BarcodeLabel label;

public LibraryItems(String itemId,String title,String barcodeNo, String shelfCode){
	this.itemId=itemId;
	this.title=title;
	this.label=new BarcodeLabel(barcodeNo,shelfCode);
	}

public void displayInfo(){
	System.out.println("ItemID:"+ itemId);
	System.out.println("title:" + title);
	System.out.println("BarcodeLabel:"+ label.getShelfCode());			System.out.println("BarcodeLabel:"+ label.getBarcodeNo());

}	
}
