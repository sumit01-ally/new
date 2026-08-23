import java.util.Scanner;
public class matrixlinearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        // Input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == target) {
                    System.out.println("Element found at row "
                            + (i + 1) + ", column " + (j + 1));
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}