import java.util.Scanner;

public class DistanceUnitsConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = Double.parseDouble(sc.nextLine());
        String units1 = sc.nextLine();
        String units2 = sc.nextLine();
        sc.close();

        double m = 1.0d;
        double mm = 1000.0d;
        double cm = 100.0d;
        double mi = 0.000621371192d;
        double in = 39.3700787d;
        double km = 0.001d;
        double ft = 3.2808399d;
        double yd = 1.0936133;

        double toMeters = 0;

        if (units1.equals("m")) {
            toMeters = distance / m;
        } else if (units1.equals("mm")) {
            toMeters = distance / mm;
        } else if (units1.equals("cm")) {
            toMeters = distance / cm;
        } else if (units1.equals("mi")) {
            toMeters = distance / mi;
        } else if (units1.equals("in")) {
            toMeters = distance / in;
        } else if (units1.equals("km")) {
            toMeters = distance / km;
        } else if (units1.equals("ft")) {
            toMeters = distance / ft;
        } else if (units1.equals("yd")) {
            toMeters = distance / yd;
        }

        double result = 0;

        if (units2.equals("m")) {
            result = toMeters * m;
        } else if (units2.equals("mm")) {
            result = toMeters * mm;
        } else if (units2.equals("cm")) {
            result = toMeters * cm;
        } else if (units2.equals("mi")) {
            result = toMeters * mi;
        } else if (units2.equals("in")) {
            result = toMeters * in;
        } else if (units2.equals("km")) {
            result = toMeters * km;
        } else if (units2.equals("ft")) {
            result = toMeters * ft;
        } else if (units2.equals("yd")) {
            result = toMeters * yd;
        }

        System.out.printf("%.8f", result);
    }

}
