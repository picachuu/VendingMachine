import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class SpecialVM extends RegularVM {
    Map<String, Integer> FreqMap = new LinkedHashMap<String, Integer>();
    Pizza itemOne;

    public SpecialVM(){
        super.Slotlimit = 10;
        

    }
    @Override
    public void StartSlots(){
        itemOne = new Pizza();
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
        Item itemEleven = new Item("Egg", 50, 42);
        Item itemTwelve = new Item("Tomato", 45, 12.3);
        Item itemThirteen = new Item("Bell Peppers", 43, 10.2);
        Item itemFourteen = new Item("Basil", 37, 13.2);
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
        extraItems.put(0,itemEleven);
        extraItems.put(1,itemTwelve);
        extraItems.put(2,itemThirteen);
        extraItems.put(3,itemFourteen); 
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
        
        for (int i = 0; i < slotList.size(); i++)
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
    
    public void maintDisplayItems(int key){
        System.out.printf("%25s", "Items\n");
        System.out.println("--------------------------------------------");
        System.out.printf("%10s%19s%13s", "Name", "Price", "Stock\n");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < slotList.size(); i++)
        {
            if (i == 0)
                System.out.printf("%d.) %s\n", i+1, slotRecord.get(i).getName()); 
            else
                System.out.printf("%d.) %-17s%8.2f%s%10d\n", i+1, slotRecord.get(i).getName(),slotRecord.get(i).getPrice(), "P", slotList.get(i).size());
        }
        if (key == 1 )
        {
            System.out.println("--------------------------------------------");
            System.out.printf("%19s", "Extra Items\n");
            System.out.println("--------------------------------------------");
            System.out.printf("%10s%19s%13s", "Name", "Price", "Stock\n");
            for (int i = 0; i < extraItems.size(); i++)
                System.out.printf("%d.) %-17s%8.2f%s\n", i+1, extraItems.get(i).getName(),extraItems.get(i).getPrice(), "P");
        }
    }
    public void replaceItem(int toReplace, int replaceWith)
    {
        Item container = slotRecord.get(toReplace); 
        slotList.get(toReplace).clear();
        slotRecord.put(toReplace, extraItems.get(replaceWith));
        extraItems.put(replaceWith, container);
    }

    public boolean addIngredient(Pizza custom, int index)
    {
    boolean flag = false;
       if (slotList.get(index).size() > 0)
       { 
           custom.addIngredient(slotRecord.get(index));
           flag = true;
       }
       else
       {
           System.out.println("\nSorry, we ran out of " + slotRecord.get(index).getName() + "\n");
       }
    return flag;
    }
  

    public String displayPrep(Pizza custom)
    {
        String prep = "";
        int counter = 0;
        prep += "\nYour Pizza is \nbeing prepared.\n";
        prep += "\nDough is being kneaded...\n";
        for (int j =0 ; j < custom.getIngredients().size(); j++)
        {
            if (custom.getIngredients().get(j).getType() == 2)
            {
                prep += String.format(custom.getIngredients().get(j).getName() + " \nis being spread...\n");
            }
        }
        prep += String.format("Toppings being added: ");
        for (int i = 0; i < custom.getIngredients().size(); i++)
        {
            if (custom.getIngredients().get(i).getType() == 1)
                count(custom.getIngredients().get(i));
        }
        for (Entry<String, Integer> entry : FreqMap.entrySet()) 
        {
            if (counter == 0)
            {
                prep += "\n" + entry.getValue() + " " + entry.getKey();
                counter++;
            }
            else if (counter == FreqMap.size() - 1)
            {
                prep += " and " + "\n" + entry.getValue() + " " + entry.getKey();
                counter++;
            }
            else
            {
                prep += " , " + entry.getValue() + " " + entry.getKey();
                counter++;
            }
        }
        prep += "\n\nPizza is being baked \nin the oven...\n";
        prep += "\nPizza is ready to \nbe served!\nDispensing...\nEnjoy!\nPlease return to\nthe menu";

        return prep;
    }

    private void count(Item toInsert)
    {
        if (FreqMap.containsKey(toInsert.getName()))
            FreqMap.put(toInsert.getName(), FreqMap.get(toInsert.getName()) + 1);
        else
            FreqMap.put(toInsert.getName(), 1);
    }

    public String orderIngredient(double Price, ArrayList<Item> Index)
    {
        String msg = "";
        if(cashRegister.checkAvail(balance - Price)){
            for (int i = 0; i < Index.size(); i++)
            {
                slotList.remove(Index);
            }
            balance -= Price;
            msg += receiveChange();
        }
        else{
            msg += "\nSorry, this machine does not \nhave enough change \nto return.";   
            msg += "\nCancelling transaction..."; 
            msg += "\nReturning money...";   
            msg += receiveChange();                  
        }
        return msg;
    }

    public Pizza getPizza() {
        return this.itemOne;
    }


    
   /*  @Override
    public void recordStock()
    {
        for (int i=1; i < 15; i++) {
        stockRecordMap.put(slotRecord.get(i).getName(), slotList.get(i).size());
        }
    } */
}
