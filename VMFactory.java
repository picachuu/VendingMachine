import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

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
                                vm = new RegularVM();
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
                    if (vm == null)
                    {
                        System.out.print("\033[H\033[2J");
                        System.out.println("\n!: Sorry! There is no vending machine to test.");
                    }
                    else 
                    {
                        //RegularVM vm = new RegularVM();
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
                                        System.out.printf("Current Balance: P%.2f\n", vm.getBalance());
                                        System.out.println("\n-------Vending Features-------");
                                        System.out.println("[1] Insert Payment");
                                        System.out.println("[2] Order Item");
                                        System.out.println("[3] Receive Change");
                                        System.out.println("[4] Return to Test Menu");
                                        System.out.print("Input: ");
                                        int nVenChoice = sc.nextInt();
                                        switch(nVenChoice) {
                                            case 1:
                                                System.out.print("\033[H\033[2J");
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
                                                    else{
                                                        System.out.printf("\n!: Sorry, that is not option. Please re-enter input: ");
                                                    }                       
                                                }while(!willLoop5);
                                                break;
                                            case 3:
                                                System.out.print("\033[H\033[2J");
                                                vm.receiveChange();
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
                                        System.out.println("\n-------Maintenance Features-------");
                                        System.out.println("[1] Restock / Stock");
                                        System.out.println("[2] Set Price");
                                        System.out.println("[3] Collect Income");
                                        System.out.println("[4] Replenish Money");
                                        System.out.println("[5] View Denominations of Money");
                                        System.out.println("[6] Print Summary of Transactions");
                                        System.out.println("[7] Return to Test Menu");
                                        System.out.print("Input: ");
                                        int nMainChoice = sc.nextInt();
                                        switch(nMainChoice)
                                        {
                                            case 1:
                                                boolean looper = true, looper2 = true;
                                                int index;
                                                int choice;
                                                vm.stockRecordMap.clear();
                                                do
                                                {
                                                    vm.maintDisplayItems();
                                                    System.out.println("\n-------Stocking Options-------");
                                                    System.out.println("[1] Restock items");
                                                    System.out.println("[2] Stock New Items");
                                                    System.out.println("[3] Exit");
                                                    System.out.print("Input: ");
                                                    int restockChoice = sc.nextInt();
                                                    switch(restockChoice)
                                                    {
                                                        case 1: 
                                                                do
                                                                {
                                                                    do
                                                                    {
                                                                    System.out.println("Please enter item number (Enter 10 to exit): ");
                                                                    choice = sc.nextInt();
                                                                    if (choice > 10)
                                                                        System.out.println("Please enter item a number between 1-10!\n");
                                                                    } while(choice > 10);
                                                                    if (choice != 10)
                                                                    {
                                                                        index = choice - 1 ;
                                                                        System.out.println("Please enter amount to restock: ");
                                                                        int toRestock = sc.nextInt();
                                                                        vm.restockItem(index, toRestock);
                                                                    }
                                                                    else
                                                                        looper = false;
                                                                }while (looper);
                                                                break;
                                                        case 2:
                                                                if (vm.checkEmpty() != -1)
                                                                {
                                                                    System.out.println("Please enter item name: ");
                                                                    String bufferString = sc.nextLine();
                                                                    String newName = sc.nextLine();
                                                                    System.out.println("Please enter item price: ");
                                                                    double newPrice = sc.nextDouble();
                                                                    System.out.println("Please enter item calories: ");
                                                                    double newCal = sc.nextDouble();
                                                                    System.out.println("Amount to be stocked: ");
                                                                    int newStock = sc.nextInt();
                                                                    vm.addItem(vm.checkEmpty(), newName, newPrice, newCal, newStock);
                                                                    System.out.printf("\n Item: %s has been Stocked by: %d successfully.\n", newName, newStock);
                                                                }
                                                                else
                                                                    System.out.println("No available slots!");
                                                                    break;
                                                        case 3:
                                                                System.out.println("Exiting Stocking Options...\nReturning to Maintenance Features");
                                                                looper2 = false;
                                                                break;
                                                    }
                                                }while(looper2);
                                                vm.recordStock();
                                                break;
                                            case 2:
                                                vm.maintDisplayItems();
                                                System.out.println("Please enter item number: ");
                                                int index2 = sc.nextInt() - 1;
                                                double newPrice;
                                                do{
                                                System.out.println("Please enter new price: ");
                                                newPrice = sc.nextDouble();
                                                if (newPrice % 1 == 0)
                                                    vm.setPrice(index2, newPrice);
                                                else
                                                    System.out.println("\nThis machine does not take centavos\n");
                                                }while(newPrice%1!=0);
                                                break;
                                            case 3:
                                                // System.out.println("3");
                                                // String buff3 = sc.nextLine();
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
                                                        //willLoop7 = false;
                                                        System.out.print("\nHow many bills/coins?: ");
                                                        int nAmt = sc.nextInt();
                                                        vm.replenishMoney(nVal, nAmt);
                                                    }
                                                    else if(nVal == 8){
                                                        System.out.print("\033[H\033[2J");
                                                        willLoop7 = false;
                                                        willLoop8 = false;
                                                    }
                                                    else{
                                                        System.out.println("Sorry that is not a bill or coin we accept.\n");
                                                    }
                                                }
                                                }while(willLoop7);
                                                break;
                                            case 5:
                                                vm.viewDenominations();
                                                break;
                                            case 6:
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
