public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=================================");
        System.out.println("     Palindrome Checker App      ");
        System.out.println("=================================");

        // Application Details
        System.out.println("Version: 1.0.0");
        System.out.println("Author: R TAMILSELVAN");
        System.out.println("Branch: CSE (AI & ML)");

        System.out.println("---------------------------------");
        System.out.println("Application Started Successfully!");
        System.out.println("---------------------------------");

        String word = "radar";

        // Convert string to character array
        char[] characters = word.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
        }
    }
}
