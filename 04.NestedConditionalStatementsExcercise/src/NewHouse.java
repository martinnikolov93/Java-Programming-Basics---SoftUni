/*
Марин и Нели си купуват къща не далеч от София. Нели толкова много обича цветята, че Ви убеждава да напишете програма която да изчисли колко  ще им струва, да си засадят определен брой цветя и дали наличния бюджет ще им е достатъчен. Различните цветя са с различни цени.
        цвете	Роза	Далия	Лале	Нарцис	Гладиола
        Цена 	5	    3.80	2.80	3	    2.50
        Съществуват следните отстъпки:
        •	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        •	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
        •	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        •	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        •	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
        От конзолата се четат 3 реда:
        •	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        •	Брой цветя - цяло число в интервала [10…1000]
        •	Бюджет - цяло число в интервала [50…2500]
        Да се отпечата на конзолата на един ред:
        •	Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
        •	Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
        Сумата да бъде форматирана до втория знак след десетичната запетая.
*/

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerQuantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (flowerType.equals("Roses")) {
            if (flowerQuantity > 80) {
                price = flowerQuantity * 5;
                price = price - (0.10 * price);
            } else {
                price = flowerQuantity * 5;
            }
        } else if (flowerType.equals("Dahlias")) {
            if (flowerQuantity > 90) {
                price = flowerQuantity * 3.80;
                price = price - (0.15 * price);
            } else {
                price = flowerQuantity * 3.80;
            }
        } else if (flowerType.equals("Tulips")) {
            if (flowerQuantity > 80) {
                price = flowerQuantity * 2.80;
                price = price - (0.15 * price);
            } else {
                price = flowerQuantity * 2.80;
            }
        } else if (flowerType.equals("Narcissus")) {
            if (flowerQuantity < 120) {
                price = flowerQuantity * 3.00;
                price = price + (0.15 * price);
            } else {
                price = flowerQuantity * 3.00;
            }
        } else if (flowerType.equals("Gladiolus")) {
            if (flowerQuantity < 80) {
                price = flowerQuantity * 2.50;
                price = price + (0.20 * price);
            } else {
                price = flowerQuantity * 2.50;
            }
        }

        if (price > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
        } else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerQuantity, flowerType, (budget - price));
        }
    }
}
