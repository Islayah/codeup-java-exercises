import java.util.Scanner;

/*public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Talk to Bob\n");
        String userInput = scanner.nextLine();

//        ***** If Statement that works for exercise *****
        if (userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}*/

public class Bob {
    public static void main(String[] args) {
        converse(getInput());
    }
    public static String getInput() {
        return new Scanner(System.in).nextLine()
;    }

    public static void converse(String userInput) {
        if (userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
