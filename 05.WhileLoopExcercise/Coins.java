import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double cents = change * 100;
        int countCoins = 0;

        while (cents > 0) {
            if (cents >= 200) {
                cents = cents - 200;
            } else if (cents >= 100) {
                cents = cents - 100;
            } else if (cents >= 50) {
                cents = cents - 50;
            } else if (cents >= 20) {
                cents = cents - 20;
            } else if (cents >= 10) {
                cents = cents - 10;
            } else if (cents >= 5) {
                cents = cents - 5;
            } else if (cents >= 2) {
                cents = cents - 2;
            } else if (cents >= 1) {
                cents = cents - 1;
            } else if (cents >= 0) {
                break;
            }

            countCoins++;
        }

        System.out.println(countCoins);

    }
}
