package net.javaguide.banking.dto;

public class AccountDTO {
    private Long id;
    private String accountHolderName;
    private double balance;

    public AccountDTO(String accountHolderName, double balance, Long id) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.id = id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
