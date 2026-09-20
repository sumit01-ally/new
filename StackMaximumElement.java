import java.util.Scanner;
class StackMaximumElement {
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
        int max = stack[0];
        for (int i = 1; i <= top; i++) {
            if (stack[i] > max) {
                max = stack[i];
            }
        }
        System.out.println("Maximum Element: " + max);
        sc.close();
    }
}