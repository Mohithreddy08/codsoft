import java.util.Scanner;
public class ATMInterface {
	  private Bank bank;

	    public ATMInterface(Bank bank) {
	        this.bank = bank;
	    }

	    public void start() {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Welcome to the ATM!");

				while (true) {
				    System.out.print("Enter account number (0 to exit): ");
				    int accountNumber = scanner.nextInt();

				    if (accountNumber == 0) {
				        break;
				    }

				    Account account = bank.getAccount(accountNumber);

				    if (account == null) {
				        System.out.println("Invalid account number. Please try again.");
				        continue;
				    }

				    System.out.println("Account balance: " + account.getBalance());

				    System.out.print("Enter amount to deposit: ");
				    double depositAmount = scanner.nextDouble();
				    account.deposit(depositAmount);

				    System.out.println("Account balance after deposit: " + account.getBalance());

				    System.out.print("Enter amount to withdraw: ");
				    double withdrawAmount = scanner.nextDouble();

				    if (withdrawAmount > account.getBalance()) {
				        System.out.println("Insufficient balance. Withdrawal canceled.");
				    } else {
				        account.withdraw(withdrawAmount);
				        System.out.println("Account balance after withdrawal: " + account.getBalance());
				    }
				}
			}

	        System.out.println("Thank you for using the ATM!");
	    }

	    public static void main(String[] args) {
	        Bank bank = new Bank();
	        Account account1 = new Account(12345, 1000);
	        Account account2 = new Account(67890, 500);
	        bank.addAccount(account1);
	        bank.addAccount(account2);

	        ATMInterface atmInterface = new ATMInterface(bank);
	        atmInterface.start();
	    }
	}
	

