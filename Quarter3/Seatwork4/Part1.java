package Quarter3.Seatwork4;

public class Part1 {
    public void processPayment(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency);
    }

    public void processPayment(double amount, String currency, String paymentMethod) {
        System.out.println("Using " + paymentMethod + " for this transfer [" + amount +  " " +currency + "]");
    }

    public static void main(String[] args) {
        Part1 BankFunctions = new Part1();
        BankFunctions.processPayment(50, "Minecoins");
        BankFunctions.processPayment(10, "Hearts", "Lifesteal SMP");
    }
}
