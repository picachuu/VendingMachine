public class Money {
    private int one, five, ten; //coins
    private int twenty, fifty, oneHundred, fiveHundred; //bills

    public Money(){
        one = 0;
        five = 0;
        ten = 0;
        twenty = 0;
        fifty = 0;
        oneHundred = 0;
        fiveHundred = 0;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }

    public int getTwenty() {
        return twenty;
    }

    public void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public int getOneHundred() {
        return oneHundred;
    }

    public void setOneHundred(int oneHundred) {
        this.oneHundred = oneHundred;
    }

    public int getFiveHundred() {
        return fiveHundred;
    }

    public void setFiveHundred(int fiveHundred) {
        this.fiveHundred = fiveHundred;
    }

    public double getTotalBalance() {
        return 1 * one + 5 * five + 10 * ten + 20 * twenty + 50 * fifty + 100 * oneHundred + 500 *fiveHundred;
    }
}
