import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {

        System.out.println("Enter the word that you want check : ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        word = word.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(word)) {
            System.out.println("It is palindrome");
        } else
            System.out.println("it is not palindrome");

    }

    public static boolean isPalindrome(String str) {
        // Reverse the string and compare with the original
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);

    }
}