import java.util.ArrayList;

public class RegularVM {
    private ArrayList<Item> slot;

    public RegularVM(){
        Item Pepperoni = new Item("Pepperoni", 69, 136, 10);
        Item Ham = new Item("Ham", 69, 100, 10);
        Item Sausage = new Item("Sausage", 69, 210, 10);
        Item BBQ = new Item("BBQ Chicken", 69, 215, 10);
        Item Mozarella = new Item("Mozarella", 69, 85, 10);
        Item Parmesan = new Item("Parmesan", 69, 42, 10);
        Item Jalapenos = new Item("Jalapenos", 69, 12.3, 10);
        Item Mushroom = new Item("Mushroom", 69, 10.2, 10);
        Item Olives = new Item("Olives", 69, 13.2, 10);
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
        System.out.printf("%21s", "Items\n");
        System.out.println("-------------------------------------");
        System.out.printf("%10s%22s", "Name", "Price\n");
        System.out.println("-------------------------------------");
        for (int i = 0; i < slot.size(); i++)
        {
            System.out.printf("%d.) %-17s%10.2fP\n", i+1, slot.get(i).getName(), slot.get(i).getPrice());
        }
    }


    
}
