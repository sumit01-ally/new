import java.util.Scanner;
public class stringcompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String result = "";
        int i = 0;
        while (i < s.length()) {

            char ch = s.charAt(i);
            int count = 0;

            // Count consecutive same characters
            while (i < s.length() && s.charAt(i) == ch) {
                count++;
                i++;
            }

            result = result + ch;

            // Add count only if greater than 1
            if (count > 1) {
                result = result + count;
            }
        }

        System.out.println("Compressed String = " + result);

        sc.close();
    }
}