import java.util.Scanner;
public class stringmerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String word1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String word2 = sc.nextLine();

        String result = "";

        int i = 0;
        int j = 0;

        // Merge characters alternately
        while (i < word1.length() || j < word2.length()) {

            if (i < word1.length()) {
                result = result + word1.charAt(i);
                i++;
            }

            if (j < word2.length()) {
                result = result + word2.charAt(j);
                j++;
            }
        }

        System.out.println("Merged String = " + result);

        sc.close();
    }
}