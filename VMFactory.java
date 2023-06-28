import java.util.Scanner;

public class VMFactory {
    public static void main(String[] args) {

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
                    boolean willLoop2 = false;

                    do{
                        System.out.println("\n----------Create----------");
                        System.out.println("[1] Regular Vending Machine");
                        System.out.println("[2] Special Vending Maachine");
                        System.out.println("[3] Return to Main Menu");
                        System.out.print("Input: ");
                        int nCreateChoice = sc.nextInt();
                        switch(nCreateChoice) {
                            case 1:
                                willLoop2 = true;       
                                System.out.print("\033[H\033[2J");                         
                                System.out.println("\nRegular Vending Machine successfully created!\n");
                                vmExists = true;
                                break;
                            case 2:
                                System.out.print("\033[H\033[2J");
                                System.out.println("\n!: Sorry! This feature is not yet available.");
                                break;
                            case 3:
                                willLoop2 = true;
                                System.out.print("\033[H\033[2J");
                                break;
                            default:
                                System.out.print("\033[H\033[2J");
                                System.out.println("\n!: Sorry, that is not option.");
                        }
                    }while (!willLoop2);
                    break;
                case 2:
                    if (!vmExists)
                    {
                        System.out.print("\033[H\033[2J");
                        System.out.println("\n!: Sorry! There is no vending machine to test.");
                    }
                    else 
                    {
                        RegularVM vm = new RegularVM();
                        System.out.print("\033[H\033[2J");
                        boolean willLoop3 = false;
                       
                        do{                        
                            System.out.println("\n----------Test----------");
                            System.out.println("[1] Vending Features");
                            System.out.println("[2] Maintenance Features");
                            System.out.println("[3] Return to Main Menu");
                            System.out.print("Input: ");
                            int nTestChoice = sc.nextInt();
                            switch(nTestChoice) {
                                case 1:
                                    System.out.print("\033[H\033[2J");
                                    boolean willLoop4 = false;
                                    do{                        
                                        System.out.printf("Current Balance: P%.2f\n", vm.getTotalIncome());
                                        System.out.println("\n-------Vending Features-------");
                                        System.out.println("[1] Insert Payment");
                                        System.out.println("[2] Order Item");
                                        System.out.println("[3] Receive Change");//when no change return money
                                        System.out.println("[4] Return to Main Menu");
                                        System.out.print("Input: ");
                                        int nVenChoice = sc.nextInt();
                                        switch(nVenChoice) {
                                            case 1:
                                                System.out.print("\033[H\033[2J");
                                                System.out.println("1");
                                                String buff = sc.nextLine();
                                                break;
                                            case 2:
                                                System.out.print("\033[H\033[2J");
                                                vm.displayItems();
                                                System.out.print("\nPlease enter item number: ");
                                                
                                                boolean willLoop5 = false;
                                                do{
                                                    int selOrder = sc.nextInt() - 1;
                                                    if(selOrder >=0 && selOrder <= 8){
                                                        willLoop5 = true;
                                                        vm.orderItem(selOrder);
                                                    }   
                                                    else
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("\n!: Sorry, that is not option.");
                                                }while(!willLoop5);
                                                break;
                                            case 3:
                                                System.out.print("\033[H\033[2J");
                                                System.out.println("3");
                                                String buff3 = sc.nextLine();
                                                break;
                                            case 4:
                                                willLoop4 = true;
                                                System.out.print("\033[H\033[2J");
                                                break;
                                            default: 
                                                System.out.print("\033[H\033[2J");
                                                System.out.println("\n!: Sorry, that is not option.");
                                        }
                                        
                                    }while(!willLoop4);
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J");
                                    boolean willLoop6 = false;
                                    do{
                                        System.out.printf("Current Balance: P%.2f\n", vm.getTotalIncome());
                                        System.out.println("\n-------Maintenance Features-------");
                                        System.out.println("[1] Restock Item");
                                        System.out.println("[2] Set Price");
                                        System.out.println("[3] Collect Payment");
                                        System.out.println("[4] Replenish Money");
                                        System.out.println("[5] Print Summary of Transactions");
                                        System.out.println("[6] Return to Main Menu");
                                        System.out.print("Input: ");
                                        int nMainChoice = sc.nextInt();
                                        switch(nMainChoice){
                                            case 1:
                                                System.out.println("1");
                                                String buff = sc.nextLine();
                                                break;
                                            case 2:
                                                System.out.println("2");
                                                String buff2 = sc.nextLine();
                                                break;
                                            case 3:
                                                System.out.println("3");
                                                String buff3 = sc.nextLine();
                                                break;
                                            case 4:
                                                System.out.println("4");
                                                String buff4 = sc.nextLine();
                                                break;
                                            case 5:
                                                System.out.println("5");
                                                String buff6 = sc.nextLine();
                                                break;
                                            case 6:
                                                willLoop6 = true;
                                                System.out.print("\033[H\033[2J");
                                                break;
                                            default:
                                                System.out.print("\033[H\033[2J");
                                                System.out.println("\n!: Sorry, that is not option.");
                                        }
                                    }while(!willLoop6);
                                    System.out.println("2");
                                    String buff5 = sc.nextLine();
                                    break;
                                case 3:
                                    willLoop3 = true;
                                    System.out.print("\033[H\033[2J");
                                    break;
                                default: 
                                    System.out.print("\033[H\033[2J");
                                    System.out.println("\n!: Sorry, that is not option.");
                            }
                            
                        }while(!willLoop3);
                    }
                    break;
                case 3:
                    System.out.println("\nThank you! Have a good day!");
                    willLoop = true;
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.println("\n!: Sorry, that is not option.");
                }
        } while (!willLoop);
        sc.close();
    }

}
