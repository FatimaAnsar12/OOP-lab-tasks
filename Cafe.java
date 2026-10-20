class Cafe{
	public static void main(String args[]){
	Cafeteria c1=new Cafeteria("C1","ALI",500);
	Cafeteria c2=new Cafeteria("C2","ALIAS");
	Cafeteria c3=new Cafeteria("C3");

	System.out.println(c1.getBalance());  
        System.out.println(c2.getBalance());
        System.out.println(c3.getHolderName());

	System.out.println(c1.pay(150));               	System.out.println(c1.pay(40, 3));     
        System.out.println(c1.pay(40, 0));     
        System.out.println(c1.pay(-5));        
        System.out.println(c1.pay(99999));     
	}}