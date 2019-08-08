import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double points = Double.parseDouble(scanner.nextLine());
        double bonusPoints = 0;
        double newpoints = 0;

        if (points >= 0 && points <= 100) {
            bonusPoints = 5;
            newpoints = points + bonusPoints;
        } else if (points <= 1000) {
            bonusPoints = points * 0.20;
            newpoints = points + bonusPoints;
        } else if (points > 1000) {
            bonusPoints = points * 0.10;
            newpoints = points + bonusPoints;
        } else {
            System.out.println("Invalid input.");
        }

        if (points % 2 == 0) {
            bonusPoints = bonusPoints + 1;
            newpoints = newpoints + 1;
        } else if (points % 10 == 5) {
            bonusPoints = bonusPoints + 2;
            newpoints = newpoints + 2;
        }

        if (newpoints % 1 == 0){
            System.out.printf("%.0f", bonusPoints);
        } else {
            System.out.printf("%.1f", bonusPoints);
        }

        System.out.println();

        if (newpoints % 1 == 0){
            System.out.printf("%.0f", newpoints);

        } else {
            System.out.printf("%.1f", newpoints);
        }




    }
}
