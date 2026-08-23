import java.util.Scanner;
public class matrixsumcompareprimaryandsecondarydiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        // Calculate diagonal sums
        for (int i = 0; i < n; i++) {
            primarySum = primarySum + matrix[i][i];
            secondarySum = secondarySum + matrix[i][n - 1 - i];
        }

        System.out.println("Primary Diagonal Sum = " + primarySum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);

        // Compare the sums
        if (primarySum > secondarySum) {
            System.out.println("Larger Sum = " + primarySum);
        } else if (secondarySum > primarySum) {
            System.out.println("Larger Sum = " + secondarySum);
        } else {
            System.out.println("Both diagonal sums are equal = " + primarySum);
        }

        sc.close();
    }
}