import java.util.Scanner;
public class stringdefangipaddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP Address: ");
        String address = sc.nextLine();

        String result = "";

        for (int i = 0; i < address.length(); i++) {

            char ch = address.charAt(i);

            if (ch == '.') {
                result = result + "[.]";
            } else {
                result = result + ch;
            }
        }

        System.out.println("Defanged IP Address: " + result);

        sc.close();
    }
}