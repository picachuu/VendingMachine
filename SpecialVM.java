import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SpecialVM extends RegularVM {
    Map<Integer, Item> extraItems = new LinkedHashMap<Integer, Item>();
    Map<String, Integer> FreqMap = new LinkedHashMap<String, Integer>();

    public SpecialVM(){
        super.Slotlimit = 10;
        

    }
    @Override
    public void StartSlots(){
        Pizza itemOne = new Pizza();
        Item itemTwo = new Item("Pepperoni", 53, 136, 1);
        Item itemThree = new Item("Bacon", 69, 40, 1);
        Item itemFour = new Item("Onions", 55, 210, 1);
        Item itemFive = new Item("Mozarella", 55, 215, 1);
        Item itemSix = new Item("Olives", 40, 85, 1);
        // Items not shown in the menu (Only sold with Pizza)
        Item itemSeven = new Item( "Tomato Sauce", 20, 30, 2);
        Item itemEight = new Item("Cheese Sauce", 20, 50, 2);
        Item itemNine = new Item("Pesto Sauce", 20, 20, 2);
        Item itemTen = new Item("Dough", 100, 200, 0);
        // Extra Items
        // Item itemEleven = new Item("Parmesan", 50, 42);
        // Item itemTwelve = new Item("Jalapenos", 45, 12.3);
        // Item itemThirteen = new Item("Mushroom", 43, 10.2);
        // Item itemFourteen = new Item("Olives", 37, 13.2);
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
        // Extra Items
        /* extraItems.put(0,itemEleven);
        extraItems.put(1,itemTwelve);
        extraItems.put(2,itemThirteen);
        extraItems.put(3,itemFourteen); */
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (slotList.size() <= i) {
                    slotList.add(new ArrayList<Item>());
                }
                slotList.get(i).add(slotRecord.get(i));
            }
        }

    }
    
    public void displayItems(int type, int key)
    {
        System.out.printf("%26s", "Items\n");
        System.out.println("-----------------------------------------------");
        System.out.printf("%10s%19s%18s", "Name", "Price", "Calories\n");
        System.out.println("-----------------------------------------------");
        
        for (int i = 0; i < 10; i++)
        {
             if (slotRecord.get(i).getType() == type)    
                {
                if (slotList.get(i).size() > 0)
                    {
                        System.out.printf("%d .) %-17s%8.2f%s%12.1fkcal\n", i+1, slotRecord.get(i).getName(), slotRecord.get(i).getPrice(), "P", slotRecord.get(i).getCalories()); 
                    }
                else 
                    System.out.printf("%d.) %-24sNOT AVAILABLE\n", i+1, slotRecord.get(i).getName()); 
                }
            else if (key == 1 && i == 0)
                    System.out.printf("%d.) %s\n", i+1, slotRecord.get(i).getName()); 
        }
    }
    
   public boolean addIngredient(Pizza custom, int index)
   {
    boolean flag = false;
       if (slotList.get(index).size() > 0)
       { 
           custom.addIngredient(slotRecord.get(index));
           //slotList.get(index).remove(0);
           flag = true;
       }
       else
       {
           System.out.println("\nSorry, we ran out of " + slotRecord.get(index).getName() + "\n");
       }
    return flag;
   }
  
    
    public void displayPrep(Pizza custom)
    {
        int counter = 0;
        System.out.println("Your Pizza is being prepared");
        System.out.println("Dough is being kneaded");
        for (int j =0 ; j < custom.getIngredients().size(); j++)
        {
            if (custom.getIngredients().get(j).getType() == 2)
            {
                System.out.println( custom.getIngredients().get(j).getName() + " is being spread\n");
            }
        }
        System.out.println("Toppings being added: ");
        for (int i = 0; i < custom.getIngredients().size(); i++)
        {
            if (custom.getIngredients().get(i).getType() == 1)
                count(custom.getIngredients().get(i));
        }
        for (Entry<String, Integer> entry : FreqMap.entrySet()) 
        {
            if (counter == 0)
            {
                System.out.printf(entry.getValue() + " " + entry.getKey());
                counter++;
            }
            else if (counter == FreqMap.size() - 1)
            {
                System.out.printf(" and " + entry.getValue() + " " + entry.getKey());
                counter++;
            }
            else
            {
                System.out.printf(" , " + entry.getValue() + " " + entry.getKey());
                counter++;
            }
        }
        System.out.println("\nPizza is being baked in the oven...\n");
        System.out.println("Pizza is ready to be served\n");

    }

    private void count(Item toInsert)
    {
        if (FreqMap.containsKey(toInsert.getName()))
            FreqMap.put(toInsert.getName(), FreqMap.get(toInsert.getName()) + 1);
        else
            FreqMap.put(toInsert.getName(), 1);
    }

    public void orderIngredient(double Price, ArrayList<Integer> Index)
    {
        if(cashRegister.checkAvail(balance - Price)){
            for (int i = 0; i < Index.size(); i++)
            {
                slotList.get(Index.get(i)).remove(0);
            }
            balance -= Price;
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
    
   
   /*  @Override
    public void recordStock()
    {
        for (int i=1; i < 15; i++) {
        stockRecordMap.put(slotRecord.get(i).getName(), slotList.get(i).size());
        }
    } */
}
