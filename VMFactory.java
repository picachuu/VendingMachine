import java.util.Scanner;

public class VMFactory {
    public static void main(String[] args) {

        //Main Menu
        Scanner sc = new Scanner(System.in);
        boolean willLoop = false;
        boolean vmExists = false;

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
                        System.out.println("[3] Return to Main Menu");
                        System.out.print("Input: ");
                        int nCreateChoice = sc.nextInt();
                        switch(nCreateChoice) {
                            case 1:
                                isValid = true;       
                                System.out.print("\033[H\033[2J");                         
                                System.out.println("\nRegular Vending Machine successfully created!\n");
                                vmExists = true;
                                break;
                            case 2:
                                System.out.println("\nSorry! This feature is not yet available.");
                                break;
                            case 3:
                                isValid = true;
                                break;
                            default:
                                System.out.println("\nSorry, that is not option. Please re-enter input.");
                        }
                    }while (!isValid);
                    break;
                case 2:
                    if (!vmExists)
                    {
                        System.out.print("\033[H\033[2J");
                        System.out.println("\nSorry! There is no vending machine to test.");
                    }
                    else 
                    {
                        RegularVM vm = new RegularVM();
                        System.out.print("\033[H\033[2J");
                        boolean isValid2 = false;
                       
                        do{                        
                            System.out.printf("\nCurrent Balance: P%.2f\n", vm.getTotalIncome());
                            System.out.println("\n----------Test----------");
                            System.out.println("[1] Insert Payment");
                            System.out.println("[2] Order Item");
                            System.out.println("[3] Receive Change");//when no change return money
                            System.out.println("[4] Return to Main Menu");
                            System.out.print("Input: ");
                            int nTestChoice = sc.nextInt();
                            switch(nTestChoice) {
                                case 1:
                                    System.out.print("\033[H\033[2J");
                                    System.out.println("1");
                                    String buff = sc.nextLine();
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J");
                                    vm.displayItems();
                                    System.out.print("\nPlease enter item number: ");
                                    
                                    boolean willLoop2 = false;
                                    do{
                                        int selOrder = sc.nextInt() - 1;
                                        if(selOrder >=0 && selOrder <= 8){
                                            willLoop2 = true;
                                            vm.orderItem(selOrder);
                                        }   
                                        else
                                            System.out.print("\nSorry, that is not an option. Please re-select: ");
                                    }while(!willLoop2);
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J");
                                    System.out.println("3");
                                    String buff3 = sc.nextLine();
                                    break;
                                case 4:
                                    isValid2 = true;
                                    System.out.print("\033[H\033[2J");
                                    break;
                                default: 
                                    System.out.println("\nSorry, that is not option. Please re-enter input:");
                            }
                            
                        }while(!isValid2);
                    }
                    break;
                case 3:
                    System.out.println("\nThank you! Have a good day!");
                    willLoop = true;
                    break;
                default:
                    System.out.println("\nSorry, that is not option. Please re-enter input:");
                }
        } while (!willLoop);
        sc.close();
    }

}
