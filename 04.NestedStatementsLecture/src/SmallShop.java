import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();
        String town = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());

        /*град	coffee	water	beer	sweets	peanuts
        Sofia	0.50	0.80	1.20	1.45	1.60
        Plovdiv	0.40	0.70	1.15	1.30	1.50
        Varna	0.45	0.70	1.10	1.35	1.55*/


        if (town.equals("sofia")) {
            if (product.equals("coffee")) {
                System.out.println(0.50 * quantity);
            } else if (product.equals("water")) {
                System.out.println(0.80 * quantity);
            } else if (product.equals("beer")) {
                System.out.println(1.20 * quantity);
            } else if (product.equals("sweets")) {
                System.out.println(1.45 * quantity);
            } else if (product.equals("peanuts")) {
                System.out.println(1.60 * quantity);
            }
        } else if (town.equals("plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(0.40 * quantity);
            } else if (product.equals("water")) {
                System.out.println(0.70 * quantity);
            } else if (product.equals("beer")) {
                System.out.println(1.15 * quantity);
            } else if (product.equals("sweets")) {
                System.out.println(1.30 * quantity);
            } else if (product.equals("peanuts")) {
                System.out.println(1.50 * quantity);
            }
        } else if (town.equals("varna")) {
            if (product.equals("coffee")) {
                System.out.println(0.45 * quantity);
            } else if (product.equals("water")) {
                System.out.println(0.70 * quantity);
            } else if (product.equals("beer")) {
                System.out.println(1.10 * quantity);
            } else if (product.equals("sweets")) {
                System.out.println(1.35 * quantity);
            } else if (product.equals("peanuts")) {
                System.out.println(1.55 * quantity);
            }
        }
    }
}
