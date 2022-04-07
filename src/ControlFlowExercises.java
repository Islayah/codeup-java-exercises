public class ControlFlowExercises {
    public static void main(String[] args) {

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
        for (long z = 2; z < 1000000; z *= z) {
            System.out.println(z);
        }


//        2. Fizzbuzz
//        int t = 1;
//        if (t <= 100) {
//            System.out.println(t);
//        }
    }
}
