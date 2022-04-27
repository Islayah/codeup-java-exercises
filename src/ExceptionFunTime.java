import util.Input;
import util.InputTest;

import java.util.InputMismatchException;
import java.util.Scanner;

//public class ExceptionFunTime {
//
//    public static void main(String[] args) throws Exception {
//        method1();
//    }
//
//    private static void method1() throws Exception {
//        method2();
//    }
//
//    private static void method2() throws Exception {
//        Scanner scanner = new Scanner(System.in);
//            method3(scanner);
//    }
//
//    private static void method3(Scanner scanner) {
//        if (scanner.hasNextInt()) {
//            System.out.println(scanner.nextInt());
//        } try {
//            System.out.println("enter an integer: ");
//            int myInt = scanner.nextInt();
//            System.out.println(myInt);
//        } catch (InputMismatchException ex) {
//            System.out.println("No!");
////            throw new IllegalArgumentException("File Not Found");
//            method3(scanner);
//
//        }
//    }
//}



public class ExceptionFunTime {

    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        Scanner scanner = new Scanner(System.in);
        method3(scanner);
    }

    // TODO: how can we handle the possible InputMismatchException and allow the user to enter their integer again?
    private static void method3(Scanner scanner) {
        try {
            System.out.println("enter an integer");
            int myInt = scanner.nextInt();
            System.out.println(myInt);
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
            System.out.println("not an int comma fam");
//            Below code is not needed but fixes the problem, which was recursive infinite calls breaking memory or something like that
//            scanner.nextLine();
//            method3(scanner);
//            method1();
        }
    }
}
