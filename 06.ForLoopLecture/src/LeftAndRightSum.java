import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumA += num;
        }
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumB += num;
        }

        if (sumA == sumB) {
            System.out.printf("Yes, sum = %d", sumA);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumA - sumB));
        }
    }
}
