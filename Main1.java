abstract class BankAccount {
	private String accountNumber;
	private double balance;
	
	public static final String RESET = "\u001B[0m";
	public static final String BOLD = "\u001B[1m";
	public static final String GREEN = "\u001B[32m";
	public static final String BLUE = "\u001B[34m";
	public static final String RED = "\u001B[31m";
	public static final String BG_GRAY = "\u001B[47m\u001B[30m";

	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	public abstract void calculateInterest();
	
	public double getBalance() {
		return balance;
	}
	
	protected void deposit(double amount) {
		if (amount > 0) balance += amount;
	}
	
	public void displayAccountInfo() {
		System.out.println(BG_GRAY + " ACCOUNT ID: " + accountNumber  + RESET);
		System.out.println(BLUE + "Current Balance: $" + balance + RESET);
	}
}

class SavingsAccount extends BankAccount {
	private double interestRate = 0.05;
	
	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	@Override
	public void calculateInterest() {
		double interest = getBalance() * interestRate;
		deposit(interest);
		System.out.println(GREEN + BOLD + "Savings Interest added: $" + interest + RESET);
	}
}

class CheckingAccount extends BankAccount {
	private double fee = 2.50;
	
	public CheckingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	@Override
	public void calculateInterest() {
		System.out.println(RED + "Checking accounts do not earn interest. Processing fee: $" + fee + RESET);
	}
}
	
public class Main1 {
	public static void main(String[] args) {
		BankAccount mySavings = new SavingsAccount("SAV-9910", 1000);
		BankAccount myChecking = new SavingsAccount("CHK-4452", 500);
		
		System.out.println("\n" + BankAccount.BOLD + "~~~ BANKING SYSTEM DASHBOARD ~~~" + BankAccount.RESET);
		
		mySavings.displayAccountInfo();
		mySavings.calculateInterest();
		System.out.println("Update Savings: $" + mySavings.getBalance());
		
		System.out.println("-----------------------");
		
		myChecking.displayAccountInfo();
		myChecking.calculateInterest();
		
		System.out.println(BankAccount.BOLD+ "Transaction Complete." + BankAccount.RESET);
	}
}