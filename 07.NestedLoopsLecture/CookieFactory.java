import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int batch = Integer.parseInt(scanner.nextLine());
        String input = "";
        boolean flourPass = false;
        boolean eggsPass = false;
        boolean sugarPass = false;
        boolean allPass = false;

        for (int i = 1; i <= batch; i++) {


            while (true){
                input = scanner.nextLine();

                if (input.equals("flour")) {
                    flourPass = true;
                } else if (input.equals("eggs")) {
                    eggsPass = true;
                } else if (input.equals("sugar")) {
                    sugarPass = true;
                }
                if (flourPass && eggsPass && sugarPass) {
                    allPass = true;
                }

                if (input.equals("Bake!") && !allPass) {
                    System.out.println("The batter should contain flour, eggs and sugar!");
                }
                if (input.equals("Bake!") && allPass) {
                    break;
                }

            }

            if (allPass) {
                System.out.printf("Baking batch number %d...%n", i);
                flourPass = false;
                eggsPass = false;
                sugarPass = false;
                allPass = false;
            }


        }
    }
}
