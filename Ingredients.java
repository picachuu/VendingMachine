public class Ingredients extends Item {
    int type;

    public Ingredients(String name, double price, double calories, int type) {
        super(name, price, calories);
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
