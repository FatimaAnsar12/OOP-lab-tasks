 public class DeliveryRider extends Person{
	String vehicleNumber;

public DeliveryRider(String personId,String name,String vehicleNumber){
	super(personId,name);
	this.vehicleNumber=vehicleNumber;
}
@Override
public void displayInfo(){
	super.displayInfo();
	System.out.println("vehicleNumber:"+vehicleNumber);
}
	}
	

