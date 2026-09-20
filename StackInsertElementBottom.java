import java.util.Scanner;
class StackInsertElementBottom {
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
        System.out.print("Enter element to insert at bottom: ");
        int element = sc.nextInt();
        for (int i = top; i >= 0; i--) {
            stack[i + 1] = stack[i];
        }
        stack[0] = element;
        top++;
        System.out.println("Stack:");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        sc.close();
    }
}