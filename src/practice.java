import java.util.Random;
import java.util.Scanner;

public class practice {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(2, 1));
//        System.out.println(multiplication(2, 2));
//        System.out.println(division(2, 0));
//        System.out.println(modulus(26, 15));
//        System.out.println(multiplyByAdd(5,5));
//        System.out.println(recursiveMultiple(5, 5));
//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial(1, 10));
//        factorial(getInteger(1, 10));
//
//        boolean continueRunningApp = true;
//        do {
//            System.out.println(factorial(getInteger(1, 10)));
//            continueRunningApp = userContinue();
//        } while (continueRunningApp);
    }



    public static int addition (int x, int y) {
        return x + y;
    }
    public static int subtraction (int x, int y) {
        return x - y;
    }
    public static int multiplication (int x, int y) {
        return x * y;
    }
    public static double division (double x, double y) {
        return x / y;
    }
    public static int modulus (int x, int y) {
        return x % y;
    }
    public static int multiplyByAdd(int x, int y) {
        int sum = 0;
        for (int i = 1; i <= y; i++) {
            sum += x;
        }
        return sum;
    }
//    How to stop this is the bonus recursive. Not really sure what is going on
    public static int recursiveMultiple (int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }
//        How to proceed
        return (x + multiplyByAdd(x, y -1));
//        return 3 + 3 + 0
    }

    public static int getInteger (int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max + ":");
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("Try again");
            return getInteger(min, max);
        }
        return userInput;
    }

//    public static long factorial(int min, int max) {
//        int userInt = getInteger(min, max);
//        long result = 1;
//        for (int i = 1; i <= userInt; i++) {
//            result *= i;
//        }
//        return result;
//    }

//    public static long factorial(n) {
//        int userInt = getInteger(min, max);
//        long fact = 1;
//        String result = userInt + "! = ";
//        for (int i = 1; i <= userInt; i++) {
//            if (!(i == userInt)) {
//                result += i + " x ";
//            } else {
//                result += i + "";
//            }
//            fact *= i;
//        }
//        result += "  = " + fact;
//        System.out.println(result );
//    }

//    Recursive bonus for #3
//        if (n < 2) {
//            return 1;
//        }
//        return (n * factorial(n - 1);
//    }

    public static boolean userContinue() {
        System.out.println("Would you like to continue?");
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y");
    }

    public static int getSidesOfDice() {
        System.out.println("Enter the number of sides for your dice: ");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static void rollDice(int sides) {
        int diceOne = getRandomDiceResult(sides);
        int diceTwo = getRandomDiceResult(sides);
        System.out.println("Your die rolled: " + diceOne);
    }

    public static int getRandomDiceResult(int sides) {
        return (int)Math.floor(Math.random()*(sides-1+1)+1);
    }
}
