import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());
        int badGrades = 0;
        double gradesSum = 0;
        int counter = 0;
        String command = "";

        while (true) {
            String task = command;
            command = scanner.nextLine();

            if (command.equals("Enough")) {
                System.out.printf("Average score: %.2f%n", (gradesSum / counter));
                System.out.printf("Number of problems: %d%n", counter);
                System.out.printf("Last problem: %s", task);
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());
            gradesSum += grade;

            if (grade <= 4) {
                badGrades++;
            }

            if (badGrades == maxBadGrades) {
                System.out.printf("You need a break, %d poor grades.", badGrades);
                break;
            }
        counter++;
        }
    }
}
