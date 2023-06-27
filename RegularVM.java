import java.util.ArrayList;

public class RegularVM {
    private ArrayList<Item> Slot;

    public RegularVM(){
        Slot = new ArrayList<>();
    }

    public void displayItems(){
        System.out.printf("%23s", "Items");
        System.out.println("-------------------------------------");
        System.out.printf("\n%10s%22s", "Name", "Price");
        System.out.println("-------------------------------------");
        for (int i = 1; i < Slot.size(); i++)
        {
            System.out.printf("%d.) %-17s%10f", i, Item.getName(), Item.getPrice());

        }


    }


    
}
