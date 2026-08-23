import java.util.Scanner;
public class arraygreaterthanaverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");

        // Input and calculate sum
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        // Calculate average
        double average = (double) sum / n;

        System.out.println("Average = " + average);

        System.out.println("Elements greater than average:");

        // Print elements greater than average
        for (int i = 0; i < n; i++) {
            if (arr[i] > average) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}