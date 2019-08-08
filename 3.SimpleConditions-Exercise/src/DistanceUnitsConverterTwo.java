import java.util.HashMap;
import java.util.Scanner;

public class DistanceUnitsConverterTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = Double.parseDouble(sc.nextLine());
        String units1 = sc.nextLine();
        String units2 = sc.nextLine();
        sc.close();

        HashMap<String, Double> units = new HashMap<String, Double>();
        units.put("m", 1.0d);
        units.put("mm", 1000.0d);
        units.put("cm", 100.0d);
        units.put("mi", 0.000621371192d);
        units.put("in", 39.3700787d);
        units.put("km", 0.001d);
        units.put("ft", 3.2808399d);
        units.put("yd", 1.0936133);

        double toMeters = distance / units.get(units1);
        double result = toMeters * units.get(units2);
        System.out.printf("%.8f", result);
    }
}
