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

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
        }
    }
}
