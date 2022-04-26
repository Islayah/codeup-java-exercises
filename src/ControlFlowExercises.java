import java.util.Scanner;

public class ControlFlowExercises {
//    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1. Loop Basic Exercises
//        A. While
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }

//        B. Do While
//        int x = 0;
//        int y = 100;
//        long z = 2;
//        int square = z * z;
//        ● Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        do {
//            System.out.println(x);
//            x += 2;
//        } while (x <= 100);
//        ●  Alter your loop to count backwards by 5's from 100 to -10.
//        do {
//            System.out.println(y);
//            y -= 5;
//        } while (y >= -10);
//        ●  Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//        do {
//            System.out.println(z);
//            z *= z;
//        } while (z < 1000000);

//        C. For Loop
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//        for (long z = 2; z < 1000000; z *= z) {
//            System.out.println(z);
//        }


//        2. Fizzbuzz
//        int num = 100;
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//        ********* Walkthrough Code **********
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        3. Display table of powers
        boolean anotherGrade = true;
//        System.out.println("Pick a number:");
//        int userInt = scanner.nextInt();
//
//        System.out.println("Here if your table:");
//
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i <= userInt; i++) {
//            System.out.printf("%-6d | %-7d | %-6d%n", i, i * i, i * i * i);
//        }

//        4. Convert given number grades into letter grades
        do {
            System.out.println("Pick a number:");
            int userInt = scanner.nextInt();

            if (userInt >= 88) {
                System.out.println("A");
            } else if (userInt >= 67) {
                System.out.println("B");
            } else if (userInt >= 60) {
                System.out.println("C");
            } else {
                System.out.println("Failed.");
            }

            System.out.println("Would you like to continue? (Y/N)");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("Y")) {
                anotherGrade = false;
            }
        } while (true);
    }
}
