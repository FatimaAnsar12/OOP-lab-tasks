
public class Magazine extends LibraryItems{
	private int issueNo;
public Magazine( String itemId, String title,String barcodeNo,String shelfCode,int issueNo){
	super(itemId,title,barcodeNo,shelfCode);
	this.issueNo=issueNo;
}	
@Override
public void displayInfo(){
	super.displayInfo();
	System.out.println("IssueNo : "+ issueNo);	
}
	}
