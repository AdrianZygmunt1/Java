package Bankjava;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String number, double startowyStan) {
        this.accountNumber = number;
        this.balance = startowyStan;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Nie można ustawić ujemnego salda.");
        }
    }
}
