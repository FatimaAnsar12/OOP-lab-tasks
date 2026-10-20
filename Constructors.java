class Constructors{
	public static void main (String args[]){
		Bus b1=new Bus();			
		Bus b2=new Bus("Lahore-Campus",67);			
		Bus b3=new Bus();
	System.out.println("route1: " + "" + b1.getRoute());
	System.out.println("route2: " + "" + b2.getRoute());
	System.out.println("seats1: " + "" + b1.getSeats());
	System.out.println("seats2: " + "" + b2.getSeats());
	}
			}
