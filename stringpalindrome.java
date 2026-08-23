import java.util.Scanner;
public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Compare original and reverse
        if (str.equals(reverse)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

        sc.close();
    }
}