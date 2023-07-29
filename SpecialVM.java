public class SpecialVM extends RegularVM {
    public SpecialVM(){
        super();
    }

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
}
