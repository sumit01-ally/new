import java.util.Scanner;
public class arraycheckrotated  {
    static boolean isRotatedSorted(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
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

        if (isRotatedSorted(arr)) {
            System.out.println("Array is rotated sorted.");
        } else {
            System.out.println("Array is not rotated sorted.");
        }

        sc.close();
    }
}