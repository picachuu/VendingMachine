/**
 * Money represents the money held within the vending machine holding a certain denomination value.
 */
public class Money {
    private int value;

    /**
     * A constructor that creates money with each denomination initialized at a stock of 4.
     */
    public Money(int value){
        this.value = value;
    }

    /**
     * A method that returns the value of the money.
     * @return the value of the money.
     */
    public int getValue(){
        return value;
    }
}