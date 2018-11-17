import java.util.Scanner;

public class DivideWithoutReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0) {
                p1 = p1 + 1;
            }
            if ( num % 3 == 0) {
                p2 = p2 + 1;
            }
            if (num % 4 == 0) {
                p3 = p3 + 1;
            }
        }


        p1 = p1 / n * 100;
        p2 = p2 / n * 100;
        p3 = p3 / n * 100;

        System.out.printf("%.2f%%\n",p1);
        System.out.printf("%.2f%%\n",p2);
        System.out.printf("%.2f%%",p3);
    }
}
