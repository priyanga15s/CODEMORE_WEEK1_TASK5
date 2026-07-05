import java.util.Scanner;

public class StringOperations {

    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Ignore case differences
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Function to count vowels
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is Not a Palindrome.");
        }

        // Count vowels
        int vowels = countVowels(input);
        System.out.println("Number of vowels: " + vowels);

        sc.close();
    }
}