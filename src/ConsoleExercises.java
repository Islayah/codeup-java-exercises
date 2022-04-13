import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {

        double pi = 3.14159;
        System.out.format("The value of pie is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int input = scanner.nextInt();
//        System.out.println("You entered: " + input);

//        System.out.print("Enter 3 words: ");
//        String word1 = scanner.nextLine();
//        String word2 = scanner.nextLine();
//        String word3 = scanner.nextLine();
//        System.out.printf("Word One: %s%n Word Two: %s%n Word Three: %s%n", word1, word2, word3);
//
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.next();
//        String sentence = scanner.nextLine();
//        System.out.printf("Your sentence is: %s", sentence);

//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//        Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a               numeric type.
//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.
//                Display the area and perimeter of that classroom.
//                The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

//        scanner.useDelimiter("\n");
//        System.out.printf("Enter the length, width and height of the room: ");
        System.out.print("Enter the length: \nEnter the width: ");
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        double height = (double)Integer.parseInt(scanner.nextLine());
//        int area = length * width;
//        int perimeter = length * 2 + width * 2;
        double volume = length * width * height;
        System.out.printf("The area of the room is: %s%nThe perimeter of the room is: %s%n", (length * width), (length * 2 + width * 2));
        System.out.printf("The volume of the room is: %s", volume);

//        scanner.useDelimiter("\n");
//        System.out.printf("Enter the length, width and height of the room: ");
////        System.out.print("Enter the length: %nEnter the width: ");
//        Double length = scanner.nextDouble();
//        Double width = scanner.nextDouble();
//        Double height = scanner.nextDouble();
//        int i = ;
//        int i1 = Integer.parseInt(width);
//        double i2 = Integer.parseInt(height);
//        int area = i * i1;
//        int perimeter = i * 2 + i1 * 2;
//        double volume = i * i1 * i2;
//        System.out.printf("The area of the room is: %s%nThe perimeter of the room is: %s%n", area, perimeter);
//        System.out.printf("The volume of the room is: %s", volume);
    }
}
