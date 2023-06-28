import java.util.ArrayList;
import java.util.Scanner;

public class RegularVM {
    private ArrayList<Item> slot;
    private double totalIncome;
    
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

    public void orderItem() {

    }


}
