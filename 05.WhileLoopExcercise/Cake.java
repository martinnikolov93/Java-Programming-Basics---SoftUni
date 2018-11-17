import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeLenght = Integer.parseInt(scanner.nextLine());
        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakePieces = cakeLenght * cakeWidth;
        int piecesTaken = 0;
        String command = "";

        while (true) {
            command = scanner.nextLine();
            if (!command.equals("STOP")) {
                piecesTaken += Integer.parseInt(command);
            }
            if (command.equals("STOP")) {
                System.out.printf("%d pieces are left.", cakePieces - piecesTaken);
                break;
            } else if (piecesTaken > cakePieces) {
                System.out.printf("No more cake left! You need %d pieces more.", (piecesTaken - cakePieces));
                break;
            }
        }
    }
}
