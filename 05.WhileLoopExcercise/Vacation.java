import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationCost = Double.parseDouble(scanner.nextLine());
        double currentBalance = Double.parseDouble(scanner.nextLine());
        String action = "";
        int days = 0;
        int spendInSeries = 0;

        while (true) {
            action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            if (action.equals("spend")) {
                currentBalance = currentBalance - amount;
                if (currentBalance < 0) {
                    currentBalance = 0;
                }
            } else if (action.equals("save")) {
                currentBalance = currentBalance + amount;
            }

            days++;

            if (action.equals("spend")) {
                spendInSeries++;
                if (spendInSeries >= 5) {
                    System.out.printf("You can't save the money.%n%d",days);
                    break;
                }
            } else {
                spendInSeries = 0;
            }

            if (currentBalance >= vacationCost) {
                System.out.printf("You saved the money for %d days.",days);
                break;
            }
        }
    }
}
