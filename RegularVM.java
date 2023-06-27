import java.util.ArrayList;

public class RegularVM {
    private ArrayList<Item> slot;

    public RegularVM(){
        slot = new ArrayList<>();
    }

    public void displayItems(){
        System.out.printf("%21s", "Items\n");
        System.out.println("-------------------------------------");
        System.out.printf("%10s%22s", "Name", "Price\n");
        System.out.println("-------------------------------------");
        for (int i = 1; i < slot.size(); i++)
        {
            String name = slot.get(i).getName();
            //System.out.println(Item.getName());
            System.out.printf("%d.) %-17s%10f₱", i, slot.get(i).getName(), slot.get(i).getPrice());
        }


    }


    
}
