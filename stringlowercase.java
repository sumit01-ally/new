import java.util.Scanner;
public class stringlowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Check uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result = result + ch;
        }

        System.out.println("Lowercase String = " + result);

        sc.close();
    }
}