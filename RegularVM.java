import java.util.ArrayList;

public class RegularVM {
    private ArrayList<Item> slot;

    public RegularVM(){
        
        Item peper = new Item("boop", 432, 34,65);
        Item yaur = new Item("yaur",23,213,323);
        slot = new ArrayList<>();
        slot.add(peper);
        slot.add(yaur);
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
