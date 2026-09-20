import java.util.Scanner;
class StackCountOccurrences {
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
        System.out.print("Enter element to count: ");
        int search = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= top; i++) {
            if (stack[i] == search) {
                count++;
            }
        }
        System.out.println("Occurrences of " + search + ": " + count);
        sc.close();
    }
}