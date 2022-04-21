import java.util.Locale;

public class Warmup {
    //    Custom Method for palindrome check
    static boolean isPalindrome(String string) {
//        Pointers: i is the beginning, j is the end(does the -1 always cause this?)
        int i = 0, j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j))
                return false;
//            Not sure what the increment/decrement do exactly **************************************
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "AbBa";
        string = string.toLowerCase();
//        Pass custom method, isPalindrome to be able to end program
        if (isPalindrome(string))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
