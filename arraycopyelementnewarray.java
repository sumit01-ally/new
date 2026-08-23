import java.util.Scanner;
public class arraycopyelementnewarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Copy elements
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Elements of new array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }
}