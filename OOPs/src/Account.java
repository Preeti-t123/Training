
public class Account {
	private int AccNo;
	private String holder;
	private double balance;
	
	public void paySlip() {
		System.out.println("Name: "+holder+"ID: "+AccNo+ "Salary: "+balance);
		
		
	}
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("salary: "+balance);
	}
	
	public void withdraw(double amount) {
		balance-=amount;
		System.out.println("salary: "+balance);
	}
	public static void main(String args[]) {
		Account a1=new Account();
		Account a2=new Account();
	}

	

}
