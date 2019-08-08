/*
Хотел предлага 2 вида стаи: студио и апартамент. Напишете програма, която изчислява цената за
целия престой за студио и апартамент. Цените зависят от месеца на престоя:
        Май и октомври	                        Юни и септември	                 Юли и август
        Студио – 50 лв./нощувка	        Студио – 75.20 лв./нощувка	        Студио – 76 лв./нощувка
        Апартамент – 65 лв./нощувка	    Апартамент – 68.70 лв./нощувка	    Апартамент – 77 лв./нощувка
        Предлагат се и следните отстъпки:
        •	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
        •	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
        •	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
        •	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
        Вход
        Входът се чете от конзолата и съдържа точно 2 реда, въведени от потребителя:
        •	На първия ред е месецът – May, June, July, August, September или October
        •	На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
        Изход
        Да се отпечатат на конзолата 2 реда:
        •	На първия ред: “Apartment: {цена за целият престой} lv.”
        •	На втория ред: “Studio: {цена за целият престой} lv.“
        Цената за целия престой форматирана с точност до два знака след десетичната запетая.
*/


import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double apartmentPrice = 0.00;
        double studioPrice = 0.00;

        if (month.equals("May") || month.equals("October")) {
            apartmentPrice = 65 * nights;
            studioPrice = 50 * nights;
        } else if (month.equals("June") || month.equals("September")) {
            apartmentPrice = 68.70 * nights;
            studioPrice = 75.20 * nights;
        } else if (month.equals("July") || month.equals("August")) {
            apartmentPrice = 77 * nights;
            studioPrice = 76 * nights;
        }

        if ((nights > 7 && nights <= 13) && (month.equals("May") || month.equals("October"))){
            studioPrice = studioPrice - (studioPrice * 0.05);
        } else if (nights > 14 && (month.equals("May") || month.equals("October"))) {
            studioPrice = studioPrice - (studioPrice * 0.30);
        } else if (nights > 14 && (month.equals("June") || month.equals("September"))) {
            studioPrice = studioPrice - (studioPrice * 0.20);
        }

        if (nights > 14) {
            apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}

