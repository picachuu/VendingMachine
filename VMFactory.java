import java.util.Scanner;

public class VMFactory {
    public static void main(String[] args) {

        //Main Menu
        Scanner sc = new Scanner(System.in);
        boolean willLoop = false;

        do{
            System.out.println("\n----------Main Menu----------");
            System.out.println("[1] Create a Vending Machine");
            System.out.println("[2] Test a Vending Maachine");
            System.out.println("[3] Exit"); 
            System.out.print("Input: ");
            int nChoice = sc.nextInt();
            switch(nChoice) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    boolean isValid = false;
                    
                    do{
                        System.out.println("\n----------Create----------");
                        System.out.println("[1] Regular Vending Machine");
                        System.out.println("[2] Special Vending Maachine");
                        System.out.print("Input: ");
                        int nCreateChoice = sc.nextInt();
                        switch(nCreateChoice) {
                            case 1:
                                isValid = true;
                                RegularVM vm = new RegularVM();
                                vm.displayItems();
                                String buff = sc.next();
                                break;
                            case 2:
                                System.out.println("Sorry! This feature is not yet available.\n");
                                break;
                            default:
                                System.out.println("Sorry, that is not option. Please re-enter input:");
                        }
                    }while (!isValid);
                    System.out.print("\033[H\033[2J");
                    break;
                case 2:
                    System.out.println("Sorry! This feature is not yet available.\n");
                    break;
                case 3:
                    System.out.println("\nThank you! Have a good day!");
                    willLoop = true;
                    break;
                default:
                    System.out.println("Sorry, that is not option. Please re-enter input:");
                }
        } while (!willLoop);
        sc.close();
    }

}
