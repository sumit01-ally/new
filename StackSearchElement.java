import java.util.Scanner;
class StackSearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[100];
        int top = -1;
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter stack elements:");
        for (int i = 0; i < n; i++) {
            stack[++top] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i] == search) {
                System.out.println("Element found at position: " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}