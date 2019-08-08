import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double minimalSalary = Double.parseDouble(scanner.nextLine());

        double socialScolarship = minimalSalary * 0.35;
        double exellenceScolarship = grade * 25.0;

         if (income > minimalSalary || grade <= 4.50) {
            System.out.println("You cannot get a scholarship!");
        } else if (grade >= 5.50) {
            if (socialScolarship <= exellenceScolarship) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", exellenceScolarship);
            } else {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScolarship);
            }
        }  else if (income < minimalSalary && grade > 4.50) {
            if (socialScolarship > exellenceScolarship) {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScolarship);
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", exellenceScolarship);
            }

        }
    }
}
