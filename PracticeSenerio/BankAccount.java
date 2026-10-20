class BankAccount{
	private String owner;
	private double balance;


	BankAccount(String owner){
		this.owner="unknown";				
		this.balance=0.0;

}
 	BankAccount(String owner,double balance){
		this.owner=owner;
		if(balance!=0.0 && balance>0.0){
			this.balance=balance;
}
		else{
			this.balance=0.0;
}
	}
	public double getBalance(){
		return balance;
	

		}
	public String getOwner(){
		return owner;
	}
}
