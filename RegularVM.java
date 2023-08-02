import java.util.*;

/**
 * Javadoc documentation by Niccolo G Jimenez and Jannica S Lim
 * The class is a blueprint to create an object, the class "RegularVM" creates a regular vending machine
 * The class "RegularVM" has 5 attributes: slot, balance, totalIncome, stockRecord, money;
 */
public class RegularVM {

    protected double balance;
    protected double totalIncome;
    Map<Integer, Item> extraItems = new LinkedHashMap<Integer, Item>();
    protected List<List<Item>> slotList = new ArrayList<List<Item>>();
    Map<Integer, Item> slotRecord = new LinkedHashMap<Integer, Item>();
    Map<String,Integer> stockRecordMap = new LinkedHashMap<String,Integer>();    
    protected cashRegister cashRegister;
    /**
     * A constructor that creates a regular vending machine.
     * 
     * Items in each slot of the machine are initialized with each having a 
     * stock of 10 then added to their respective slot.
     * Money inside the machine is also created.
    */
    public RegularVM(){
        StartSlots();
        cashRegister = new cashRegister(10);    
    }

    public void StartSlots(){
        Item itemOne = new Item("Pepperoni", 53, 136);
        Item itemTwo = new Item("Ham", 69, 40);
        Item itemThree = new Item("Sausage", 55, 210);
        Item itemFour = new Item("Chicken", 55, 215);
        Item itemFive = new Item("Mozarella", 40, 85);
        Item itemSix = new Item("Parmesan", 50, 42);
        Item itemSeven = new Item("Jalapenos", 45, 12.3);
        Item itemEight = new Item("Mushroom", 43, 10.2);
        Item itemNine = new Item("Olives", 37, 13.2);
        slotRecord.put(0,itemOne);
        slotRecord.put(1,itemTwo);
        slotRecord.put(2,itemThree);
        slotRecord.put(3,itemFour);
        slotRecord.put(4,itemFive);
        slotRecord.put(5,itemSix);
        slotRecord.put(6,itemSeven);
        slotRecord.put(7,itemEight);
        slotRecord.put(8,itemNine);
        for (int i = 0; i < slotRecord.size(); i++) {
            for (int j = 0; j < 10; j++) {
                if (slotList.size() <= i) {
                    slotList.add(new ArrayList<Item>());
                }
                slotList.get(i).add(slotRecord.get(i));
            }
        }
        
    }
    public void displayVendingFeaturesMenu(){
        System.out.println("\n-------Vending Features-------");
        System.out.println("[1] Insert Payment");
        System.out.println("[2] Order Item");
        System.out.println("[3] Receive Change");
        System.out.println("[4] Return to Test Menu");
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
        
        for (int i = 0; i < Slotlimit; i++)
        {
            
            if (slotList.get(i).size() > 0)
                if(i < 10)
                    System.out.printf("%d.) %-17s%8.2f%s%12.1fkcal\n", i+1, slotRecord.get(i).getName(), slotRecord.get(i).getPrice(), "P", slotRecord.get(i).getCalories());
                else
                    System.out.printf("%d.) %-17s%5.2f%s%11.1fkcal\n", i+1, slotRecord.get(i).getName(), slotRecord.get(i).getPrice(), "P", slotRecord.get(i).getCalories());
            else
                System.out.printf("%d.) %-24sNOT AVAILABLE\n", i+1, slotRecord.get(i).getName());
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
    public String orderItem(int selOrder) {
        String msg = "";

        //if selected item is available
        if(slotList.get(selOrder).size() > 0)

            //if customer has enough balance
            if(balance >= slotRecord.get(selOrder).getPrice()){
                if(cashRegister.checkAvail(balance - slotRecord.get(selOrder).getPrice())){

                slotList.get(selOrder).remove(slotList.get(selOrder).size()-1);
                balance -= slotRecord.get(selOrder).getPrice();
                
                msg += String.format("Dispensing " + slotRecord.get(selOrder).getName() + "...");
                msg += String.format("\nThank you for your purchase!\n\n");
                }
                else{
                    msg += String.format("!: Sorry, this machine does not have \nenough change to return.\n");   
                    msg += String.format("\nCancelling transaction..."); 
                    msg += String.format("\nReturning money...\n");   
                    msg += receiveChange();                  
                }
            }
            else{
                msg += String.format("!: Sorry, you do not have enough\nbalance.\n\n"); 
            }
        else
        {
            msg += String.format("\n!: Sorry, that item is out of stock.\n");
        } 

        return msg;
    }
    
    /**
     * Dispenses customer's current balance after purchase deductions.
     */
    public String receiveChange(){
            String msg = "";
            
            if(balance == 0)
                msg += "You have no change to dispense.";
            else{
                msg += String.format("Your change is P%.2f.\n\n", balance);
                msg += cashRegister.dispenseMoney(balance);
            }
            balance = 0;
            return msg;
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
        for (int i = 0; i < slotList.size(); i++)
                System.out.printf("%d.) %-17s%8.2f%s%10d\n", i+1, slotRecord.get(i).getName(),slotRecord.get(i).getPrice(), "P", slotList.get(i).size());
    }
    
    /**
     * Restocks selected item by adding inputted number to current stock.
     * 
     * @param index index of the selected item to restock
     * @param amount amount of stock of selected item
     */
    public void restockItem(int index, int amount){
        if (slotList.get(index).size() < amount && amount < 21)
        {
            for (int i = 0; i < amount; i++)
            {
                slotList.get(index).add(slotRecord.get(index));
            }
            System.out.printf("\nItem: %s stock has been set to: %d successfully.\n\n", slotRecord.get(index).getName(), amount);
        }
        else if (slotList.get(index).size() > amount )
        {
            for (int i = slotList.get(index).size(); i > amount; i--)
            {
                slotList.get(index).remove(slotRecord.get(index));
            }
            System.out.printf("\nItem: %s stock has been set to: %d successfully.\n\n", slotRecord.get(index).getName(), amount);
        }
        

    }

    /**
     * Sets a new price to selected item.
     * 
     * @param index index of selected item
     * @param newPrice new price of selected item
     */
    public void setPrice(int index, double newPrice){
        slotRecord.get(index).changePrice(newPrice);
        for (int i = 0; i < slotList.get(index).size(); i++)
        {
            slotList.get(index).get(i).changePrice(newPrice);
        }
        System.out.printf("\nItem: %s has been set to P%.2f successfully.\n\n", slotRecord.get(index).getName(), newPrice);
    }
    
    /**
     * Dispenses all money in denominations currently inside the machine.
     */
    public String collectMoney()
    {
        String msg = "";

        msg += String.format("\nTotal money held is P%.2f\n\n", cashRegister.getTotal());
        if(cashRegister.getTotal() != 0)
            msg += cashRegister.dispenseAll();
        else
            msg += ("\nNo money to dispense.");

        return msg;
    }

    /**
     * Adds to the number of bills or coins for selected denomination.
     * 
     * @param val value of money denomination
     * @param amt number of bills or coins to add
     */
    public String replenishMoney(int val, int amt){
        cashRegister.addMoney(val, amt);
        return String.format("\nSuccessfully added %d P%d bills/coin.\n", amt, val);                                                        
    }

    /**
     * Prints the number of each denomination currently in the machine.
     */
    public String viewDenominations(){
        String msg = "";
        msg += String.format("\nMachine currently has");
        msg += String.format("\n%d P500 bills...", cashRegister.getFiveHundred());
        msg += String.format("\n%d P200 bills...", cashRegister.getTwoHundred());
        msg += String.format("\n%d P100 bills...", cashRegister.getHundred());
        msg += String.format("\n%d P50 bills...", cashRegister.getFifty());
        msg += String.format("\n%d P20 bills...", cashRegister.getTwenty());
        msg += String.format("\n%d P10 coins...", cashRegister.getTen());
        msg += String.format("\n%d P5 coins...", cashRegister.getFive());
        msg += String.format("\n%d P1 coins...\n", cashRegister.getOne());
        msg += String.format("\ncoming to a total of P%.2f.\n", cashRegister.getTotal());

        return msg; 
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
        for (int i = 0; i < slotList.size(); i++)
        {
            if (Slotlimit == 10 && i == 0)   
                    System.out.printf("%d.) %s\n", i+1, slotRecord.get(i).getName());
            else
            {
            System.out.printf("%d.) %-17s%6s%13d\n", i+1, slotRecord.get(i).getName(), stockRecordMap.get(slotRecord.get(i).getName()), slotList.get(i).size());
            totalStart += stockRecordMap.get(slotRecord.get(i).getName());
            totalEnd += slotList.get(i).size();
            }
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("Total: %20d%13d\n", totalStart, totalEnd);
        System.out.printf("\n%27s\n", "Summary");
        System.out.println("-----------------------------------------------");
        System.out.printf("%10s%22s%16s\n", "Name", "Quantity Sold", "Earnings");
        System.out.println("-----------------------------------------------");
        int amtsold;
        for (int i = 0; i < slotList.size(); i++)
        {
            amtsold = stockRecordMap.get(slotRecord.get(i).getName()) - slotList.get(i).size();
            totalEarnings += amtsold * slotRecord.get(i).getPrice();
            
            if (Slotlimit == 10 && i == 0)   
                    System.out.printf("%d.) %s\n", i+1, slotRecord.get(i).getName());
            else
            System.out.printf("%d.) %-17s%6d%15s%.2f\n", i+1, slotRecord.get(i).getName(), amtsold, "P",amtsold * slotRecord.get(i).getPrice() );
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("Total Earnings (since last restocking):%3s%.2f\n", " P", totalEarnings);
        if (Slotlimit ==10)
            System.out.printf("Please note that Custom pizza earnings includes total earnings from items 11-15\n");
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

    public void clearBalance(){
        this.balance = 0;
    }

    /**
     * Records the stock to a hashmap
     */
    public void recordStock()
    {
        for (int i=0; i < slotList.size(); i++) {
        stockRecordMap.put(slotRecord.get(i).getName(), slotList.get(i).size());
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
    public void addItem(int index, String name, double price, double calories, int stock)
    {
        Item toAdd = new Item(name, price,calories); 
        slotRecord.put(index, toAdd);
        stockRecordMap.put(toAdd.getName(), index);
        for (int i = 0; i < stock; i++)
        {
            slotList.get(index).add(toAdd);
        }

    }

    /**
     * Loops through the ArrayList to find the first empty slot it can find
     * @return the index of the empty slot
     */
    public int checkEmpty()
    {
        int emptyIndex = -1;
        for (int i = 0; i < Slotlimit && emptyIndex == -1; i++)
        {
            if (slotList.get(i).size() == 0 )
                emptyIndex = i;
        }
        return emptyIndex;
    }
}
