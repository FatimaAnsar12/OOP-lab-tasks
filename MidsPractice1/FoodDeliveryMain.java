public class FoodDeliveryMain{
public static void main(String args[]){
	Customer c1=new Customer("1","ASH","NewYORK");
	DeliveryRider d1=new DeliveryRider("A1","ALI","F110");
	DeliveryRider d2=new DeliveryRider("A2","TOM","H990I");
	FoodOrder f1=new FoodOrder("001",c1,"g1",200.0);
	FoodOrder f2=new FoodOrder("001",c1,"h1",300.0);

	DeliveryDesk g =new DeliveryDesk("FastFood");
	System.out.println("desk name = " + g.getName());

	g.addOrder(f1);
	g.addOrder(f2);

	g.addRider(d1);
	g.addRider(d2);
	g.displayDesk();
}
}
	