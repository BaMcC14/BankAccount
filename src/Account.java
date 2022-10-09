import java.util.Scanner;
public class Account {
Scanner scanner = new Scanner(System.in);

int previousTransaction;
int balance = 0;
String name;
String accountID;

Account(String cname, String cID){
	cname = name;
	cID = accountID;
}

public void accountBalance() {
	System.out.println(balance);
}
	
public void deposit(int moneyIn) {
	if(moneyIn != 0) {
	balance = balance + moneyIn;
	previousTransaction = moneyIn;
	}
}

public void withdraw(int moneyOut) {
	if(moneyOut != 0) {
	balance = balance - moneyOut;
	previousTransaction = -moneyOut;
	}
}

public void previousTransaction() {
	if(previousTransaction > 0) {
		System.out.println("Deposited: " + previousTransaction);
	}
	else if(previousTransaction < 0) {
		System.out.println("Withdrew: " + Math.abs(previousTransaction));
	}
	else {
		System.out.println("No Transaction Accured");
	}
}
	
public void calculateInterest(int years) {
	double interestRate = .0185;
	double newBalance =  (balance * interestRate * years) + balance;
	System.out.println("The current interest rate is: " + (interestRate * 100) + "%");
	System.out.println("The balance after " + years + " years would be: " + newBalance);

}

public void showMenu() {
	char option = '\0';
	System.out.println("Welcome" + name);
	System.out.println("You are in account ID" + accountID  +"\n");
	
	System.out.println("What would you like to do?\n");
	
	System.out.println("A. Check your balance");
	System.out.println("B. Make a deposit");
	System.out.println("C. Make a withdrawal");
	System.out.println("D. View previous Transaction");
	System.out.println("E. Calculate interest");
	System.out.println("F. Exit");

	

	do {
		System.out.println("Enter an option:\n");
		char option1 = scanner.next().charAt(0);
		option = Character.toUpperCase(option1);
		System.out.println();
	
		switch(option) {
		case 'A':
		
			System.out.println("=============================================");
			System.out.println("Balance = $" + balance);
			System.out.println("=============================================\n");
			break;
		case 'B':
			System.out.println("Enter Amount to Deposit");
			int moneyIn = scanner.nextInt();
			deposit(moneyIn);
			System.out.println();
			break;
		case 'C':
			System.out.println("Enter Amount to Withdraw");
			int moneyOut = scanner.nextInt();
			withdraw(moneyOut);
			System.out.println();
			break;
		case 'D':
			System.out.println("Previous Transaction:" );
			previousTransaction();
			break;
		case 'E':
			System.out.println("Enter the number of years of accrued interest: ");
			int years = scanner.nextInt();
			calculateInterest(years);
		case 'F':
			System.out.println("=================================================\n");
			break;
		default:
			System.out.println("Enter a valid value");
			break;
	
	}

	}
	while(option != 'F') ;
		System.out.println("Exit Account");
	
	
		
	
	
	
	
}	
	
}
