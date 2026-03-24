package Bankjava;

public class User {
    private String username;
    private String login;
    private String password;
    private Account mAccount;

    public User(String username, String login, String password, Account account) {
        this.username = username;
        this.login = login;
        this.password = password;
        this.mAccount = account;

    }
    public String getUsername() {
        return username;
    }
    public String getLogin() {
        return login;
    }
    public Account getAccount() {
        return mAccount;
    }
    public boolean checkPassword(String typedPassword) {
        return this.password.equals(typedPassword);
    }
}
