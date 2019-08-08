import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double sumMoney = 0;
        double sumMoneyTotal = 0;
        double sumToys = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sumMoney = sumMoney + 10;
                sumMoneyTotal += sumMoney - 1;
            } else {
                sumToys += toyPrice;
            }
        }

        double totalMoney = sumMoneyTotal + sumToys;

        if (totalMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", (totalMoney - washingMachinePrice));
        } else {
            System.out.printf("No! %.2f", (washingMachinePrice - totalMoney));
        }



    }
}
