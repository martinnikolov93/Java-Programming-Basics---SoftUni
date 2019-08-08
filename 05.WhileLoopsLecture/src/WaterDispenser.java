/*Всеки офис си има диспансер за вода. Напишете програма, която отчита дали служител от офиса е успял да напълни чашата си успешно.
        Диспансерът има три бутона :
        •	Easy - лесен (50 милилитра)
        •	Medium - среден (100 милилитра)
        •	Hard - силен (200 милилитра)
Ще получите обемът на чашата и на всеки следващ ред кой бутон е бил натиснат. Ако чашата се напълни или прелее програмата приключва.
Ако чашата прелее отпечатайте колко вода е била излята. При успешно напълване отпечатайте броят на натисканията на бутона.*/


import java.util.Scanner;

public class WaterDispenser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int cup = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int water = 0;
        int amount= 0;

        while (water < cup) {
            String command = scanner.nextLine();
            if (command.equals("Easy")) {
                amount =  50;
            } else if (command.equals("Medium")) {
                amount = 100;
            } else if (command.equals("Hard")) {
                amount = 200;

            }

            water += amount;
            counter++;
        }

        if (water > cup) {
            System.out.printf("%dml has been spilled.", water - cup);
        } else if (water == cup) {
            System.out.printf("The dispenser has been tapped %d times.", counter);
        }
    }
}
