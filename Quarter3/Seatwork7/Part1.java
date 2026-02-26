package Quarter3.Seatwork7;

public class Part1 {
    public static void main(String[] args) {
        int num1 = 350;
        int num2 = 0;

        try {
            int res = num1 / num2;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        System.out.println("Program reached line 15, and ended successfully without exiting.");
    }
}
