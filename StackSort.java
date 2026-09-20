import java.util.Scanner;
class StackSort {
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
        for (int i = 0; i <= top; i++) {
            for (int j = i + 1; j <= top; j++) {
                if (stack[i] > stack[j]) {
                    int temp = stack[i];
                    stack[i] = stack[j];
                    stack[j] = temp;
                }
            }
        }
        System.out.println("Sorted Stack:");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        sc.close();
    }
}