import java.util.*;

public class Pizza extends Item {    
    protected List<List<Item>> ingredients = new ArrayList<List<Item>>();
    
    public Pizza(String name, double price, double calories) {
        super(name, price, calories);
    }

    public void addIngredient(int slot, Item item) {
        ingredients.get(slot).add(item);
    }
    public void removeIngredient(int slot, Item item) {
        ingredients.get(slot).remove(item);
    }

    public void displayIngredients(int slot){
        for (Item item : ingredients.get(slot)) {
            if (item == ingredients.get(slot).get(ingredients.get(slot).size()-1))
                System.out.println(", and" +item.getName());
            else
            System.out.println(item.getName() + ",");
        }
    }

    public List<List<Item>> getIngredients() {
        return ingredients;
    }

    public void TotalCalories() {
        double totalCalories = 0;
        for (List<Item> slot : ingredients) {
            for (Item item : slot) {
                totalCalories += item.getCalories();
            }
        }
        super.calories = totalCalories;
    }

    public void TotalPrice() {
        double totalPrice = 0;
        for (List<Item> slot : ingredients) {
            for (Item item : slot) {
                totalPrice += item.getPrice();
            }
        }
        super.price = totalPrice;
    }
}
