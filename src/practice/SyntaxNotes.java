package practice;

import javafx.css.Declaration;

public class SyntaxNotes {
    public static void main(String[] args) {

/*        JavaScript Variable Declaration
        let something = value*/

//        Java Variable Declaration
//        Datatype -> name + value

//        Below are primitive data types
        byte dayOfMonth = 31;
//        Integers -128 to 127
        short employees = 10000;
//        Integers -32,768 to 32,767
        int daysInCentury = 36500;
//        Integers -2.1bil to 2.1bil
        long milesToMars = 33900000;
//        Integers -9.2quintillion(???) to 9.2quintiliion
        float roundedPi = 3.14f;
//        Float numbers up to 7 decimal points
        double bigDecimal = 3.141592653;
//        Precise float numbers up to 16 decimal points
        char yesNo = 'Y';
//        Char only accepts a single unicode character
        boolean halpMe = true;

//        Strings
        String myString = "Sample string.";

//        String escape sequences(There are more than what is in the curriculum)
        String randomQuote = "\"Some cliche quote\" - Barrack Obama";
        System.out.println(randomQuote);

        String backSlashes = "I can do backslash \\. Double backslash \\\\. And.... triple backslash \\\\\\";
        System.out.println(backSlashes);

        System.out.println("\t" + randomQuote + "\n" + backSlashes + "\n");

//        Constants
        final int SIDES_OF_A_DICE = 6;
        final String API_KEY = "b75b703d8195f6f433ca";
        final String GITHUB_API_BASE_URL = "https://api.github.com";

//        Casting
//        Example of implicit casting
        int myInteger = 900;
        long morePrecise = myInteger;
        System.out.println(morePrecise);

//        Example of explicit casting
        double pi = 3.14159;
        int almostPi = (int) pi;
        System.out.println(almostPi);

//        Increment
        int sum = 1 + 1;
//        post-increment fire after (sum) should be 2
        System.out.println("Post-increment:" + sum++);
//        Should show 3 now after the post-increment from above
        System.out.println("Show value of post-increment: " + sum);
    }
}
