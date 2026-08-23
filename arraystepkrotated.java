import java.util.Scanner;
public class arraystepkrotated {
    // Right rotation
    static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        for (int r = 0; r < k; r++) {
            int last = arr[n - 1];

            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }
    }

    // Left rotation
    static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        for (int r = 0; r < k; r++) {
            int first = arr[0];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = first;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        System.out.print("Enter 1 for Right rotation or 2 for Left rotation: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            rotateRight(arr, k);
        } else if (choice == 2) {
            rotateLeft(arr, k);
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        System.out.println("Array after rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}