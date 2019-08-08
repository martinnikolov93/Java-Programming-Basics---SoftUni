/*
Странно, но повечето хора си плануват от рано почивката. Млад програмист разполага с определен бюджет и свободно време
в даден сезон. Напишете програма, която да приема на входа бюджета и сезона, а на изхода да изкарва, къде ще почива
програмиста и колко ще похарчи.
        Бюджета определя дестинацията, а сезона определя колко от бюджета ще изхарчи. Ако е лято ще почива на къмпинг,
        а зимата в хотел. Ако е в Европа, независимо от сезона ще почива в хотел. Всеки къмпинг или хотел,
        според дестинацията, има собствена цена която отговаря на даден процент от бюджета:
        •	При 100лв. или по-малко – някъде в България
        o	Лято – 30% от бюджета
        o	Зима – 70% от бюджета
        •	При 1000лв. или по малко – някъде на Балканите
        o	Лято – 40% от бюджета
        o	Зима – 80% от бюджета
        •	При повече от 1000лв. – някъде из Европа
        o	При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.
        Вход
        Входът се чете от конзолата и се състои от два реда, въведени от потребителя:
        •	Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
        •	Втори ред –  Един от двата възможни сезона: „summer” или “winter”
        Изход
        На конзолата трябва да се отпечатат два реда.
        •	Първи ред – „Somewhere in [дестинация]“ измежду “Bulgaria”,”Balkans” и ”Europe”
        •	Втори ред – “{Вид почивка} – {Похарчена сума}“
*/


import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String place = "";

        if (budget <= 100) {
            destination = "Bulgaria";

            if (season.equals("summer")) {
                budget = budget * 0.30;
                place = "Camp";
            } else if (season.equals("winter")) {
                budget = budget * 0.70;
                place = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";

            if (season.equals("summer")) {
                budget = budget * 0.40;
                place = "Camp";
            } else if (season.equals("winter")) {
                budget = budget * 0.80;
                place = "Hotel";
            }
        } else {
            destination = "Europe";

            if (season.equals("summer") || season.equals("winter")) {
                budget = budget * 0.90;
                place = "Hotel";
            }
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, budget);
    }

}
