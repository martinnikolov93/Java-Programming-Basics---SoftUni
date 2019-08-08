import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        /*Когато пуснали билетите за Евро 2016, група запалянковци решили да си закупят. Билетите имат две категории с различни
         цени:
        •	VIP – 499.99 лева.
        •	Normal – 249.99 лева.
        Запалянковците имат определен бюджет, a броят на хората в групата определя какъв процент от бюджета
        трябва да се задели за транспорт:
        •	От 1 до 4 – 75% от бюджета.
        •	От 5 до 9 – 60% от бюджета.
        •	От 10 до 24 – 50% от бюджета.
        •	От 25 до 49 – 40% от бюджета.
        •	50 или повече – 25% от бюджета.
        Напишете програма, която да пресмята дали с останалите пари от бюджета могат да си купят билети за избраната категория.
         И колко пари ще им останат или ще са им нужни.
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Budget:");
        double budget = Double.parseDouble(scanner.nextLine());

        System.out.print("Ticket type(Normal, VIP):");
        String category = scanner.nextLine();

        System.out.print("People:");
        int people = Integer.parseInt(scanner.nextLine());

        double vipPrice = 499.99 * people;
        double normalPrice = 249.99 * people;
        double percent = 0.00;

        if (people >=1 && people <=4 ) {
            percent = 0.75;
        } else if (people >=5 && people <=9 ) {
            percent = 0.60;
        } else if (people >=10 && people <=24 ) {
            percent = 0.50;
        } else if (people >=25 && people <=49 ) {
            percent = 0.40;
        } else if (people > 50 ) {
            percent = 0.25;
        }

        budget = budget - (budget * percent);

        if (category.equals("Normal")) {
            if (budget > normalPrice) {
                System.out.printf("Yes! You have %.2f leva left.", budget - normalPrice);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", normalPrice - budget);
            }
        } else if (category.equals("VIP")) {
            if (budget > vipPrice) {
                System.out.printf("Yes! You have %.2f leva left.", budget - vipPrice);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", vipPrice - budget);
            }
        }
    }
}
