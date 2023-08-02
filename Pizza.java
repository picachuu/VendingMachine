import java.util.*;

public class Pizza extends Item {    
    protected ArrayList<Item> ingredients;
    
    
    public Pizza() {
        super("Pizza", 0, 0, 3);
        ingredients = new ArrayList<Item>();
    }

    public void addIngredient(Item item) {
        ingredients.add(item);

    }
    public void removeIngredient(Item item) {
        ingredients.remove(item);
    }

    public void displayIngredients(int slot){
        for (Item item : ingredients) {
            if (item == ingredients.get(ingredients.size()-1))
                System.out.println(", and" +item.getName());
            else
            System.out.println(item.getName() + ",");
        }
        }

    public ArrayList<Item> getIngredients() {
        return this.ingredients;
    }

    public void TotalCalories() {
        double totalCalories = 0;
            for (Item item : ingredients) {
                totalCalories += item.getCalories();
        }
        super.calories = totalCalories;
    }

    public void TotalPrice() {
        double totalPrice = 0;
            for (Item item : ingredients) {
                totalPrice += item.getPrice();
            }
        super.price = totalPrice;
    }
}
