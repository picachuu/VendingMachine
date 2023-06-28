import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RegularVM {
    private ArrayList<Item> slot;
    private double totalIncome;
    private double balance; //customes money
    Map<String,Integer> stockRecordMap = new LinkedHashMap<String,Integer>();
    
    public RegularVM(){
        Item Pepperoni = new Item("Pepperoni", 53, 136, 10);
        Item Ham = new Item("Ham", 69, 40, 10);
        Item Sausage = new Item("Sausage", 55, 210, 10);
        Item BBQ = new Item("BBQ Chicken", 55, 215, 10);
        Item Mozarella = new Item("Mozarella", 40, 85, 10);
        Item Parmesan = new Item("Parmesan", 50, 42, 10);
        Item Jalapenos = new Item("Jalapenos", 45, 12.3, 10);
        Item Mushroom = new Item("Mushroom", 43, 10.2, 10);
        Item Olives = new Item("Olives", 37, 13.2, 0);
        slot = new ArrayList<>();
        slot.add(Pepperoni);
        slot.add(Ham);
        slot.add(Sausage);
        slot.add(BBQ);
        slot.add(Mozarella);
        slot.add(Parmesan);
        slot.add(Jalapenos);
        slot.add(Mushroom);
        slot.add(Olives);
    }

    //Vending Features
    public void insertPayment(){

    }

    public void displayItems(){
        System.out.printf("%27s", "Items\n");
        System.out.println("-----------------------------------------------");
        System.out.printf("%10s%22s%16s", "Name", "Price", "Calories\n");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < slot.size(); i++)
        {
            if (slot.get(i).getStock() > 0)
                System.out.printf("%d.) %-17s%6s%.2f%13.1f\n", i+1, slot.get(i).getName(), "P", slot.get(i).getPrice(), slot.get(i).getCalories());
            else
                System.out.printf("%d.) %-25sNOT AVAILABLE\n", i+1, slot.get(i).getName());
        }
    }

    public void orderItem(int selOrder) {
        //if available
        if(slot.get(selOrder).getStock() > 0)
            //if enough money
            if(balance >= slot.get(selOrder).getPrice()){
                System.out.print("\033[H\033[2J");
                System.out.println("\nDispensing " + slot.get(selOrder).getName() + "...");
                slot.get(selOrder).removeStock(1);
                balance -= slot.get(selOrder).getPrice();
                System.out.printf("Thank you for your purchase!\n\n", balance);
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
    
    public void receiveChange(){
        if(balance > 0){
            System.out.printf("\nYour change is P%.2f. Please collect, thank you!\n\n", balance);
            balance = 0;
        }
        else
            System.out.println("You have no change to receive.");
    }

    //Maintenance Features
    public void restockItem(){

    }

    public void setPrice(){
        Scanner sc = new Scanner(System.in);
        displayItems();
        System.out.println("Please enter item number: ");
        int index = sc.nextInt() - 1;
        System.out.println("Please enter new price: ");
        double newPrice = sc.nextDouble();
        slot.get(index).changePrice(newPrice);
        sc.close();
    }
    
    public void collectIncome()
    {
        totalIncome = 0;
    }

    public void replenishMoney(){

    }

    public void printSummary(){

    }

    public double getTotalIncome(){
        return this.totalIncome;
    }

    public double getBalance(){
        return this.balance;
    }

    public void recordStock()
    {
        for (int i=0; i<slot.size(); i++) {
        stockRecordMap.put(slot.get(i).getName(), slot.get(i).getStock());
    }
    }
}
