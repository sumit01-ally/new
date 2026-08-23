import java.util.Scanner;
public class stringshuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int n = s.length();
        int[] indices = new int[n];

        System.out.println("Enter indices:");
        for (int i = 0; i < n; i++) {
            indices[i] = sc.nextInt();
        }

        char[] result = new char[n];

        // Place each character at its correct index
        for (int i = 0; i < n; i++) {
            result[indices[i]] = s.charAt(i);
        }

        System.out.println("Shuffled String = " + new String(result));

        sc.close();
    }
}