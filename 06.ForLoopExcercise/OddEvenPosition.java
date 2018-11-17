import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double evenSum = 0;
        double evenMax = Integer.MIN_VALUE;
        double evenMin = Integer.MAX_VALUE;
        double oddSum = 0;
        double oddMax = Integer.MIN_VALUE;
        double oddMin = Integer.MAX_VALUE;


        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if ( i % 2 == 0) {
                evenSum += num;
                if (num >= evenMax) {
                    evenMax = num;
                }
                if (num <= evenMin) {
                    evenMin = num;
                }
            } else {
                oddSum += num;
                if (num >= oddMax) {
                    oddMax = num;
                }
                if (num <= oddMin) {
                    oddMin = num;
                }
            }

        }

        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("OddSum=" + df.format(oddSum) + ",");

        if (oddMin == Integer.MAX_VALUE){
            System.out.println("OddMin=No,");
        } else {
            System.out.println("OddMin=" + df.format(oddMin) + ",");
        }
        if (oddMax == Integer.MIN_VALUE){
            System.out.println("OddMax=No,");
        } else {
            System.out.println("OddMax=" + df.format(oddMax) + ",");
        }

        System.out.println("EvenSum=" + df.format(evenSum) + ",");

        if (evenMin == Integer.MAX_VALUE){
            System.out.println("EvenMin=No,");
        } else {
            System.out.println("EvenMin=" + df.format(evenMin) + ",");
        }
        if (evenMax == Integer.MIN_VALUE){
            System.out.println("EvenMax=No,");
        } else {
            System.out.println("EvenMax=" + df.format(evenMax) + ",");
        }

    }
}
