import java.util.Scanner;
public class arraycubeanotherarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cube = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate cube and store in another array
        for (int i = 0; i < n; i++) {
            cube[i] = arr[i] * arr[i] * arr[i];
        }

        System.out.println("Cube of each element:");

        for (int i = 0; i < n; i++) {
            System.out.print(cube[i] + " ");
        }

        sc.close();
    }
}