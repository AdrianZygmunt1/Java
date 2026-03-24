package Bankjava;

import java.util.*;

public class BankService {
    public ArrayList<User> usersList = new ArrayList<>();

    public void addUser(String username, String login, String password, String accountNumber) {
        for (User u : usersList) {
            if (u.getLogin().equals(login)) {
                System.out.println("Login jest już zajęty. Wybierz inny.");
                return;
            }else if (u.getAccount().getAccountNumber().equals(accountNumber)) {
                System.out.println("Numer konta jest już zajęty. Wybierz inny.");
                return;
            }
        }
        Account newAccount = new Account(accountNumber, 100.0);
        User newUser = new User(username, login, password, newAccount);
        usersList.add(newUser);
        System.out.println("Rejestracja udana! Możesz teraz się zalogować.");
    }

    public User login(String typedLogin, String typedPassword) {
        for (User u : usersList) {
            if (u.getLogin().equals(typedLogin) && u.checkPassword(typedPassword)) {
                return u;
            }
        }
        return null;
    }

    public void withdraw(User user, double amount) {
        if (user.getAccount().getBalance() >= amount) {
            user.getAccount().setBalance(user.getAccount().getBalance() - amount);
            System.out.println("Wypłacono " + amount + ". \nNowe saldo: " + user.getAccount().getBalance());
        } else {
            System.out.println("\nBrak wystarczających środków na koncie.");
        }
    }

    public void transfer(User sender, String targetAccountNumber, double amount) {
        if (sender.getAccount().getBalance() >= amount) {
            User recipient = null;
            for (User u : usersList) {
                if (u.getAccount().getAccountNumber().equals(targetAccountNumber)) {
                    recipient = u;
                    break;
                }
            }
            if (recipient != null) {
                sender.getAccount().setBalance(sender.getAccount().getBalance() - amount);
                recipient.getAccount().setBalance(recipient.getAccount().getBalance() + amount);
                System.out.println("Przelew wykonany. \nTwoje nowe saldo: " + sender.getAccount().getBalance());
            } else {
                System.out.println("\nNie znaleziono konta docelowego.");
            }
        } else {
            System.out.println("\nBrak wystarczających środków na koncie.");
        }
    }
}