import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        char floorType = 'n';

        for (int i = floors; i > 0; i--) {
            if (i == floors) {
                floorType = 'L';
            } else if (i % 2 == 0) {
                floorType = 'O';
            } else {
                floorType = 'A';
            }
            for (int j = 0; j < rooms; j++) {
                System.out.printf("%s%d%d ",floorType,i,j);
            }
            System.out.println();
        }
    }
}
