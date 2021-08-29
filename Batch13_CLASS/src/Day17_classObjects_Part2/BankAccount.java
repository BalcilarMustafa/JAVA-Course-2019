package Day17_classObjects_Part2;

public class BankAccount {
	
	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amoun) {   
		
		System.out.println("depositing $" + amoun + " to " + "account number:"+accountNumber);
		balance+=amoun;
	}
	
	public void withdraw(double amount) {
		
		System.out.println("Withdrawing $" + amount + " from " + "account number:"+accountNumber);
		balance-=amount;
		
		if(balance<0) {
			balance-=35;
		}
	}
	
	public void showBalance() {
		System.out.println("---------------");
		System.out.println("acountHolder: " + accountHolder);
		System.out.println("accountNumber:" + accountNumber);
		System.out.println("balance: $" + balance);
		System.out.println("---------------");
		
	}
	
	public void charge(double price,String item) {
		if(balance>=price) {
			System.out.println("buying " + item + " for $ " + price + " from " +"account number:"+ accountNumber);
			balance-=price;
		}else {
			System.out.println("insufficient funds to purchase " + item + " from " + accountNumber);
		}
	}	
}
