import java.util.Scanner;
public class stringfoundmaximumword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();
        int maxWords = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter sentence: ");
            String sentence = sc.nextLine();
            int words = 1;

            // Count spaces
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    words++;
                }
            }

            if (words > maxWords) {
                maxWords = words;
            }
        }
        System.out.println("Maximum number of words = " + maxWords);
        sc.close();
    }
}