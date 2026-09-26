import java.util.*;
public class RecursionBinarySearch {
    static int binarySearch(int arr[], int low, int high, int key) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (key < arr[mid]) {
            return binarySearch(arr, low, mid - 1, key);
        }
        return binarySearch(arr, mid + 1, high, key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int result = binarySearch(arr, 0, n - 1, key);
        if (result == -1)
            System.out.println("Not Found");
        else
            System.out.println("Found at index " + result);
        sc.close();
    }
}