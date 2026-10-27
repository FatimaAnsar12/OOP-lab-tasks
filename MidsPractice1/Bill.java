public class Bill{
private String billNo;
private double totalAmount;

public Bill(String billNo,double totalAmount){
	this.billNo=billNo;
	this.totalAmount=totalAmount;
		

}
public void displayBill(){
	System.out.println("BillNo : "+billNo);
	System.out.println("TotalAmount : "+totalAmount);}
}
