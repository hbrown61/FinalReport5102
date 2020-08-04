import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Your word reversed is: " + reverse);
        if (reverse.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scanner.nextLine();
        System.out.println("Palindrome? " + isPalindrome(str));

    }
}
