import java.util.*;

public class PalindromeCheckerApp {

    public static boolean twoPointer(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean stackMethod(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) return false;
        }
        return true;
    }

    public static boolean recursionMethod(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursionMethod(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        long start, end;

        start = System.nanoTime();
        boolean result1 = twoPointer(input);
        end = System.nanoTime();
        long time1 = end - start;

        start = System.nanoTime();
        boolean result2 = stackMethod(input);
        end = System.nanoTime();
        long time2 = end - start;

        start = System.nanoTime();
        boolean result3 = recursionMethod(normalized, 0, normalized.length() - 1);
        end = System.nanoTime();
        long time3 = end - start;

        System.out.println("\nResults:");
        System.out.println("Two Pointer: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Method: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Recursion: " + result3 + " | Time: " + time3 + " ns");

        sc.close();
    }
}