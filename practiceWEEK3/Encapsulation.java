class BankAccount{
	private int amount = 5000;
	
public int getbankAmount(){
	return amount;
	}
public void setbankAmount(int amount){
	this.amount=amount;
	}

public int changeAmount(int balance){
	if(balance>1000){
		amount=amount+balance;
	}
	return amount;
			
}
		}		


public class Encapsulation{
	public static void main(String args[]){
	
	BankAccount b1=new BankAccount();
	System.out.println(b1.getbankAmount());
	System.out.println(b1.changeAmount(2000));




}
	}	
