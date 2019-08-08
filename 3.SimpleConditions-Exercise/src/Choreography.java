import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine());
        int dancers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        double percentStepsPerDay = Math.ceil(((double)(steps / days) / steps) * 100) ;
        double percentStepsPerDancer = percentStepsPerDay / dancers;

        if (percentStepsPerDay <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", percentStepsPerDancer);
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.",
                    percentStepsPerDancer);
        }
    }
}
