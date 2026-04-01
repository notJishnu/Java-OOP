import java.util.Scanner;

class UserString {
    String str;

    // Constructor
    UserString(String str) {
        this.str = str;
    }

    // a) Count all characters
    int countCharacters() {
        return str.length();
    }

    // b) Count number of words
    int countWords() {
        if (str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    // c) Compare two strings
    boolean compareStrings(String other) {
        return str.equals(other);
    }

    // d) Convert to uppercase
    String toUpper() {
        return str.toUpperCase();
    }

    // e) Convert to lowercase
    String toLower() {
        return str.toLowerCase();
    }

    // f) Concatenate two strings
    String concatenate(String other) {
        return str.concat(other);
    }

    // g) Check palindrome
    boolean isPalindrome() {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(rev);
    }

    // h) Find position of a character
    int findPosition(char ch) {
        return str.indexOf(ch); // returns -1 if not found
    }

    // i) Substring from start to end
    String getSubstring(int start, int end) {
        if (start >= 0 && end <= str.length() && start < end)
            return str.substring(start, end);
        else
            return "Invalid indices";
    }

    // j) Search substring presence
    boolean containsSubstring(String sub) {
        return str.contains(sub);
    }

    // k) Replace substring
    String replaceSubstring(String oldSub, String newSub) {
        return str.replace(oldSub, newSub);
    }

    // l) Swap substrings between two strings
    static void swapSubstrings(UserString s1, UserString s2, String sub1, String sub2) {
        if (s1.str.contains(sub1) && s2.str.contains(sub2)) {
            String temp1 = s1.str.replace(sub1, sub2);
            String temp2 = s2.str.replace(sub2, sub1);

            s1.str = temp1;
            s2.str = temp2;

            System.out.println("After swapping:");
            System.out.println("String 1: " + s1.str);
            System.out.println("String 2: " + s2.str);
        } else {
            System.out.println("Substrings not found in given strings.");
        }
    }
}

public class A11Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        UserString us1 = new UserString(s1);
        UserString us2 = new UserString(s2);

        // Demonstration of methods
        System.out.println("Character count: " + us1.countCharacters());
        System.out.println("Word count: " + us1.countWords());
        System.out.println("Strings equal? " + us1.compareStrings(s2));
        System.out.println("Uppercase: " + us1.toUpper());
        System.out.println("Lowercase: " + us1.toLower());
        System.out.println("Concatenation: " + us1.concatenate(s2));
        System.out.println("Palindrome? " + us1.isPalindrome());

        System.out.print("Enter character to find: ");
        char ch = sc.next().charAt(0);
        System.out.println("Position: " + us1.findPosition(ch));

        System.out.println("Substring (0,3): " + us1.getSubstring(0, 3));

        sc.nextLine(); // consume newline
        System.out.print("Enter substring to search: ");
        String sub = sc.nextLine();
        System.out.println("Contains substring? " + us1.containsSubstring(sub));

        System.out.print("Enter substring to replace: ");
        String oldSub = sc.nextLine();
        System.out.print("Enter new substring: ");
        String newSub = sc.nextLine();
        System.out.println("After replacement: " + us1.replaceSubstring(oldSub, newSub));

        // Swap substrings
        System.out.print("Enter substring from String1 to swap: ");
        String sub1 = sc.nextLine();
        System.out.print("Enter substring from String2 to swap: ");
        String sub2 = sc.nextLine();

        UserString.swapSubstrings(us1, us2, sub1, sub2);

        sc.close();
    }
}