public class Money {
    private int one, five, ten; //coins
    private int twenty, fifty, oneHundred, fiveHundred; //bills

    public Money(){
        one = 4;
        five = 4;
        ten = 4;
        twenty = 4;
        fifty = 4;
        oneHundred = 4;
        fiveHundred = 4;
    }

    public int getOne() {
        return one;
    }

    public void addOne(int add) {
        this.one += add;
    }

    public int getFive() {
        return five;
    }

    public void addFive(int add) {
        this.five += add;
    }

    public int getTen() {
        return ten;
    }

    public void addTen(int add) {
        this.ten += add;
    }

    public int getTwenty() {
        return twenty;
    }

    public void addTwenty(int add) {
        this.twenty += add;
    }

    public int getFifty() {
        return fifty;
    }

    public void addFifty(int add) {
        this.fifty += add;
    }

    public int getOneHundred() {
        return oneHundred;
    }

    public void addOneHundred(int add) {
        this.oneHundred += add;
    }

    public int getFiveHundred() {
        return fiveHundred;
    }

    public void addFiveHundred(int add) {
        this.fiveHundred += add;
    }

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

    public void subtract(double sub) {
        int amt = (int)sub;
        this.fiveHundred -= amt / 500;
        this.oneHundred -= amt % 500 / 100;
        this.fifty -= amt % 500 % 100 / 50;
        this.twenty -= amt % 500 % 100 % 50 / 20;
        this.ten -= amt % 500 % 100 % 50 % 20 / 10;
        this.five -= amt % 500 % 100 % 50 % 20 % 10 / 5;
        this.one -= amt % 500 % 100 % 50 % 20 % 10 % 5;
    }
    
    public void dispense(double balance){
        int amt = (int)balance;
        if(amt / 500 != 0)
            System.out.printf("Dispensing %d P500 bills...\n", amt / 500);
        if(amt % 500 / 100 != 0)
            System.out.printf("Dispensing %d P100 bills...\n", amt % 500 / 100);
        if(amt % 500 % 100 / 50 != 0)
            System.out.printf("Dispensing %d P50 bills...\n", amt % 500 % 100 / 50);
        if(amt % 500 % 100 % 50 / 20 != 0)
            System.out.printf("Dispensing %d P20 bills...\n", amt % 500 % 100 % 50 / 20);
        if(amt % 500 % 100 % 50 % 20 / 10 != 0)
            System.out.printf("Dispensing %d P10 bills...\n", amt % 500 % 100 % 50 % 20 / 10);
        if(amt % 500 % 100 % 50 % 20 % 10 / 5 != 0)
            System.out.printf("Dispensing %d P5 bills...\n", amt % 500 % 100 % 50 % 20 % 10 / 5);
        if(amt % 500 % 100 % 50 % 20 % 10 % 5 != 0)
            System.out.printf("Dispensing %d P1 bills...\n", amt % 500 % 100 % 50 % 20 % 10 % 5);
        System.out.printf("\nPlease collect, thank you!\n\n");
        subtract(balance);
    }

    public double getTotal() {
        return 1 * one + 5 * five + 10 * ten + 20 * twenty + 50 * fifty + 100 * oneHundred + 500 *fiveHundred;
    }

    public void flush(){
        this.fiveHundred = 0;
        this.oneHundred  = 0;
        this.fifty = 0;
        this.twenty = 0;
        this.ten = 0;
        this.five = 0;
        this.one  = 0;
    }

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
