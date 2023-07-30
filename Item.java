/**
 * Javadoc documentation by Niccolo G. Jimenez and Jannica S. Lim
 * The class is a blueprint to create an object, the class "Item" creates an object for a vending machine item
 * The class "Item" has 4 attributes: name, calories, price, stock;
 */
public class Item {
    protected String name;
    protected double calories, price;
    
    /**
     * This method is the constructor that requests for the following
     * @param name name of the item
     * @param price price of the item
     * @param calories calories of the item
     * @param stock stock of the item
     */
    public Item(String name, double price, double calories)
    {
        this.name = name;
        this.price = price;
        this.calories = calories;

    }
    /**
     * This method is the construtor that will request for the following
     * @param name name of the item
     * @param calories calories of the item
     * @param stock stock of the item
     */
    public Item(String name, double calories)
    {
        this.name = name;
        this.calories = calories;
    }
    /**
     * This method changes the price of the item given the following
     * @param newPrice the new price of the item
     */
    public void changePrice(double newPrice)
    {
        this.price = newPrice;
    }

    /**
     * This item removes stock from the item
     * @param removefromStock amount of stock to be removed
     * @return boolean value if stock was removed successfully
     */

    /**
     * This method gets the name of the item
     * @return String containing the name of the item
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * This method gets the calories of the item
     * @return Double containing the calories of the item
     */
    public double getCalories()
    {
        return this.calories;
    }
    /**
     * This method gets the price of the item
     * @return Double containing the price of the item
     */
    public double getPrice()
    {
        return this.price;
    }
    /**
     * This method gets the stock of the item
     * @return Integer containing the stock of the current item
     */
 
}
