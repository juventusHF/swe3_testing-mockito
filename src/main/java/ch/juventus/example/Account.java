package ch.juventus.example;

import java.math.BigDecimal;

public class Account {


    private String id;

    private BigDecimal balance;

    public Account(String id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void addToBalance(BigDecimal amount) {
        balance = balance.add(amount);
    }
}
