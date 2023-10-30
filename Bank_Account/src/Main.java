import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);

        int option;
        Bank_Account[] accounts = new Bank_Account[100]; 
        int accountCount = 0;

        do {
            System.out.println("Choose an option: ");
            System.out.println("1) Register Account 2) See registered accounts 3) Exit");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println();
                System.out.println("Enter the name of the account: ");
                String name = scanner.nextLine();
                System.out.printf("Enter the value of the initial deposit of %s: %n", name);
                double value = scanner.nextDouble();
                scanner.nextLine();
                
                try {
                Bank_Account account = new Bank_Account(value, name);
                interactWithAccount(account, scanner);
                accounts[accountCount++] = account;

                System.out.println();
                }
                catch(Exception IllegalArgumentException) {
                	System.out.println("Value cannot be negative");
                }
            } else if (option == 2) {
                System.out.println("Registered Accounts:");
                for (int i = 0; i < accountCount; i++) {
                    Bank_Account account = accounts[i];
                    System.out.println("Account: " + account.name);
                    System.out.println("Balance: $" + account.balance);
                    System.out.println();
                }
                sleep(1500);
            } else if (option != 3) {
                System.out.println("Invalid option");
                sleep(1500);
            }
        } while (option != 3);

        System.out.println("Thank you for using our system!");
        sleep(1500);

        scanner.close();
    }

    private static void interactWithAccount(Bank_Account account, Scanner scanner) {
        int option;
        int value;

        do {
            System.out.println("\nWhat would you like to do with the account?\n");
            System.out.println("1) See total balance."
                    + " 2) Deposit." + " 3) Withdraw." + " 4) Exit");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.printf("The total balance of %s is $ %.2f%n%n", account.name,
                        account.showTotalBalance());
                sleep(1500);

            } else if (option == 2) {
                System.out.println("Choose how much to deposit: ");
                try {
                value = scanner.nextInt();
                account.deposit(value);
                System.out.println("Deposit successfully completed");
                sleep(1500);
                }
                catch(Exception IllegalArgumentException) {
        			System.out.println("Value cannot be negative.");
                }
                System.out.println();
            } else if (option == 3) {
            	try {
                System.out.println("Choose how much to withdraw: ");
                value = scanner.nextInt();
                account.withdraw(value);
                System.out.println("Withdraw successfully completed");
                sleep(1500);
                System.out.println();
            	}
            	catch(Exception IllegalArgumentException) {
        			System.out.println("Value cannot be bigger that your balance.");
                }
            } else if (option != 4) {
                System.out.println("Invalid option");
                sleep(1500);
            }
        } while (option != 4);
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
