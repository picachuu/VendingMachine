import java.util.ArrayList;

public class SpecialVM extends RegularVM {



    public SpecialVM(){
        super.Slotlimit = 10;
        

    }
    @Override
    public void StartSlots(){
        Item itemOne = new Pizza("Custom Pizza", 0, 0);
        Item itemTwo = new Item("Pepperoni", 53, 136);
        Item itemThree = new Item("Ham", 69, 40);
        Item itemFour = new Item("Sausage", 55, 210);
        Item itemFive = new Item("BBQ Chicken", 55, 215);
        Item itemSix = new Item("Mozarella", 40, 85);
        Item itemSeven = new Item("Parmesan", 50, 42);
        Item itemEight = new Item("Jalapenos", 45, 12.3);
        Item itemNine = new Item("Mushroom", 43, 10.2);
        Item itemTen = new Item("Olives", 37, 13.2);
        // Items not shown in the menu (Only sold with Pizza)
        Item itemEleven = new Item( "Tomato Sauce", 20, 30);
        Item itemTwelve = new Item("Cheese Sauce", 20, 50);
        Item itemThirteen = new Item("Cream Sauce", 20, 55);
        Item itemFourteen = new Item("Pesto Sauce", 20, 20);
        Item itemFifteen = new Item("Dough", 100, 200);
        slotRecord.put(0,itemOne);
        slotRecord.put(1,itemTwo);
        slotRecord.put(2,itemThree);
        slotRecord.put(3,itemFour);
        slotRecord.put(4,itemFive);
        slotRecord.put(5,itemSix);
        slotRecord.put(6,itemSeven);
        slotRecord.put(7,itemEight);
        slotRecord.put(8,itemNine);
        slotRecord.put(9,itemTen);

        slotRecord.put(10,itemEleven);
        slotRecord.put(11,itemTwelve);
        slotRecord.put(12,itemThirteen);
        slotRecord.put(13,itemFourteen);
        slotRecord.put(14,itemFifteen);

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                if (slotList.size() <= i) {
                    slotList.add(new ArrayList<Item>());
                }
                slotList.get(i).add(slotRecord.get(i));
            }
        }
    }
    /* public void displayVendingFeaturesMenu(){
        System.out.println("\n-------Vending Features-------");
        System.out.println("[1] Insert Payment");
        System.out.println("[2] Order Item");
        System.out.println("[3] Order Custom Item");
        System.out.println("[4] Receive Change");
        System.out.println("[5] Return to Test Menu");
    } */
    @Override
    public void displayItems(){

        System.out.printf("%26s", "Items\n");
        System.out.println("-----------------------------------------------");
        System.out.printf("%10s%19s%18s", "Name", "Price", "Calories\n");
        System.out.println("-----------------------------------------------");
        
        for (int i = 0; i < Slotlimit; i++)
        {
            
            if (slotList.get(i).size() > 0)

                if(i < 10)
                    if(i ==0)
                    System.out.printf("%d.) %s\n", i+1, slotRecord.get(i).getName());
                    else
                    System.out.printf("%d.) %-17s%8.2f%s%12.1fkcal\n", i+1, slotRecord.get(i).getName(), slotRecord.get(i).getPrice(), "P", slotRecord.get(i).getCalories());
                else
                    System.out.printf("%d.) %-17s%5.2f%s%11.1fkcal\n", i+1, slotRecord.get(i).getName(), slotRecord.get(i).getPrice(), "P", slotRecord.get(i).getCalories());
            else
                System.out.printf("%d.) %-24sNOT AVAILABLE\n", i+1, slotRecord.get(i).getName());
                
        }
    }

   /*  @Override
    public void recordStock()
    {
        for (int i=1; i < 15; i++) {
        stockRecordMap.put(slotRecord.get(i).getName(), slotList.get(i).size());
        }
    } */
}
