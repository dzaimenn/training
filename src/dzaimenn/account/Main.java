package dzaimenn.account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();
        TransactionManager transactionManager = new TransactionManager();

        boolean running = true;
        while (running) {
            System.out.println("1. Add Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Display All Accounts");
            System.out.println("4. Make Transaction");
            System.out.println("5. Display All Transactions");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.next();

                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();

                    Account account = new Account(accountNumber, balance);
                    accountManager.addAccount(account);
                    break;
                case 2:
                    System.out.print("Enter account number to remove: ");
                    String accountNumberToRemove = scanner.next();

                    accountManager.removeAccount(accountNumberToRemove);
                    break;
                case 3:
                    accountManager.displayAllAccounts();
                    break;
                case 4:
                    System.out.print("Enter sender account number: ");
                    String fromAccountNumber = scanner.next();

                    System.out.print("Enter receiver account number: ");
                    String toAccountNumber = scanner.next();

                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();

                    Transaction transaction = new Transaction(fromAccountNumber, toAccountNumber, amount);
                    transactionManager.addTransaction(transaction);
                    break;
                case 5:
                    transactionManager.displayAllTransactions();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

}