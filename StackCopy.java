import java.util.Scanner;
class StackCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[100];
        int[] copy = new int[100];
        int top = -1;
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter stack elements:");
        for (int i = 0; i < n; i++) {
            stack[++top] = sc.nextInt();
        }
        for (int i = 0; i <= top; i++) {
            copy[i] = stack[i];
        }
        System.out.println("Original Stack:");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println("\nCopied Stack:");
        for (int i = top; i >= 0; i--) {
            System.out.print(copy[i] + " ");
        }
        sc.close();
    }
}