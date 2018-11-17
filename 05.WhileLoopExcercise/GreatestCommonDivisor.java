import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int result = 0;

        if (b == 0) {
            result = a;
        } else {
            while (b != 0) {
                result = b;
                b = a%b;
                a = result;
            }
        }

        System.out.println(result);
    }
}
