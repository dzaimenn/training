package dzaimenn.account;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions;

    public TransactionManager() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        System.out.println("Transaction added successfully: From " + transaction.getFromAccountNumber() +
                " to " + transaction.getToAccountNumber() + ", Amount: " + transaction.getAmount());
    }

    public void displayAllTransactions() {
        System.out.println("All transactions:");
        for (Transaction transaction : transactions) {
            System.out.println("From: " + transaction.getFromAccountNumber() +
                    ", To: " + transaction.getToAccountNumber() +
                    ", Amount: " + transaction.getAmount());
        }
    }

}