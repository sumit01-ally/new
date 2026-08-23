import java.util.Scanner;
public class stringfirstandlastcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        System.out.println("First character = " + first);
        System.out.println("Last character = " + last);

        sc.close();
    }
}