import java.util.Scanner;

public class SecondsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seconds1 = Integer.parseInt(scanner.nextLine());
        int seconds2 = Integer.parseInt(scanner.nextLine());
        int seconds3 = Integer.parseInt(scanner.nextLine());
        int secondsSum = seconds1 + seconds2 + seconds3;


        if (secondsSum > 0 && secondsSum <= 59) {
            System.out.printf("0:%02d", secondsSum);
        } else if (secondsSum >= 60 && secondsSum <= 119) {
            int minutes = secondsSum / 60;
            int seconds = secondsSum % 60;
            System.out.printf("%1d:%02d", minutes, seconds);
        } else if (secondsSum >= 120 && secondsSum <= 179) {
            int minutes = secondsSum / 60;
            int seconds = secondsSum % 60;
            System.out.printf("%1d:%02d", minutes, seconds);
        } else {
            System.out.println("Maximum seconds exceeded!");
        }

    }
}
