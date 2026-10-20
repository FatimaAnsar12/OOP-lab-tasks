 class Demo{
	public static void main(String args[]){
	BankAccount b1=new BankAccount("Ali");
	BankAccount b2=new BankAccount("Sara", 5000.0);
	BankAccount b3=new BankAccount(" ", 200.0);
	BankAccount b4=new BankAccount("Hamza", -50.0);	

	System.out.println(b2.getBalance());
	System.out.println(b2.getOwner());
	System.out.println(b4.getBalance());
	
}
	}