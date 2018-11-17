import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        int booksCount = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while (counter < booksCount) {
            String bookGuess = scanner.nextLine();
            if (bookGuess.equals(book)) {
                System.out.printf("You checked %d books and found it.", counter);
                break;
            }
           counter++;
        }
        if (counter == booksCount) {
            System.out.printf("The book you search is not here!%n" + "You checked %d books.",counter);
        }

    }
}
