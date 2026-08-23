import java.util.Scanner;
public class arrayinsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        System.out.print("Enter element: ");
        int element = sc.nextInt();

        // Shift elements to the right
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert element
        arr[pos - 1] = element;
        n++;

        // Display array
        System.out.println("Array after insertion:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}