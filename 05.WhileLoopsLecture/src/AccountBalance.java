/*
Напишете програма, която пресмята колко общо пари има в сметката, след като направите определен брой вноски. На първия ред ще получите колко вноски
трябва да се направят. На всеки следващ ред ще получавате сумата, която трябва да внесете в сметката, докато не се достигне броя вноски.
При всяка получена сума на конзолата трябва да се извежда "Increase: " + сумата и тя да се прибавя в сметката. Ако получите число по-малко
от 0 на конзолата трябва да се изведе "Invalid operation!" и програмата
да приключи. Когато програмата приключи трябва да се принтира "Total: " + общата сума в сметката закръглена до втория
знак след десетичната запетая.
*/

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int depositsCount = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        double deposit = 0.00;
        double amount = 0.00;

        while (counter <= depositsCount) {
            amount = Double.parseDouble(scanner.nextLine());
            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            deposit += amount;
            System.out.printf("Increase: %.2f%n", amount);

            counter++;
        }

        System.out.printf("Total: %.2f", deposit);
    }
}
