import java.util.*;
/**
 * Javadoc documentation by Niccolo G Jimenez and Jannica S Lim
 * The class is a blueprint to create an object, the class "Pizza" creates a Pizza Object for a vending machine 
 * The class "Pizza" has 4 attributes: name, calories, price, stock;
 * 
 */
public class Pizza extends Item {    
    protected ArrayList<Item> ingredients;
    
    /**
     * A constructor that creates a Pizza object.
     */
    public Pizza() {
        super("Pizza", 0, 0, 3);
        ingredients = new ArrayList<Item>();
    }
    /**
     * This method is used to add an ingredient to the pizza
     * @param item takes in an item to be added
     */
    public void addIngredient(Item item) {
        ingredients.add(item);

    }
    /**
     * This method is used to remove an ingredient
     * @param item takes in an iem to be removed
     */
    public void removeIngredient(Item item) {
        ingredients.remove(item);
    }

    /**
     * This method  is used to display the ingredients of the pizza
     * @param slot
     */
    public void displayIngredients(int slot){
        for (Item item : ingredients) {
            if (item == ingredients.get(ingredients.size()-1))
                System.out.println(", and" +item.getName());
            else
            System.out.println(item.getName() + ",");
        }
        }
    /**
     * This method is used to get the ingredients of the pizza
     * @return an arraylist of items
     */
    public ArrayList<Item> getIngredients() {
        return this.ingredients;
    }
    /**
     * This method is used to get the total calories of the pizza
     */
    public void TotalCalories() {
        double totalCalories = 0;
            for (Item item : ingredients) {
                totalCalories += item.getCalories();
        }
        super.calories = totalCalories;
    }
    /**
     * This method is used to get the total price of the pizza
     */
    public void TotalPrice() {
        double totalPrice = 0;
            for (Item item : ingredients) {
                totalPrice += item.getPrice();
            }
        super.price = totalPrice;
    }
}
