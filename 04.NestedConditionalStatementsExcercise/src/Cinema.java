import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ticket type(Premiere,Normal,Discount):");
        String ticketType = scanner.nextLine();
        System.out.print("rows:");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.print("columns:");
        int c = Integer.parseInt(scanner.nextLine());

        double price = -1;
        double totalPrice = 0;

        if (ticketType.equals("Premiere")) {
            price = 12.00;
        } else if (ticketType.equals("Normal")) {
            price = 7.50;
        } else if (ticketType.equals("Discount")) {
            price = 5.00;
        }

        totalPrice = r * c * price;

        if (price >= 0) {
            System.out.println(totalPrice);
        } else {
            System.out.println("Wrong ticket type!");
        }
    }

}
