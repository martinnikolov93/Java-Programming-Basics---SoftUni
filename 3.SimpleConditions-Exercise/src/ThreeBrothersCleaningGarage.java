import java.util.Scanner;

public class ThreeBrothersCleaningGarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hoursFirstBrother = Double.parseDouble(scanner.nextLine());
        double hoursSecondBrother = Double.parseDouble(scanner.nextLine());
        double hoursThirdBrother = Double.parseDouble(scanner.nextLine());
        double hoursFatherFishing = Double.parseDouble(scanner.nextLine());

        double totalTime = 1 / (1 / hoursFirstBrother + 1 / hoursSecondBrother + 1 / hoursThirdBrother);
        double totalTimeWithRest = totalTime * 1.15;

        //double hoursLeft = hoursFatherFishing - totalTimeWithRest;

        if (totalTimeWithRest < hoursFatherFishing) {
            System.out.printf("Cleaning time: %.2f%n", totalTimeWithRest);
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours." , Math.floor(hoursFatherFishing - totalTimeWithRest));
        } else {
            System.out.printf("Cleaning time: %.2f%n", totalTimeWithRest);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.",Math.ceil(totalTimeWithRest - hoursFatherFishing));
        }

    }
}
