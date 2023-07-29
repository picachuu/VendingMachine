import java.util.Scanner;

public class VMFactory {

    public static void main(String[] args) {
        RegularVM vm = null;
        Scanner sc = new Scanner(System.in);

        boolean willLoop = false;        
        do{
            System.out.println("\n----------Main Menu----------");
            System.out.println("[1] Create a Vending Machine");
            System.out.println("[2] Test a Vending Maachine");
            System.out.println("[3] Exit"); 
            System.out.print("Input: ");
            int nChoice = sc.nextInt();

            switch(nChoice){
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

                        System.out.print("\033[H\033[2J");  
                        switch(nCreateChoice){
                            case 1:
                                willLoop2 = true;       
                                System.out.println("\nRegular Vending Machine successfully created!\n");
                                vm = new RegularVM();
                                vm.recordStock();
                                break;
                            case 2:
                                willLoop2 = true;       
                                System.out.println("\nSpecial Vending Machine successfully created!\n");
                                vm = new SpecialVM();
                                vm.recordStock();
                                break;
                            case 3:
                                willLoop2 = true;
                                break;
                            default:
                                System.out.println("\n!: Sorry, that is not option.");
                        }
                    }while(!willLoop2);
                    break;

                case 2:
                    System.out.print("\033[H\033[2J");

                    if (vm == null)
                        System.out.println("\n!: Sorry! There is no vending machine to test.");
                    else 
                    {
                        boolean willLoop3 = false;
                       
                        do{                        
                            System.out.println("\n----------Test----------");
                            System.out.println("[1] Vending Features");
                            System.out.println("[2] Maintenance Features");
                            System.out.println("[3] Return to Main Menu");
                            System.out.print("Input: ");
                            int nTestChoice = sc.nextInt();

                            System.out.print("\033[H\033[2J");
                            switch(nTestChoice){
                                case 1:
                                    boolean willLoop4 = false;
                                    do{                        
                                        System.out.printf("Current Balance: P%.2f\n", vm.getBalance());
                                        System.out.println("\n-------Vending Features-------");
                                        System.out.println("[1] Insert Payment");
                                        System.out.println("[2] Order Item");
                                        System.out.println("[3] Receive Change");
                                        System.out.println("[4] Return to Test Menu");
                                        System.out.print("Input: ");
                                        int nVenChoice = sc.nextInt();

                                        System.out.print("\033[H\033[2J");
                                        switch(nVenChoice){
                                            case 1:
                                                System.out.println("We accept the following: ");
                                                System.out.println("Bills: 500, 100, 50, 20");
                                                System.out.println("Coins: 10, 5, 1");
                                                System.out.println("Enter 0 to exit.\n");
                                                System.out.printf("\nPlease input bill/coin value to insert: ");
                                                
                                                boolean willLoop6 = false;
                                                do{
                                                    int value = sc.nextInt();
                                                    if(value != 500 && value != 100 && value != 50 && value != 50 && value != 20 && value != 10 && value != 5 && value != 1 && value != 0)
                                                        System.out.printf("\nSorry, we don't accept that. Please enter another value: ");
                                                    else if(value == 0){
                                                        System.out.print("\033[H\033[2J");
                                                        willLoop6 = true;
                                                    }                                                        
                                                    else{                                            
                                                        vm.insertPayment(value);
                                                        System.out.println("Successfully added P" + value + "!\n");
                                                        System.out.printf("Please input bill/coin value to insert: ");
                                                    }                                                      
                                                }while(!willLoop6);
                                                break;

                                            case 2:
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
                                                        System.out.printf("\n!: Sorry, that is not option. Please re-enter input: ");
                                                }while(!willLoop5);
                                                break;

                                            case 3:
                                                vm.receiveChange();
                                                break;

                                            case 4:
                                                willLoop4 = true;
                                                break;

                                            default: 
                                                System.out.println("\n!: Sorry, that is not option.");
                                        }
                                    }while(!willLoop4);
                                    break;

                                case 2:
                                    boolean willLoop6 = false;
                                    do{
                                        System.out.println("\n-------Maintenance Features-------");
                                        System.out.println("[1] Restock / Stock");
                                        System.out.println("[2] Set Price");
                                        System.out.println("[3] Collect Money");
                                        System.out.println("[4] Replenish Money");
                                        System.out.println("[5] View Denominations of Money");
                                        System.out.println("[6] Print Summary of Transactions");
                                        System.out.println("[7] Return to Test Menu");
                                        System.out.print("Input: ");
                                        int nMainChoice = sc.nextInt();

                                        switch(nMainChoice){
                                            case 1:
                                                boolean looper = true, looper2 = true;
                                                int index;
                                                int choice;
                                                vm.stockRecordMap.clear();
                                                System.out.print("\033[H\033[2J");

                                                do{
                                                    
                                                    vm.maintDisplayItems();
                                                    System.out.println("\n-------Stocking Options-------");
                                                    System.out.println("[1] Restock items");
                                                    System.out.println("[2] Stock New Items");
                                                    System.out.println("[3] Exit");
                                                    System.out.print("\nInput: ");
                                                    int restockChoice = sc.nextInt();
                                                    System.out.print("\033[H\033[2J");
                                                    
                                                    switch(restockChoice){
                                                        case 1: 
                                                            do{                                                               
                                                                vm.maintDisplayItems();

                                                                do{
                                                                    System.out.print("\nPlease enter item number (Enter 10 to exit): ");
                                                                    choice = sc.nextInt();
                                                                    if (choice > 10)
                                                                        System.out.println("Please enter item a number between 1-10!");
                                                                }while(choice > 10);
                                                                
                                                                if (choice != 10){
                                                                    index = choice - 1 ;
                                                                    System.out.printf("Please enter amount to restock: ");
                                                                    int toRestock = sc.nextInt();
                                                                    System.out.print("\033[H\033[2J");
                                                                    vm.restockItem(index, toRestock);
                                                                }
                                                                else{
                                                                    looper = false;
                                                                    System.out.print("\033[H\033[2J");
                                                                }
                                                            }while (looper);
                                                            break;

                                                        case 2:
                                                                boolean looper3 = true;
                                                                double newPrice =0;
                                                                int newStock;
                                                                vm.maintDisplayItems();
                                                                System.out.print("Please enter slot: ");
                                                                int newSlot = sc.nextInt() - 1;
                                                                System.out.print("Please enter item name: ");
                                                                sc.nextLine();
                                                                String newName = sc.nextLine();
                                                                do{
                                                                System.out.print("Please enter item price: ");
                                                                newPrice = sc.nextDouble();
                                                                if (newPrice % 1 == 0)
                                                                    looper3 = false;
                                                                else
                                                                    System.out.println("\nThis machine does not take centavos\n");
                                                                }while (looper3);
                                                                System.out.print("Please enter item calories: ");
                                                                double newCal = sc.nextDouble();
                                                                looper3 =true;
                                                                do{
                                                                System.out.print("Amount to be stocked: ");
                                                                newStock= sc.nextInt();
                                                                if (newStock <= 20)
                                                                    looper3 =false;
                                                                else
                                                                    System.out.println("Amount exceeds max item stock (20)");
                                                                }while (looper3);
                                                                vm.addItem(newSlot, newName, newPrice, newCal, newStock);
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.printf("\n Item: %s has been Stocked by: %d successfully.\n\n", newName, newStock);
                                                                break;
                                                        case 3:
                                                            //System.out.println("Exiting Stocking Options...\nReturning to Maintenance Features");
                                                            looper2 = false;
                                                            System.out.print("\033[H\033[2J");
                                                            break;
                                                        default:
                                                            System.out.println("That is not an option.\n");
                                                    }
                                                }while(looper2);
                                                vm.recordStock();
                                                break;

                                            case 2:
                                                double newPrice;

                                                System.out.print("\033[H\033[2J");
                                                vm.maintDisplayItems();
                                                System.out.printf("\nPlease enter item number: ");
                                                int index2 = sc.nextInt() - 1;

                                                if(index2 < 9){                                                
                                                    do{
                                                        System.out.printf("\nPlease enter new price: ");
                                                        newPrice = sc.nextDouble();
                                                        if (newPrice % 1 == 0)
                                                            vm.setPrice(index2, newPrice);
                                                        else
                                                            System.out.println("Sorry, this machine does not take centavos.");
                                                    }while(newPrice % 1 != 0);
                                                }
                                                else{
                                                    System.out.print("\033[H\033[2J");
                                                    System.out.println("That is not an option.");
                                                }
                                                break;

                                            case 3:
                                                System.out.print("\033[H\033[2J");
                                                vm.collectMoney();
                                                break;

                                            case 4:
                                                boolean willLoop7 = true;
                                                System.out.print("\033[H\033[2J");

                                                do{
                                                    System.out.println("[1] P500");
                                                    System.out.println("[2] P100");
                                                    System.out.println("[3] P50");
                                                    System.out.println("[4] P20");
                                                    System.out.println("[5] P10");
                                                    System.out.println("[6] P5");
                                                    System.out.println("[7] P1");
                                                    System.out.println("[8] Exit");

                                                    boolean willLoop8 = true; 
                                                    while(willLoop8){
                                                        System.out.print("\nChoose which bill/coin to replenish: ");
                                                        int nVal = sc.nextInt();

                                                        if(nVal > 0 && nVal <8){
                                                            System.out.print("\nHow many bills/coins?: ");
                                                            int nAmt = sc.nextInt();
                                                            vm.replenishMoney(nVal, nAmt);
                                                        }
                                                        else if(nVal == 8){
                                                            System.out.print("\033[H\033[2J");
                                                            willLoop7 = false;
                                                            willLoop8 = false;
                                                        }
                                                        else
                                                            System.out.println("Sorry that is not a bill or coin we accept.\n");
                                                    }
                                                }while(willLoop7);
                                                break;

                                            case 5:
                                                vm.viewDenominations();
                                                break;

                                            case 6:
                                                System.out.print("\033[H\033[2J");
                                                vm.printSummary();
                                                break;

                                            case 7:
                                                willLoop6 = true;
                                                System.out.print("\033[H\033[2J");
                                                break;

                                            default:
                                                System.out.print("\033[H\033[2J");
                                                System.out.println("\n!: Sorry, that is not option.");
                                        }
                                    }while(!willLoop6);
                                    break;

                                case 3:
                                    willLoop3 = true;
                                    break;

                                default: 
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
        }while(!willLoop);
        sc.close();
    }
}
