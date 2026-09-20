import java.util.Scanner;
class StackDeleteMiddleElement {
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
        int middle = top / 2;
        for (int i = middle; i < top; i++) {
            stack[i] = stack[i + 1];
        }
        top--;
        System.out.println("Stack after deleting middle element:");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        sc.close();
    }
}