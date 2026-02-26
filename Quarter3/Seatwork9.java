package Quarter3;

import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
class Task1 {
    Scanner sc = new Scanner(System.in);

    void run() {
        double conversion = 0;
        double unit = 0;
        System.out.println("=== Eya's Weight Converter ===");
        System.out.println("Please choose an initial unit ;; \n [lb] Pounds / [kg] Kilograms / [g] Grams");
        System.out.print("Type the corresponding letters (convert from): ");
        String choice1 = sc.nextLine();
        System.out.print("Type the corresponding letters (convert to): ");
        String choice2 = sc.nextLine();
        switch (choice1) {
            case "lb":
                switch (choice2) {
                    case "lb":
                        conversion = 1;
                        break;
                    case "kg":
                        conversion = 0.45359237;
                        break;
                    case "g":
                        conversion = 453.59237;
                        break;
                }
                break;
            case "kg":
                switch (choice2) {
                    case "lb":
                        conversion = 2.204622;
                        break;
                    case "kg":
                        conversion = 1;
                        break;
                    case "g":
                        conversion = 1000;
                        break;
                }
                break;
            case "g":
                switch (choice2) {
                    case "lb":
                        conversion = 0.0022046226;
                        break;
                    case "kg":
                        conversion = 0.001;
                        break;
                    case "g":
                        conversion = 1;
                        break;
                }
                break;

        }
        System.out.print("Amount to convert (" + choice1 + " -> " + choice2 + "): ");
        unit = sc.nextDouble();
        double product = unit * conversion;
        System.out.println("Answer: " + product + choice2);

        sc.close();
    }

}

class Task2 {
    Scanner sc = new Scanner(System.in);

    void run() {
        System.out.println("=== Eya's Calculator ===");
        System.out.println(
                "Please choose an operation ;; \n [1] Addition / [2] Subtraction / [3] Multiplication / [4] Division");
        System.out.print("Type the number corresponding to the operation: ");
        int operation = sc.nextInt();
        System.out.print("Type the first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Type the second number: ");
        double n2 = sc.nextDouble();
        double result = 0;
        char op = 'a';
        switch (operation) {
            case 1:
                result = n1 + n2;
                op = '+';
                break;
            case 2:
                result = n1 - n2;
                op = '-';
                break;
            case 3:
                result = n1 * n2;
                op = '*';
                break;
            case 4:
                result = n1 / n2;
                op = '/';
                break;
        }
        System.out.println(n1 + " " + op + " " + n2 + " = " + result);
    }
}

class Task3 {
    Random r = new Random();

    void run() {
        int dice = r.nextInt(6) + 1;
        System.out.println("=== Eya's Dice Roller ===");
        System.out.println("Rolling a dice… " + dice);
    }
}

class Task4 {
    Scanner sc = new Scanner(System.in);

    void run() {
        String name = "";
        System.out.println("=== Eya's Input Checking ===");
        System.out.print("Enter a name: ");
        try {
            name = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        if (name.length() <= 0) {
            System.out.println("Name cannot be empty!");
            run();
        }
    }
}

class Task5 {
    Timer t = new Timer();
    TimerTask hello_print = new TimerTask() {
        public void run() {
            System.out.println("hello!");
        }
    };

    void run() {
        System.out.println("=== Eya's Timer System ===");
        System.out.println("Printing \"hello\" in 5s…");
        t.schedule(hello_print, 5000);
    }
}

class Task6 {
    Random r = new Random();
    String[] baseWords = {
            "apple", "mountain", "cloud", "river", "ocean", "forest", "galaxy",
            "syntax", "logic", "algorithm", "coffee", "keyboard", "sunset",
            "bridge", "quantum", "velocity", "horizon", "cipher", "pixel", "echo"
    };
    Scanner sc = new Scanner(System.in);

    void run() {
        System.out.println("=== Eya's Hangman ===");
        int lives = 5;
        String word = baseWords[r.nextInt(baseWords.length)];
        char[] parsedWords = word.toCharArray();
        System.out.println("You have " + lives + " lives left.");
        String censored = "";
        for (char c : parsedWords) {
            censored = censored + "_";
        }
        while (lives > 0) {
            System.out.println("You have " + lives + " lives left.");
            boolean found_letter = false;
            System.out.println("Your word is " + censored);
            System.out.print("Please input a letter: ");
            char letter = Character.toLowerCase(sc.next().charAt(0));
            for (int i = 0; i < parsedWords.length; i++) {
                if (parsedWords[i] == letter) {
                    censored = censored.substring(0, i) + letter + censored.substring(i + 1);
                    found_letter = true;
                }

            }
            if (!found_letter) {
                lives = lives - 1;
            }

        }
    }
}

class Task7 {
    Timer t = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            System.out.println("Task finished!");
        }
    };
    Scanner sc = new Scanner(System.in);

    void run() {
        System.out.println("=== Eya's Timer ===");
        System.out.print("Please choose a time (in seconds): ");
        int ms = sc.nextInt() * 1000;
        t.schedule(task, ms);
    }
}

public class Seatwork9 {

    public static void main(String[] args) {
        Task1 task_one = new Task1();
        task_one.run();
        Task2 task_two = new Task2();
        task_two.run();
        Task3 task_three = new Task3();
        task_three.run();
        Task4 task_four = new Task4();
        task_four.run();
        Task5 task_five = new Task5();
        task_five.run();
        Task6 task_six = new Task6();
        task_six.run();
        Task7 task_seven = new Task7();
        task_seven.run();
    }
}