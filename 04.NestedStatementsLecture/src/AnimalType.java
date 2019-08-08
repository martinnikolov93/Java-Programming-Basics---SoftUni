import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        /*Напишете програма която принтира класа на животното според името му, въведено от потребителя:
        •	dog -> mammal
        •	crocodile, tortoise, snake -> reptile
        •	others -> unknown*/


        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
                System.out.println("reptile");
                break;
            case "tortoise":
                System.out.println("reptile");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
