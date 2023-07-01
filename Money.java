/**
 * Money represents the money held within the vending machine. It includes 
 * coin denominations of one, five, and ten and bill denominations of twenty,
 * fifty, one hundred, andfive hundred.
 */
public class Money {
    private int one, five, ten; //coins
    private int twenty, fifty, oneHundred, fiveHundred; //bills

    /**
     * A constructor that creates money with each denomination initialized at a stock of 4.
     */
    public Money(){
        one = 4;
        five = 4;
        ten = 4;
        twenty = 4;
        fifty = 4;
        oneHundred = 4;
        fiveHundred = 4;
    }

    /**
     * Returns the amount of one peso coins currently in the machine.
     * @return number of P1 coins 
     */
    public int getOne() {
        return one;
    }

    /**
     * Adds to the stock of one peso coins by inputted number.
     * @param add amount of P1 coins to be added
     */
    public void addOne(int add) {
        this.one += add;
    }

    /**
     * Returns the amount of five peso coins currently in the machine.
     * @return number of P5 coins 
     */
    public int getFive() {
        return five;
    }

    /**
     * Adds to the stock of five peso coins by inputted number.
     * @param add amount of P5 coins to be added
     */
    public void addFive(int add) {
        this.five += add;
    }

    /**
     * Returns the amount of ten peso coins currently in the machine.
     * @return number of P10 coins 
     */
    public int getTen() {
        return ten;
    }

    /**
     * Adds to the stock of ten peso coins by inputted number.
     * @param add amount of P10 coins to be added
     */
    public void addTen(int add) {
        this.ten += add;
    }

    /**
     * Returns the amount of twenty peso bills currently in the machine.
     * @return number of P20 bills 
     */
    public int getTwenty() {
        return twenty;
    }

    /**
     * Adds to the stock of twenty peso bills by inputted number.
     * @param add amount of P20 coins to be added
     */
    public void addTwenty(int add) {
        this.twenty += add;
    }

    /**
     * Returns the amount of fifty peso bills currently in the machine.
     * @return number of P50 bills 
     */
    public int getFifty() {
        return fifty;
    }

    /**
     * Adds to the stock of fifty peso bills by inputted number.
     * @param add amount of P50 coins to be added
     */
    public void addFifty(int add) {
        this.fifty += add;
    }

    /**
     * Returns the amount of one hundred peso bills currently in the machine.
     * @return number of P100 bills 
     */
    public int getOneHundred() {
        return oneHundred;
    }

    /**
     * Adds to the stock of one hundred peso bills by inputted number.
     * @param add amount of P100 coins to be added
     */
    public void addOneHundred(int add) {
        this.oneHundred += add;
    }

    /**
     * Returns the amount of five hundred peso bills currently in the machine.
     * @return number of bills coins 
     */
    public int getFiveHundred() {
        return fiveHundred;
    }

    /**
     * Adds to the stock of five hundred peso bills by inputted number.
     * @param add amount of P500 coins to be added
     */
    public void addFiveHundred(int add) {
        this.fiveHundred += add;
    }

    /**
     * Checks if the machine has enough money denominations to dispense inputted amount.
     * 
     * @param money amount to be dispensed by machine
     * @return true if machine has enough money denominations
     */
    public boolean checkAvail(double money){
        boolean verdict = false;
        int amt = (int)money / 500;

        if(this.fiveHundred >= amt || amt == 0){
            amt = (int)money % 500 / 100;
            if(this.oneHundred >= amt || amt == 0){
                amt = (int)money % 500 % 100 / 50;
                if(this.fifty >= amt || amt == 0){
                    amt = (int)money % 500 % 100 % 50 / 20;
                    if(this.twenty >= amt || amt == 0){
                        amt = (int)money % 500 % 100 % 50 % 20 / 10;
                        if(this.ten >= amt || amt == 0){
                            amt = (int)money % 500 % 100 % 50 % 20 % 10 / 5;
                            if(this.five >= amt || amt == 0){
                                amt = (int)money % 500 % 100 % 50 % 20 % 10 % 5;
                                if(this.one >= amt || amt == 0)
                                    verdict = true;
                            }
                        }
                    }
                }

            }

        }
        return verdict;
    }
    
    /**
     * Dispenses the money denominations of inputted amount.
     * 
     * @param balance amount to be dispensed
     */
    public void dispense(double balance){
        int amt = (int)balance;
        int left =(int) balance;

        amt = (int)balance / 500;
        if(amt <= this.fiveHundred){
            left -= amt * 500;
            if(amt != 0){
                System.out.printf("Dispensing %d P500 bill/s...\n", amt);
                this.fiveHundred -= amt;
            }
        }
        
        amt = left / 100;
        if(amt <= this.oneHundred){
            left -= amt * 100;
            if(amt != 0){
                System.out.printf("Dispensing %d P100 bill/s...\n", amt);
                this.oneHundred -= amt;
            }
        }

        amt = left / 50;
        if(amt <= this.fifty){
            left -= amt * 50;
            if(amt != 0){
                System.out.printf("Dispensing %d P50 bill/s...\n", amt);
                this.fifty -= amt;
            }
        }

        amt = left / 20;
        if(amt <= this.twenty){
            left -= amt * 20;
            if(amt != 0){
                System.out.printf("Dispensing %d P20 bill/s...\n", amt);
                this.twenty -= amt;
            }
        }

        amt = left / 10;
        if(amt <= this.fiveHundred){
            left -= amt * 10;
            if(amt != 0){
                System.out.printf("Dispensing %d P10 coin/s...\n", amt);
                this.ten -= amt;
            }
        }

        amt = left / 5;
        if(amt <= this.five){
            left -= amt * 5;
            if(amt != 0){
                System.out.printf("Dispensing %d P5 coin/s...\n", amt);
                this.five -= amt;
            }
        }

        amt = left;
        if(amt <= this.one){
            left -= amt;
            if(amt != 0){
                System.out.printf("Dispensing %d P1 coin/s...\n", amt);
                this.one -= amt;
            }
        }

        System.out.printf("\nPlease collect, thank you!\n\n");
        System.out.println();
    }

    /**
     * Returns the total amount of money in the machine.
     * @return total value of all denominations
     */
    public double getTotal() {
        return 1 * one + 5 * five + 10 * ten + 20 * twenty + 50 * fifty + 100 * oneHundred + 500 *fiveHundred;
    }

    /**
     * Removes all stock of all denominations.
     */
    public void flush(){
        this.fiveHundred = 0;
        this.oneHundred  = 0;
        this.fifty = 0;
        this.twenty = 0;
        this.ten = 0;
        this.five = 0;
        this.one  = 0;
    }

    /**
     * Dispenses all denominations currently in the machine.
     */
    public void dispenseAll(){
        System.out.printf("Dispensing %d P500 bills...\n", this.fiveHundred);
        System.out.printf("Dispensing %d P100 bills...\n", this.oneHundred);
        System.out.printf("Dispensing %d P50 bills...\n", this.fifty);
        System.out.printf("Dispensing %d P20 bills...\n", this.twenty);
        System.out.printf("Dispensing %d P10 bills...\n", this.ten);
        System.out.printf("Dispensing %d P5 bills...\n", this.five);
        System.out.printf("Dispensing %d P1 bills...\n", this.one);
        System.out.printf("\nPlease collect, thank you!\n\n");
        flush();
    }

}
