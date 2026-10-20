class Cafeteria{
	private String cardID;
	private String name;
	private double balance;

	Cafeteria(String cardID,String name,double balance){
	this.cardID=(cardID==null||cardID.trim().isEmpty())? "unknown":cardID;
	this.name=(name==null||name.trim().isEmpty())? "guest":name;
	this.balance=(balance<0)?0.0:balance;

	}
	Cafeteria(String cardID,String name){
	this(cardID,name,0);

}
	Cafeteria(String cardID){
	this(cardID,"guest");
}
	boolean pay(double amount){
	if(amount<=0 || amount>balance){
		return false;}
	balance = balance-amount;
	return true;
}
	 boolean pay(double unitPrice,int quantity){
	if(unitPrice<=0 || unitPrice>balance || quantity <=0){
		return false;}
	balance = balance-(unitPrice*quantity);
	return true;}

	 boolean topUp(double amount){
	if(amount<=0 || amount>20000){
		return false;}
	balance = balance+amount;
	return true;}

	public String getCardID()     { return cardID; }
    	public String getHolderName() { return name; }
   	public double getBalance()    { return balance; }
		}















