import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Да се напише програма, която чете име на продукт, въведено от потребителя, и проверява дали е плод или зеленчук.
        •	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
        •	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
        •	Всички останали са "unknown"
        Да се изведе "fruit", "vegetable" или "unknown" според въведения продукт.*/

        String[] fruit = {"banana", "apple", "kiwi", "cherry", "lemon", "grapes"};
        String[] vegetable = {"tomato", "cucumber", "pepper", "carrot"};

        String input = scanner.nextLine();
        boolean found = false;


        for (String element:fruit ) {
            if ( element.equals(input)) {
                found = true;
                System.out.println("fruit");
            }
        }
        for (String element:vegetable ) {
            if ( element.equals(input)) {
                found = true;
                System.out.println("vegetable");
            }
        }

        if (!found) {
            System.out.println("unknown");
        }

    }
}
