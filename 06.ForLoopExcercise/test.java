import java.sql.SQLOutput;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int OddSum = 0;
        int OddMin = Integer.MAX_VALUE;
        int OddMax = Integer.MIN_VALUE;
        int EvenSum = 0;
        int EvenMin = Integer.MAX_VALUE;
        int EvenMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            if (num % 2 != 0) {
                OddSum += num;
                System.out.println("OddSum=" + num);
            }
            if (OddSum >= OddMax) {

                OddMax = num;
                System.out.println("OddMax=" + num);
            }
            if (OddSum <= OddMin) {
                OddMin = num;

                System.out.println("OddMin=" + num);
            }
            if (num % 2 == 0) {

                EvenSum += num;

                System.out.println("EvenSum=" + num);

            }
            if (EvenSum >= EvenMax) {

                EvenMax = num;


                System.out.println("EvenMax=" + num);
            }
            if (EvenSum <= EvenMin) {
                EvenMin = num;

                System.out.println("EvenMin=" + num);
            }
        }
    }
}