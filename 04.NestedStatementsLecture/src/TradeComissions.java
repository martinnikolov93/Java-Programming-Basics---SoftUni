import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        /*
        Град	0 ≤ s ≤ 500	500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
        Sofia	    5%	           7%	            8%	            12%
        Varna	    4.5%	       7.5%	            10%	            13%
        Plovdiv	    5.5%	       8%	            12%	            14.5%
        Напишете конзолна програма, която чете име на град (стринг) и обем на продажби (десетично число) , въведени от потребителя,
        и изчислява и извежда размера на търговската комисионна според горната таблица. Резултатът да се изведе закръглен с 2 цифри
        след десетичната точка.
        При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error".*/


        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine().toLowerCase();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = -1.0;

        if (city.equals("sofia")) {
            if (sales >= 0 && sales <= 500) {
                commission = 0.05;
            } else if (sales > 500 && sales <= 1000) {
                commission = 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                commission = 0.08;
            }  else if (sales > 10000) {
                commission = 0.12;
            }
        } else if (city.equals("varna")) {
            if (sales >= 0 && sales <= 500) {
                commission = 0.045;
            } else if (sales > 500 && sales <= 1000) {
                commission = 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                commission = 0.10;
            }  else if (sales > 10000) {
                commission = 0.13;
            }
        } else if (city.equals("plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commission = 0.055;
            } else if (sales > 500 && sales <= 1000) {
                commission = 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                commission = 0.12;
            }  else if (sales > 10000) {
                commission = 0.145;
            }
        }

        if (commission >= 0) {
            System.out.printf("%.2f",sales * commission);
        } else {
            System.out.println("error");
        }
    }
}
