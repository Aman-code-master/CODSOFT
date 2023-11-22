
import java.util.Scanner;

		class BankAccount {
		    private double balance;

		    public BankAccount(double initialBalance) {
		        this.balance = initialBalance;
		    }

		    public double getBalance() {
		        return balance;
		    }

		    public void deposit(double amount) {
		        if (amount > 0) {
		            balance += amount;
		            System.out.println("Deposit successful. New balance: " + balance);
		        } else {
		            System.out.println("Invalid amount for deposit.");
		        }
		    }

		    public void withdraw(double amount) {
		        if (amount > 0 && amount <= balance) {
		            balance -= amount;
		            System.out.println("Withdrawal successful. New balance: " + balance);
		        } else {
		            System.out.println("Insufficient funds or invalid amount for withdrawal.");
		        }
		    }
		}

		class ATM {
		    private BankAccount account;
		    private Scanner scanner;

		    public ATM(BankAccount account) {
		        this.account = account;
		        this.scanner = new Scanner(System.in);
		    }

		    public void showMenu() {
		    	
		        
		        System.out.println("1. Check Balance");
		        System.out.println("2. Deposit");
		        System.out.println("3. Withdraw");
		        System.out.println("4. Exit");
		        System.out.println("********************");
		    }

		    public void run() {
		        int choice;
		        do {
		            showMenu();
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();
		            switch (choice) {
		                case 1:
		                    checkBalance();
		                    break;
		                case 2:
		                    deposit();
		                    break;
		                case 3:
		                    withdraw();
		                    break;
		                case 4:
		                    System.out.println("Thank you for using the ATM!");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please select a valid option.");
		            }
		        } while (choice != 4);
		    }

		    private void checkBalance() {
		        System.out.println("Your current balance is: " + account.getBalance());
		    }

		    private void deposit() {
		        System.out.print("Enter the amount to deposit: ");
		        double amount = scanner.nextDouble();
		        account.deposit(amount);
		    }

		    private void withdraw() {
		        System.out.print("Enter the amount to withdraw: ");
		        double amount = scanner.nextDouble();
		        account.withdraw(amount);
		    }
		}

		public class AtmInterface {

			public static void main(String[] args) {
				System.out.println("Welcome to the ATM!");
				Scanner sc =new Scanner (System.in);
				 System.out.print("Enter your four Digit PIN: ");
			        int enteredPin = sc.nextInt();
			
		        BankAccount userAccount = new BankAccount(10000.0); // Initial balance
		        ATM atm = new ATM(userAccount);
		        atm.run();
		    }
		
		}

	