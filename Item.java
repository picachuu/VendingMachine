public class Item {
    private String name;
    private double calories, price;
    private int stock;

    public Item(String name, double price, double calories, int stock)
    {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.stock = stock;
    }

    public Item(String name, double calories, int stock)
    {
        this.name = name;
        this.calories = calories;
        this.stock = stock;
    }

    public void changePrice(double newPrice)
    {
        this.price = newPrice;
    }

    public boolean addStock(int addtoStock)
    {
        boolean check = true;
        if (this.stock + addtoStock > 20)
            this.stock += addtoStock;
        else
            check = false;
        return check;
    }

    public void removeStock(int removefromStock)
    {
        this.stock -= removefromStock;
    }

    public String getName()
    {
        return this.name;
    }

    public double getCalories()
    {
        return this.calories;
    }

    public double getPrice()
    {
        return this.price;
    }
    
    public int getStock()
    {
        return this.stock;
    }
}
