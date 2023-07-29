import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Javadoc documentation by Niccolo G. Jimenez and Jannica S. Lim
 * The class is a blueprint to create an object, the class "RegularVM" creates a regular vending machine
 * The class "RegularVM" has 5 attributes: slot, balance, totalIncome, stockRecord, money;
 */
public class RegularVM {
    private ArrayList<Item> slot;
    private double balance;
    private double totalIncome;
    Map<String,Integer> stockRecordMap = new LinkedHashMap<String,Integer>();    
    private cashRegister cashRegister;
    /**
     * A constructor that creates a regular vending machine.
     * 
     * Items in each slot of the machine are initialized with each having a 
     * stock of 10 then added to their respective slot.
     * Money inside the machine is also created.
    */
    public RegularVM(){
        Item itemOne = new Item("Pepperoni", 53, 136, 10);
        Item itemTwo = new Item("Ham", 69, 40, 10);
        Item itemThree = new Item("Sausage", 55, 210, 10);
        Item itemFour = new Item("BBQ Chicken", 55, 215, 10);
        Item itemFive = new Item("Mozarella", 40, 85, 10);
        Item itemSix = new Item("Parmesan", 50, 42, 10);
        Item itemSeven = new Item("Jalapenos", 45, 12.3, 10);
        Item itemEight = new Item("Mushroom", 43, 10.2, 10);
        Item itemNine = new Item("Olives", 37, 13.2, 0);
        slot = new ArrayList<>();
        slot.add(itemOne);
        slot.add(itemTwo);
        slot.add(itemThree);
        slot.add(itemFour);
        slot.add(itemFive);
        slot.add(itemSix);
        slot.add(itemSeven);
        slot.add(itemEight);
        slot.add(itemNine);
        cashRegister = new cashRegister(10);    
    }

    //Vending Features

    /**
     * Receives payment from customer in different denominations.
     * Adds inputted value to the customer's balance 
     * and adds 1 to selected money denomination in the machine.
     * 
     * @param val value of the bill or coin inserted into the vending machine
     */
    public void insertPayment(int val){
        balance += val;
        cashRegister.addMoney(val, 1);
    }

    /**
     * Prints the available items of the vending machine, including its 
     * name, price, and calories.
     */
    public void displayItems(){
        System.out.printf("%26s", "Items\n");
        System.out.println("-----------------------------------------------");
        System.out.printf("%10s%19s%18s", "Name", "Price", "Calories\n");
        System.out.println("-----------------------------------------------");
        
        for (int i = 0; i < slot.size(); i++)
        {
            
            if (slot.get(i).getStock() > 0)
                if(i < 10)
                    System.out.printf("%d.) %-17s%8.2f%s%12.1fkcal\n", i+1, slot.get(i).getName(), slot.get(i).getPrice(), "P", slot.get(i).getCalories());
                else
                    System.out.printf("%d.) %-17s%5.2f%s%11.1fkcal\n", i+1, slot.get(i).getName(), slot.get(i).getPrice(), "P", slot.get(i).getCalories());
            else
                System.out.printf("%d.) %-24sNOT AVAILABLE\n", i+1, slot.get(i).getName());
                
        }
    }

    /**
     * Orders item from vending machine.
     * Selected item is dispensed, which entails diminishing the item's stock by one,
     * and returns change, if present, to customer. Order is cancelled when machine does 
     * not have enough change to give.
     * 
     * @param selOrder index of selected item to order
     */
    public void orderItem(int selOrder) {

        //if selected item is available
        if(slot.get(selOrder).getStock() > 0)

            //if customer has enough balance
            if(balance >= slot.get(selOrder).getPrice()){
                if(cashRegister.checkAvail(balance - slot.get(selOrder).getPrice())){

                slot.get(selOrder).removeStock(1);
                balance -= slot.get(selOrder).getPrice();
                
                System.out.print("\033[H\033[2J");
                System.out.println("\nDispensing " + slot.get(selOrder).getName() + "...");
                System.out.printf("Thank you for your purchase!\n\n", balance);
                receiveChange();
                }
                else{
                    System.out.print("\033[H\033[2J");
                    System.out.println("!: Sorry, this machine does not have enough change to return.");   
                    System.out.println("Cancelling transaction..."); 
                    System.out.println("Returning money...");   
                    receiveChange();                  
                }
            }
            else{
                System.out.print("\033[H\033[2J");
                System.out.println("\n!: Sorry, you do not have enough balance.\n"); 
            }
        else
        {
            System.out.print("\033[H\033[2J");
            System.out.println("\n!: Sorry, that item is out of stock.\n");
        } 
    }
    
    /**
     * Dispenses customer's current balance after purchase deductions.
     */
    public void receiveChange(){
        if(balance > 0){
            System.out.printf("\nYour change is P%.2f.\n\n", balance);
            cashRegister.dispenseMoney(balance);
            balance = 0;
        }
        else
            System.out.println("You have no change to receive.\n");
    }

    //Maintenance Features

    /**
     * Prints the available items of the vending machine, 
     * including its name, price, and stock number.
     */
    public void maintDisplayItems(){
        System.out.printf("%25s", "Items\n");
        System.out.println("--------------------------------------------");
        System.out.printf("%10s%19s%13s", "Name", "Price", "Stock\n");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < slot.size(); i++)
        {
            if(i < 9)
                System.out.printf("%d.) %-17s%8.2f%s%10d\n", i+1, slot.get(i).getName(),slot.get(i).getPrice(), "P", slot.get(i).getStock());
            else
                System.out.printf("%d.) %-17s%7.2f%s%10d\n", i+1, slot.get(i).getName(),slot.get(i).getPrice(), "P", slot.get(i).getStock());
        }
    }
    
    /**
     * Restocks selected item by adding inputted number to current stock.
     * 
     * @param index index of the selected item to restock
     * @param amount amount to add to stock of selected item
     */
    public void restockItem(int index, int amount){

        if (slot.get(index).addStock(amount))
        {
            System.out.printf("\nItem: %s has been restocked by: %d successfully.\n\n", slot.get(index).getName(), amount);
        }
        else
            System.out.printf("\n!: Restock amount exceeds slot capacity (20)\n\n");
    }

    /**
     * Sets a new price to selected item.
     * 
     * @param index index of selected item
     * @param newPrice new price of selected item
     */
    public void setPrice(int index, double newPrice){
        slot.get(index).changePrice(newPrice);
        System.out.print("\033[H\033[2J");
        System.out.printf("Price of: %s has been changed to %.2f\n\n", slot.get(index).getName(), newPrice);
    }
    
    /**
     * Dispenses all money in denominations currently inside the machine.
     */
    public void collectMoney()
    {
        System.out.printf("\nTotal money held is P%.2f\n\n", cashRegister.getTotal());
        if(cashRegister.getTotal() != 0)
            cashRegister.dispenseAll();
        else
            System.out.println("No money to dispense.");
    }

    /**
     * Adds to the number of bills or coins for selected denomination.
     * 
     * @param val value of money denomination
     * @param amt number of bills or coins to add
     */
    public void replenishMoney(int val, int amt){
        cashRegister.addMoney(val, amt);
        System.out.printf("\nSuccessfully added %d P%d bills/coins.\n", amt, val);                                                        
    }

    /**
     * Prints the number of each denomination currently in the machine.
     */
    public void viewDenominations(){
        System.out.print("\033[H\033[2J");
        System.out.println("\nMachine currently has");
        System.out.printf("\n%d P500 bills...", cashRegister.getFiveHundred());
        System.out.printf("\n%d P200 bills...", cashRegister.getTwoHundred());
        System.out.printf("\n%d P100 bills...", cashRegister.getHundred());
        System.out.printf("\n%d P50 bills...", cashRegister.getFifty());
        System.out.printf("\n%d P20 bills...", cashRegister.getTwenty());
        System.out.printf("\n%d P10 bills...", cashRegister.getTen());
        System.out.printf("\n%d P5 bills...", cashRegister.getFive());
        System.out.printf("\n%d P1 bills...\n", cashRegister.getOne());
        System.out.printf("\ncoming to a total of P%.2f.\n", cashRegister.getTotal());
    }

    /**
     * Prints the summary of transactions involving earnings and inventory stock.
     */
    public void printSummary(){
        double totalEarnings = 0;
        int totalStart = 0;
        int totalEnd = 0;
        System.out.printf("%28s\n", "Inventory");
        System.out.println("-----------------------------------------------");
        System.out.printf("%10s%22s%16s", "Name", "Starting Stock", "Current Stock\n");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < slot.size(); i++)
        {
            System.out.printf("%d.) %-17s%6s%13d\n", i+1, slot.get(i).getName(), stockRecordMap.get(slot.get(i).getName()), slot.get(i).getStock());
            totalStart += stockRecordMap.get(slot.get(i).getName());
            totalEnd += slot.get(i).getStock();
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("Total: %20d%13d\n", totalStart, totalEnd);
        System.out.printf("\n%27s\n", "Summary");
        System.out.println("-----------------------------------------------");
        System.out.printf("%10s%22s%16s\n", "Name", "Quantity Sold", "Earnings");
        System.out.println("-----------------------------------------------");
        int amtsold;
        for (int i = 0; i < slot.size(); i++)
        {
            amtsold = stockRecordMap.get(slot.get(i).getName()) - slot.get(i).getStock();
            totalEarnings += amtsold * slot.get(i).getPrice();
            System.out.printf("%d.) %-17s%6d%15s%.2f\n", i+1, slot.get(i).getName(), amtsold, "P",amtsold * slot.get(i).getPrice() );
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("Total Earnings (since last restocking):%3s%.2f\n", " P", totalEarnings);
        System.out.println("-----------------------------------------------");
    }

    /**
     * Returns the total income earned by the vending machine.
     * 
     * @return total money earned
     */
    public double getTotalIncome(){
        return this.totalIncome;
    }

    /**
     * Returns the current customer's balance.
     * 
     * @return amount of money the customer has
     */
    public double getBalance(){
        return this.balance;
    }

    /**
     * Records the stock to a hashmap
     */
    public void recordStock()
    {
        for (int i=0; i<slot.size(); i++) {
        stockRecordMap.put(slot.get(i).getName(), slot.get(i).getStock());
        }
    }

    /**
     * Adds item to the arraylist given the index and item information
     * @param index index of the free slot
     * @param name name of the new item
     * @param price price of the new item
     * @param calories calories of the new item
     * @param stock stock to be set of the new item
     */
    public void addItem(int index,String name, double price, double calories, int stock)
    {
        Item toAdd = new Item(name, price,calories, stock); 
        slot.set(index, toAdd);
    }
}
