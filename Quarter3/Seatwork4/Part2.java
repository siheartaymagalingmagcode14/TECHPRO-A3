package Quarter3.Seatwork4;

public class Part2 {
    public int calculateArea(int m) {
        return m*m;
    }

    public double calculateArea(double l, double w) {
        return l*w;
    }

    public static void main(String[] args) {
        Part2 c = new Part2();

        int sqArea = c.calculateArea(10);
        double rcArea = c.calculateArea(300, 400);

        System.out.println("Square Area: " + sqArea);
        System.out.println("Rectangle Area: " + rcArea);
    }
}
