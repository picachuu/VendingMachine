/**
 * The class is a blueprint to create an object, the class "Item" creates an object for a vending machine item
 * The class "Item" has 4 attributes: name, calories, price, stock, and image;
 */
public class Item {
    protected String name;
    protected double calories, price;
    protected int type; // Type will categorize what type of item it is 0 = Dough, 1 = Toppings/Standalone, 2 = Ingredients
                        // 3 = Custom Pizza
    protected String image;


    public Item(String name, double price, double calories, int type, String image)
    {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.image = image;
        this.type = type;
    }

    public Item(String name, double price, double calories, int type)
    {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.type = type;
    }

    public Item(String name, double price, double calories, String image){
        this.name = name;
        this.price = price;
        this.image = image;
        this.calories = calories;
    }

    public Item(String name, double price, double calories){
        this.name = name;
        this.price = price;
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
     * This method gets the type of the item
     * @return Integer containing the type of the current item
     */
    public int getType()
    {
        return this.type;
    }

    /**
     * This method gets the file path for the image of the item
     * @return String containing the file path of the image of the item
     */
    public String getImage()
    {
        return this.image;
    }
}
