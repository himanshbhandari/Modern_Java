package O9practiceQsnStreamApi;

import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    int id;
    double amount;
    String type; // "Credit" or "Debit"

    public Transaction(int id, double amount, String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", amount=" + amount + ", type='" + type + "'}";
    }
}

public class O19GroupTrasactionExample {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 1000.0, "Credit"),
                new Transaction(2, 500.0, "Debit"),
                new Transaction(3, 200.0, "Credit"),
                new Transaction(4, 300.0, "Debit"),
                new Transaction(5, 150.0, "Credit")
        );
        Map<String , List<Transaction>>transMap=transactions.stream()
                .collect(Collectors.groupingBy(user->user.getType()));
        System.out.println(transMap);
    }
}