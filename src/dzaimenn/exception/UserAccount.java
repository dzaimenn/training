package dzaimenn.exception;

public class UserAccount {
    private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login(String enteredUsername, String enteredPassword) throws InvalidCredentialsException {
        if (!username.equals(enteredUsername) || !password.equals(enteredPassword)) {
            throw new InvalidCredentialsException("Invalid username or password.");
        } else {
            System.out.println("Login successful. Welcome, " + username + "!");
        }
    }

}