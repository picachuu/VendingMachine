/**
 * Javadoc documentation by Niccolo G. Jimenez & Jannica S. Lim
 * The class is a blueprint to create an object, the class "Item" creates an object for a vending machine item
 * The class "Item" has 4 attributes: name, calories, price, stock;
 */
public class Item {
    private String name;
    private double calories, price;
    private int stock;
    /**
     * This method is the constructor that requests for the following
     * @param name name of the item
     * @param price price of the item
     * @param calories calories of the item
     * @param stock stock of the item
     */
    public Item(String name, double price, double calories, int stock)
    {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.stock = stock;
    }
    /**
     * This method is the construtor that will request for the following
     * @param name name of the item
     * @param calories calories of the item
     * @param stock stock of the item
     */
    public Item(String name, double calories, int stock)
    {
        this.name = name;
        this.calories = calories;
        this.stock = stock;
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
     * This method adds stock of the current item
     * @param addtoStock amount of stock to be added
     * @return boolean value if stock was added successfully
     */
    public boolean addStock(int addtoStock)
    {
        boolean check = true;
        if (this.stock + addtoStock <= 20)
            this.stock += addtoStock;
        else
            check = false;
        return check;
    }
    /**
     * This item removes stock from the item
     * @param removefromStock amount of stock to be removed
     * @return boolean value if stock was removed successfully
     */
    public boolean removeStock(int removefromStock)
    {
         boolean check = true;
        if (this.stock - removefromStock > 0)
            this.stock -= removefromStock;
        else
            check = false;
        return check;
    }
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
    public int getStock()
    {
        return this.stock;
    }
}
