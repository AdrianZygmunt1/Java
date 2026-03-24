package Bankjava;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        Scanner scanner = new Scanner(System.in);
        String username;
        String accountNumber;
        String password;
        String login;
        User loggedInUser = null;
        while (true) {
            if (loggedInUser != null) {
                System.out.println("1. Sprawdź saldo");
                System.out.println("2. Wyloguj się");
                System.out.println("3. Wypłać pieniądze");
                System.out.println("4. Przelej pieniądze");
                System.out.println("5. Wyjdź");
                int userChoice = scanner.nextInt();
                scanner.nextLine();
                switch (userChoice) {
                    case 1:
                        System.out.println("Twoje saldo: " + loggedInUser.getAccount().getBalance());
                        break;
                    case 2:
                        loggedInUser = null;
                        System.out.println("Wylogowano.");
                        break;
                    case 3:
                        System.out.println("Podaj kwotę do wypłaty:");
                        double amount = scanner.nextDouble();
                        bankService.withdraw(loggedInUser, amount);
                        break;
                    case 4:
                        System.out.println("Podaj numer konta docelowego:");
                        String targetAccountNumber = scanner.nextLine();
                        System.out.println("Podaj kwotę do przelewu:");
                        amount = scanner.nextDouble();
                        bankService.transfer(loggedInUser, targetAccountNumber, amount);
                        break;
                    default:
                        System.out.println("Nieprawidłowy wybór, spróbuj ponownie.");
                }
                continue;
            }
            System.out.println("Witaj w banku!");
            System.out.println("1. Zaloguj się");
            System.out.println("2. Zarejestruj się");
            System.out.println("3. Wyjdź");
            int wybor = scanner.nextInt();
            scanner.nextLine();
            switch (wybor) {
                case 1:
                    System.err.println();
                    System.out.println("Podaj login:");
                    login = scanner.nextLine();
                    System.out.println("Podaj hasło:");
                    password = scanner.nextLine();
                    loggedInUser = bankService.login(login, password);
                    if (loggedInUser != null) {
                        System.out.println("Witaj " + loggedInUser.getUsername() + "!");

                    } else {
                        System.out.println("Błędny login lub hasło!");
                    }
                    break;
                case 2:
                    System.out.println("Podaj nazwę użytkownika:");
                    username = scanner.nextLine();
                    System.out.println("Podaj login:");             
                    login = scanner.nextLine();
                    System.out.println("Podaj hasło:");
                    password = scanner.nextLine();
                    System.out.println("Podaj numer konta:");
                    accountNumber = scanner.nextLine();
                    bankService.addUser(username, login, password, accountNumber);
                    break;
                case 3:
                    System.out.println("Do widzenia!");
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór, spróbuj ponownie.");
            }
        }
    }
}