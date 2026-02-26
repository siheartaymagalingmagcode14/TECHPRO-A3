package Quarter3;

class Student {
    String name;

    void displayName() {
        System.out.println("Student name: " + name);
    }
}

public class Seatwork6 {
    public static void main(String[] args) {
        Student s1 = new Student();

        try {
            s1.name = "Heart";
            s1.displayName();
        } catch (Exception student) {
            System.out.println("Error...");
        }
    }
}