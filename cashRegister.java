import java.util.ArrayList;
import java.util.List;

/**
 * Javadoc documentation by Niccolo G Jimenez and Jannica S Lim
 * The class instantiates a cash register meant to be in a vending machine.
 * It holds different denominations of money.
 */
public class cashRegister {
    List<List<Money>> Denom = new ArrayList<List<Money>>();

    //Instantiates different denominations of money
        Money moneyOne = new Money(1);
        Money moneyFive = new Money(5);
        Money moneyTen = new Money(10);
        Money moneyTwenty = new Money(20);
        Money moneyFifty = new Money(50);
        Money moneyHundred = new Money(100);
        Money moneyTwoHundred = new Money(200);
        Money moneyFiveHundred = new Money(500);

    public cashRegister(int start){
        //Instantiates stock of different denominations of money
        ArrayList<Money> oneStock = new ArrayList<>();
        ArrayList<Money> fiveStock = new ArrayList<>();
        ArrayList<Money> tenStock = new ArrayList<>();
        ArrayList<Money> twentyStock = new ArrayList<>();
        ArrayList<Money> fiftyStock = new ArrayList<>();
        ArrayList<Money> hundredStock = new ArrayList<>();
        ArrayList<Money> twoHundredStock = new ArrayList<>();
        ArrayList<Money> fiveHundredStock = new ArrayList<>();

        //Adds 10 of each denomination of money to their respective stock
        for(int i = 0; i < start; i++)  {
            oneStock.add(moneyOne);
            fiveStock.add(moneyFive);
            tenStock.add(moneyTen);
            twentyStock.add(moneyTwenty);
            fiftyStock.add(moneyFifty);
            hundredStock.add(moneyHundred);
            twoHundredStock.add(moneyTwoHundred);
            fiveHundredStock.add(moneyFiveHundred);
        }

        //Stores different denominations of money in an arraylist
        Denom.add(oneStock);
        Denom.add(fiveStock);
        Denom.add(tenStock);
        Denom.add(twentyStock);
        Denom.add(fiftyStock);
        Denom.add(hundredStock);
        Denom.add(twoHundredStock);
        Denom.add(fiveHundredStock);    
    }

    /**
     * Gets the index of a specific denomination
     * 
     * @param denomination money denomination inputted
     * @return index of money denomination
     */
    public int getIndex(int denomination){
        int index = -1;

        switch(denomination){
            case 1:
                index = 0;
                break;
            case 5:
                index = 1;
                break;
            case 10:
                index = 2;
                break;
            case 20:
                index = 3;
                break;
            case 50:
                index = 4;
                break;
            case 100:   
                index = 5;
                break;
            case 200:
                index = 6;
                break;
            case 500:
                index = 7;
                break;
        }

        return index;
    }

    /**
     * Gets the money object of a specific denomination
     * 
     * @param denomination money denomination inputted
     * @return money object of denomination
     */
    public Money getMoney(int denomination){
        Money selectMoney = null;

        switch(denomination){
            case 1:
                selectMoney = moneyOne;
                break;
            case 5:
                selectMoney = moneyFive;
                break;
            case 10:
                selectMoney = moneyTen;
                break;
            case 20:
                selectMoney = moneyTwenty;
                break;
            case 50:
                selectMoney = moneyFifty;
                break;
            case 100:   
                selectMoney = moneyHundred;
                break;
            case 200:
                selectMoney = moneyTwoHundred;
                break;
            case 500:
                selectMoney = moneyFiveHundred;
                break;
        }

        return selectMoney;
    }

    /**
     * Adds money to the stock of the inputted denomination
     * @param denomination selected denomination to add to
     * @param amount amount of denominations to add
     */
    public void addMoney(int denomination, int amount){ 
        for(int i = 0; i < amount; i++)
            Denom.get(getIndex(denomination)).add(getMoney(denomination));
    }

    /**
     * Removes money from the stock of the inputted denomination
     * @param denomination selected denomination to remove from
     * @param amount amount of denominations to remove
     */
    public void removeMoney(int denomination, int amount){
        for(int i = 0; i < amount; i++)
            Denom.get(getIndex(denomination)).remove(0);
    }

    /**
     * Checks if the machine has enough money denominations to dispense inputted amount
     * @param money value of money to check
     * @return true if machine has enough money, false if not
     */
    public boolean checkAvail(double money){
        boolean verdict = false;
        int amt = (int)money / 500;

        if(Denom.get(7).size() >= amt || amt == 0){
            amt = (int)money % 500 / 100;
            if(Denom.get(5).size() >= amt || amt == 0){
                amt = (int)money % 500 % 100 / 50;
                if(Denom.get(4).size() >= amt || amt == 0){
                    amt = (int)money % 500 % 100 % 50 / 20;
                    if(Denom.get(3).size() >= amt || amt == 0){
                        amt = (int)money % 500 % 100 % 50 % 20 / 10;
                        if(Denom.get(2).size() >= amt || amt == 0){
                            amt = (int)money % 500 % 100 % 50 % 20 % 10 / 5;
                            if(Denom.get(1).size() >= amt || amt == 0){
                                amt = (int)money % 500 % 100 % 50 % 20 % 10 % 5;
                                if(Denom.get(0).size() >= amt || amt == 0)
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
     * Dispenses money from the machine
     * @param money value of money to dispense
     * @return string of machine messages dispensing money
     */
    public String dispenseMoney(double money){
        String msg = "";
        String fiveh = "", twoh = "", oneh = "", 
               fifty = "", twenty = "", ten = "", five = "", one = "";
        int amt = (int) money;
        int left =(int) money;
        
        amt = (int) money / 500;
        if(amt <= Denom.get(7).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(7).remove(0);
                left -= 500;
            }
            if (amt > 1)
                fiveh = String.format("Dispensing %d P500 bills...\n", amt);
            else if (amt == 1)
                fiveh = String.format("Dispensing %d P500 bill...\n", amt);
        }

        amt = left / 200;
        if(amt <= Denom.get(6).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(6).remove(0);
                left -= 200;
            }
            if (amt > 1)
                twoh = String.format("Dispensing %d P200 bills...\n", amt);
            else if (amt == 1)
                twoh = String.format("Dispensing %d P200 bill...\n", amt);
        }

        amt = left / 100;
        if(amt <= Denom.get(5).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(5).remove(0);
                left -= 100;
            }
            if (amt > 1)
                oneh = String.format("Dispensing %d P100 bills...\n", amt);
            else if (amt == 1)
                oneh = String.format("Dispensing %d P100 bill...\n", amt);
        }

        amt = left / 50;
        if(amt <= Denom.get(4).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(4).remove(0);
                left -= 50;
            }
            if (amt > 1)
                fifty = String.format("Dispensing %d P50 bills...\n", amt);
            else if (amt == 1)
                fifty = String.format("Dispensing %d P50 bill...\n", amt);
        }

        amt = left / 20;
        if(amt <= Denom.get(3).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(3).remove(0);
                left -= 20;
            }
            if (amt > 1)
                twenty = String.format("Dispensing %d P20 bills...\n", amt);
            else if (amt == 1)
                twenty = String.format("Dispensing %d P20 bill...\n", amt);
        }

        amt = left / 10;
        if(amt <= Denom.get(2).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(2).remove(0);
                left -= 10;
            }
            if (amt > 1)
                ten = String.format("Dispensing %d P10 coins...\n", amt);
            else if (amt == 1)
                ten = String.format("Dispensing %d P10 coin...\n", amt);
        }

        amt = left / 5;
        if(amt <= Denom.get(1).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(1).remove(0);
                left -= 5;
            }
            if (amt > 1)
               five = String.format("Dispensing %d P5 coins...\n", amt);
            else if (amt == 1)
                five = String.format("Dispensing %d P5 coin...\n", amt);
        }

        amt = left;
        if(amt <= Denom.get(0).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(0).remove(0);
                left -= 1;
            }
            if (amt > 1)
                one = String.format("Dispensing %d P1 coins...\n", amt);
            else if (amt == 1)
                one = String.format("Dispensing %d P1 coin...\n", amt);
        }

        msg = fiveh + twoh + oneh + fifty + twenty + ten + five + one + "\nPlease collect, thank you!\n\n\n";

        return msg;
    }

    /**
     * Returns the number of one peso coins in the machine
     * @return number of one peso coins in the machine
     */
    public int getOne(){
        return Denom.get(0).size();
    }

    /**
     * Returns the number of five peso coins in the machine
     * @return number of five peso coins in the machine
     */
    public int getFive(){
        return Denom.get(1).size();
    }

    /**
     * Returns the number of ten peso coins in the machine
     * @return number of ten peso coins in the machine
     */
    public int getTen(){
        return Denom.get(2).size();
    }

    /**
     * Returns the number of twenty peso bills in the machine
     * @return number of twenty peso bills in the machine
     */
    public int getTwenty(){
        return Denom.get(3).size();
    }

    /**
     * Returns the number of fifty peso bills in the machine
     * @return number of fifty peso bills in the machine
     */
    public int getFifty(){
        return Denom.get(4).size();
    }

    /**
     * Returns the number of one hundred peso bills in the machine
     * @return number of one hundred peso bills in the machine
     */
    public int getHundred(){
        return Denom.get(5).size();
    }

    /**
     * Returns the number of two hundred peso bills in the machine
     * @return number of two hundred peso bills in the machine
     */
    public int getTwoHundred(){
        return Denom.get(6).size();
    }

    /**
     * Returns the number of five hundred peso bills in the machine
     * @return number of five hundred peso bills in the machine
     */
    public int getFiveHundred(){
        return Denom.get(7).size();
    }

    /**
     * Returns the total amount of money in the machine
     * @return total amount of money in the machine
     */
    public double getTotal(){
        double total = 0;
        total += Denom.get(0).size();
        total += Denom.get(1).size() * 5;
        total += Denom.get(2).size() * 10;
        total += Denom.get(3).size() * 20;
        total += Denom.get(4).size() * 50;
        total += Denom.get(5).size() * 100;
        total += Denom.get(6).size() * 200;
        total += Denom.get(7).size() * 500;
        return total;
    }

    /**
     * Removes all stocks of money in machine
     */
    public void flush(){
        Denom.get(0).clear();
        Denom.get(1).clear();
        Denom.get(2).clear();
        Denom.get(3).clear();
        Denom.get(4).clear();
        Denom.get(5).clear();
        Denom.get(6).clear();
        Denom.get(7).clear();
    }

    /**
     * Displays messages of dispensing all money in the machine
     * @return string messages of dispensing all money in the machine
     */
    public String dispenseAll() {
        String msg = "";

        if(Denom.get(7).size() > 0)
            msg += String.format("Dispensing %d P500 bill/s...\n", Denom.get(7).size());
        if(Denom.get(6).size() > 0)
            msg += String.format("Dispensing %d P200 bill/s...\n", Denom.get(6).size());
        if(Denom.get(5).size() > 0)
            msg += String.format("Dispensing %d P100 bill/s...\n", Denom.get(5).size());
        if(Denom.get(4).size() > 0)
            msg += String.format("Dispensing %d P50 bill/s...\n", Denom.get(4).size());
        if(Denom.get(3).size() > 0)
            msg += String.format("Dispensing %d P20 bill/s...\n", Denom.get(3).size());
        if(Denom.get(2).size() > 0)
            msg += String.format("Dispensing %d P10 coin/s...\n", Denom.get(2).size());
        if(Denom.get(1).size() > 0)
            msg += String.format("Dispensing %d P5 coin/s...\n", Denom.get(1).size());
        if(Denom.get(0).size() > 0)
            msg += String.format("Dispensing %d P1 coin/s...\n", Denom.get(0).size());
        msg += String.format("\nPlease collect, thank you!\n\n");
        flush();

        return msg;
    }
}
