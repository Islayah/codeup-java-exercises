import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter a number between 1 and 10: ");
//        int numInput = scanner.nextInt();
//        int userInput = getInteger(1, 10);
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(2, 1));
//        System.out.println(multiplication(2, 2));
//        System.out.println(division(2, 0));
//        System.out.println(modulus(26, 15));
    }

    static int addition(int x, int y) {
        return x + y;
    }
    static int subtraction(int x, int y) {
        return x - y;
    }
    static int multiplication(int x, int y) {
        return x * y;
    }
    static int division(int x, int y) {
        return x / y;
    }
    static int modulus(int x, int y) {
        return x % y;
    }

//    2.
//    public static int getInteger(int min, int max) {
//            int input;
//            Scanner scanner = new Scanner(System.in);
//            do {
//                System.out.print("Pick a number between " + min + " and " + max + ": ");
//                input = scanner.nextInt();
//            } while (input < min || input > max);
//        System.out.println("Good job");
//            return input;
//    }

//    public static int getInteger(int min, int max) {
//        if (min >= 1 && max <= 10);
//        System.out.println("Good job.");
//        return 0;
//    }  {
//        System.out.println("Try again.");
//    }

//    public static long getPower(int base, int exponent) {
//        if (exponent == 0) {
//            return 1;
//        } else if (exponent == 1) {
//            return base;
//        } else if (exponent == 2) {
//            return base * base;
//        }
//        return base * getPower(base, exponent - 1);
//    }




//    public static int getInteger(int min, int max) {
//        String userInput = scanner.next();
//        if (userInput <= 1 && userInput >= 10) {
//            System.out.println("You picked: ");
//        }
////        int userInput = getInteger(1, 10);
////        return getInteger(min, max);
//    }

//    public static void count(int n) {
//        if (n <= 0) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//    }
//
//    public static void main(String[] args) {
//        count(5);
//    }




//    public static int addition(int x, int y) {
//        return x + y;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(addition(5, 3));
//    }

// Outputs 8 (5 + 3)
}
