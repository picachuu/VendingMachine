import java.util.Scanner;

public class VMFactory {
    public static void main(String[] args) {

        //Main Menu
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Create a Vending Machine");
        System.out.println("[2] Test a Vending Maachine");
        System.out.println("[3] Exit");

        boolean isValid = false;

        while (!isValid) {
            int nChoice = sc.nextInt();
            switch(nChoice) {
                case 1:
                    isValid = true;
                    System.out.print("\033[H\033[2J");
                    System.out.println("Create Screen");
                    break;
                case 2:
                    System.out.println("\nSorry! This feature is not yet available.");
                    System.out.println("Please re-enter input:");
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Sorry, that is not option. Please re-enter input:");
                }
        }
        sc.close();
    }

}
