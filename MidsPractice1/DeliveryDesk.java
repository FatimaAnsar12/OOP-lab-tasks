public class DeliveryDesk{
private String deskName;
private FoodOrder[] orders=new FoodOrder[3];
private int countOrder=0;
private DeliveryRider[] riders=new DeliveryRider[2];
private int countRider=0;

public DeliveryDesk(String deskName){
	this.deskName=deskName;
}
public String getName(){
	return deskName;}
public void addOrder(FoodOrder order){
	if(countOrder<orders.length){
	orders[countOrder]=order;
	countOrder++;}
	else{
	System.out.println("capacity is full");
}
}
public void addRider(DeliveryRider rider){
	if(countRider<riders.length){
	riders[countRider]=rider;
	countRider++;}
	else{
	System.out.println("capacity is full");
	}
}
public void displayDesk(){
for(int i=0;i<countRider;i++){
	System.out.println("Details of rider");
riders[i].displayInfo();}
for(int i=0;i<countOrder;i++){
	System.out.println("Details of orders");
orders[i].displayOrder();

}
	}
}