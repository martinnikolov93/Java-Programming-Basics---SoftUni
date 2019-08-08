import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        /*Принтирайте името на деня на седмицата по номер на деня от (на английски) [1...7] или
        принтирайте "Error" за невалидно число.

        вход	изход
        1	Monday
        2	Tuesday
        3	Wednesday
        4	Thursday
        5	Friday
        6	Saturday
        7	Sunday
        -1	Error

        */

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        switch (number) {
            default:
                System.out.println("error");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }

    }
}
