import java.util.ArrayList;
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

                            //System.out.print("\033[H\033[2J");
                            switch(nTestChoice){
                                case 1:
                                    boolean willLoop4 = false;
                                    do{                        
                                        System.out.printf("Current Balance: P%.2f\n", vm.getBalance());
                                        vm.displayVendingFeaturesMenu();
                                        System.out.print("Input: ");
                                        int nVenChoice = sc.nextInt();

                                        //System.out.print("\033[H\033[2J");
                                        switch(nVenChoice){
                                            case 1:
                                                System.out.println("We accept the following: ");
                                                System.out.println("Bills: 500, 200, 100, 50, 20");
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
                                                boolean willLoop5 = false;
                                                    
                                                    if (vm instanceof SpecialVM)
                                                    {
                                                    ((SpecialVM)vm).displayItems(1,1);
                                                    ArrayList<Integer> index = new ArrayList<Integer>();
                                                    System.out.print("\nPlease enter item number: ");
                                                    do
                                                    {
                                                        int selOrder = sc.nextInt() - 1;
                                                        if (vm.slotRecord.get(selOrder).getType()== 3)
                                                        {
                                                            Pizza order = new Pizza();
                                                            System.out.println("Dough is being prepared! (PHP100)\n");
                                                            if(((SpecialVM)vm).addIngredient(order, 9))
                                                            {
                                                                index.add(selOrder);
                                                                System.out.println("Dough is ready!\n");
                                                                ((SpecialVM)vm).displayItems(2,0);
                                                                System.out.println("\nPlease choose a sauce: ");
                                                                selOrder = sc.nextInt() - 1;
                                                                if(((SpecialVM)vm).addIngredient(order, selOrder))
                                                                {
                                                                    order.TotalPrice();
                                                                    System.out.printf("\nCurrent Price: P%.2f\n", order.getPrice());
                                                                    index.add(selOrder);
                                                                    boolean looper;
                                                                    int counter = 5;
                                                                    do
                                                                    {
                                                                        looper = true;
                                                                        System.out.printf("\nWhat toppings would you like to add [%d]: ", counter);
                                                                        System.out.println("0.) Done");
                                                                        ((SpecialVM)vm).displayItems(1,0);
                                                                        selOrder = sc.nextInt() - 1;
                                                                        if(selOrder == -1)
                                                                            looper = false;
                                                                        else if(((SpecialVM)vm).addIngredient(order, selOrder) && selOrder <= 8)
                                                                        {
                                                                            order.TotalPrice();
                                                                            System.out.printf("\nCurrent Price: P%.2f\n", order.getPrice());
                                                                            index.add(selOrder);
                                                                            counter--;
                                                                        }
                                                                        else
                                                                            System.out.println("\n!: Sorry, that is not option. Please re-enter input: ");
                                                                    }while(looper && counter > 0);
                                                                    order.TotalPrice();
                                                                    order.TotalCalories();
                                                                    System.out.printf("\nYour order will cost: P%.2f\n", order.getPrice());
                                                                    System.out.printf("\nTotal Calories: %.1fkcal\n", order.getCalories());
                                                                    if(vm.getBalance() >= order.getPrice())
                                                                    {
                                                                        ((SpecialVM)vm).orderIngredient(order.getPrice(), index);
                                                                        ((SpecialVM)vm).displayPrep(order);
                                                                        //vm.orderItem(selOrder);
                                                                        willLoop5 = true;
                                                                    }
                                                                    else
                                                                    {
                                                                        System.out.println("\nSorry, you don't have enough money.");
                                                                        System.out.println("\nTransaction Cancelled.");
                                                                        willLoop5 = true;
                                                                    }
                                                                }
                                                                else
                                                                    System.out.println("\n!: Sorry, that is not option. Please re-enter input: ");
                                                            }
                                                            else
                                                                System.out.println("\n!: Sorry, that is not option. Please re-enter input: ");
                                                        }
                                                        else if (vm.slotRecord.get(selOrder).getType() == 1)
                                                            if(selOrder >=0 && vm.slotRecord.size() >= selOrder){
                                                            willLoop5 = true;
                                                            vm.orderItem(selOrder);
                                                            }
                                                        else
                                                            System.out.printf("\n!: Sorry, that is not option. Please re-enter input: ");
                                                    
                                                    }while(!willLoop5);
                                                    
                                                    }
                                                    else if (vm instanceof RegularVM)
                                                    {
                                                        vm.displayItems();
                                                        System.out.print("\nPlease enter item number: ");
                                                        do
                                                        {
                                                            int selOrder = sc.nextInt() - 1;
                                                            if(selOrder >=0 && selOrder <= 8){
                                                            willLoop5 = true;
                                                            vm.orderItem(selOrder);
                                                        }   
                                                        else
                                                        System.out.printf("\n!: Sorry, that is not option. Please re-enter input: ");
                                                        }while(!willLoop5);
                                                        
                                                    }
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
                                                    if (vm instanceof SpecialVM)                                                                
                                                        ((SpecialVM)vm).maintDisplayItems(0);
                                                    else
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
                                                                if (vm instanceof SpecialVM)                                                                
                                                                    ((SpecialVM)vm).maintDisplayItems(0);
                                                                else
                                                                    vm.maintDisplayItems();
                                                                do{
                                                                    System.out.printf("\nPlease enter item number (Enter %d to exit): ", vm.slotList.size() + 1);
                                                                    choice = sc.nextInt();
                                                                    if (choice == 1)
                                                                        System.out.printf("\nSorry, you can't restock this item!\n");
                                                                    else if (choice > vm.slotList.size() + 1 || choice < 1)
                                                                        System.out.printf("\nPlease enter item a number between 1-%d!\n", vm.slotList.size() + 1);
                                                                }while(choice > vm.slotList.size() + 1 || choice < 2);
                                                                
                                                                if (choice != vm.slotList.size() + 1){
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
                                                            if (vm instanceof SpecialVM)
                                                            {
                                                                ((SpecialVM)vm).maintDisplayItems(1);
                                                                boolean looper3 = true;
                                                                int toReplace, replaceWith, newStock;
                                                                do
                                                                {
                                                                System.out.print("\nPlease enter item to replace: ");
                                                                toReplace = sc.nextInt() - 1;
                                                                if (!vm.slotRecord.get(toReplace).getName().equals("Dough") && !vm.slotRecord.get(toReplace).getName().equals("Pizza"))
                                                                    looper3 = false;
                                                                else
                                                                    System.out.printf("\n!: Sorry, %s cannot be replaced. Please re-enter input: ", vm.slotRecord.get(toReplace).getName());
                                                                }while (looper3);
                                                                System.out.print("\nPlease enter item to replace with: "); 
                                                                replaceWith = sc.nextInt() - 1;
                                                                ((SpecialVM)vm).replaceItem(toReplace, replaceWith);
                                                                System.out.print("\nPlease enter stock of new item: "); 
                                                                newStock = sc.nextInt();
                                                                ((SpecialVM)vm).restockItem(toReplace, newStock);
                                                            }    
                                                            else
                                                            {                                                            
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
                                                            }
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
                                                    System.out.println("Denominations available:");
                                                    System.out.println("Bills: P500, P200, P100, P50, P20");
                                                    System.out.println("Coins: P10, P5, P1");
                                                    System.out.println("Enter 0 to exit. \n");

                                                    boolean willLoop8 = true; 
                                                    while(willLoop8){
                                                        System.out.printf("Please input bill/coin value to insert: ");
                                                        int value = sc.nextInt();
                                                        if(value != 500 && value != 100 && value != 50 && value != 50 && value != 20 && value != 10 && value != 5 && value != 1 && value != 0)
                                                            System.out.println("\nSorry that is not a bill or coin we accept.\n");
                                                        else if(value == 0){
                                                            System.out.print("\033[H\033[2J");
                                                            willLoop7 = false;
                                                            willLoop8 = false;
                                                        }
                                                        else{
                                                            System.out.printf("\nHow many bills/coins?: ");
                                                            int amount = sc.nextInt();
                                                            vm.replenishMoney(value, amount);
                                                        }
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
