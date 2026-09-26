import java.util.*;
public class RecursionMaximumElementInArray {
    static int maxElement(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        int max = maxElement(arr, i + 1);
        return Math.max(arr[i], max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxElement(arr, 0));
        sc.close();
    }
}