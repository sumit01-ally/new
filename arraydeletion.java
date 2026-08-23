import java.util.Scanner;
public class  arraydeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        // Shift elements to the left
        for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;

        // Display array after deletion
        System.out.println("Array after deletion:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}