package Quarter3.Seatwork7;

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class Part2 {
    static void checkPassword(String password) throws PasswordException {
        if (!password.equals("angherapnetongsubjectnato")) {
            throw new PasswordException("Password is incorrect.");
        } else {
            System.out.println("Logged in successfully.");
        }
    }

    public static void main(String[] args) {
        try {
            checkPassword("anghirapnitongsubjectnato");
        } catch (PasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
