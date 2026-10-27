public class FoodOrder{
private String orderId;
private Customer customer;
private Bill bill;

public FoodOrder(String orderId,Customer customer,String billNo,double totalAmount){
	this.orderId=orderId;
	this.bill=new Bill(billNo,totalAmount);
	this.customer=customer;
}
public void displayOrder(){
	System.out.println("OrderId : "+ orderId);
	bill.displayBill();
	customer.displayInfo();
}
	}