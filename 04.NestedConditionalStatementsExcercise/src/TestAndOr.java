import java.util.Scanner;

public class TestAndOr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a == b || a == c && c > d");
        System.out.print("a:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("b:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("c:");
        int c = Integer.parseInt(scanner.nextLine());
        System.out.print("d:");
        int d = Integer.parseInt(scanner.nextLine());


        if ((a == b || a == c) && c > d) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
