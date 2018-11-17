import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int a ;
        int b ;
        int pairSumA = 0;
        int pairSumB ;
        boolean evenPairs = true;
        int maxDifference = Integer.MIN_VALUE;
        int difference;

        for (int i = 0; i < n; i++) {

            pairSumB = pairSumA;

            a = Integer.parseInt(scanner.nextLine());
            b = Integer.parseInt(scanner.nextLine());

            pairSumA = a + b;

            if (pairSumA != pairSumB && i != 0) {
                evenPairs = false;
                difference = Math.abs(pairSumA - pairSumB);
                if (difference >= maxDifference) {
                    maxDifference = difference;
                }
            }
        }

        if (evenPairs == true) {
            System.out.printf("Yes, value=%d", pairSumA);
        } else {
            System.out.printf("No, maxdiff=%d", maxDifference);
        }
    }
}
