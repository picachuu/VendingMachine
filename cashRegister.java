import java.util.ArrayList;
import java.util.List;

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

    //Adds money to the stock of the inputted denomination
    public void addMoney(int denomination, int amount){ 
        for(int i = 0; i < amount; i++)
            Denom.get(getIndex(denomination)).add(getMoney(denomination));
    }

    //Removes money from the stock of the inputted denomination
    public void removeMoney(int denomination, int amount){
        for(int i = 0; i < amount; i++)
            Denom.get(getIndex(denomination)).remove(0);
    }

    //Checks if the machine has enough money denominations to dispense inputted amount
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

    //Dispenses money from the machine
    public void dispenseMoney(double money){
        int amt = (int) money;
        int left =(int) money;
        
        amt = (int) money / 500;
        if(amt <= Denom.get(7).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(7).remove(0);
                left -= 500;
            }
            if (amt > 0)
                System.out.printf("Dispensing %d P500 bill/s...\n", amt);
        }

        amt = left / 200;
        if(amt <= Denom.get(6).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(6).remove(0);
                left -= 200;
            }
            if (amt > 0)
                System.out.printf("Dispensing %d P200 bill/s...\n", amt);
        }

        amt = left / 100;
        if(amt <= Denom.get(5).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(5).remove(0);
                left -= 100;
            }
            if (amt > 0)
                System.out.printf("Dispensing %d P100 bill/s...\n", amt);
        }

        amt = left / 50;
        if(amt <= Denom.get(4).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(4).remove(0);
                left -= 50;
            }
            if (amt > 0)
                System.out.printf("Dispensing %d P50 bill/s...\n", amt);
        }

        amt = left / 20;
        if(amt <= Denom.get(3).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(3).remove(0);
                left -= 20;
            }
            if (amt > 0)
                System.out.printf("Dispensing %d P20 bill/s...\n", amt);
        }

        amt = left / 10;
        if(amt <= Denom.get(2).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(2).remove(0);
                left -= 10;
            }
            if (amt > 0)
                System.out.printf("Dispensing %d P10 coin/s...\n", amt);
        }

        amt = left / 5;
        if(amt <= Denom.get(1).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(1).remove(0);
                left -= 5;
            }
            if (amt > 0)
                System.out.printf("Dispensing %d P5 coin/s...\n", amt);
        }

        amt = left;
        if(amt <= Denom.get(0).size()){
            for(int i = 0; i < amt; i++){
                Denom.get(0).remove(0);
                left -= 1;
            }
            if (amt > 0)
                System.out.printf("Dispensing %d P1 coin/s...\n", amt);
        }

        System.out.printf("\nPlease collect, thank you!\n\n");
        System.out.println();
    }

    public int getOne(){
        return Denom.get(0).size();
    }

    public int getFive(){
        return Denom.get(1).size();
    }

    public int getTen(){
        return Denom.get(2).size();
    }

    public int getTwenty(){
        return Denom.get(3).size();
    }

    public int getFifty(){
        return Denom.get(4).size();
    }

    public int getHundred(){
        return Denom.get(5).size();
    }

    public int getTwoHundred(){
        return Denom.get(6).size();
    }

    public int getFiveHundred(){
        return Denom.get(7).size();
    }

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

    public void dispenseAll(){
        System.out.printf("Dispensing %d P500 bill/s...\n", Denom.get(7).size());
        System.out.printf("Dispensing %d P200 bill/s...\n", Denom.get(6).size());
        System.out.printf("Dispensing %d P100 bill/s...\n", Denom.get(5).size());
        System.out.printf("Dispensing %d P50 bill/s...\n", Denom.get(4).size());
        System.out.printf("Dispensing %d P20 bill/s...\n", Denom.get(3).size());
        System.out.printf("Dispensing %d P10 coin/s...\n", Denom.get(2).size());
        System.out.printf("Dispensing %d P5 coin/s...\n", Denom.get(1).size());
        System.out.printf("Dispensing %d P1 coin/s...\n", Denom.get(0).size());
        System.out.printf("\nPlease collect, thank you!\n\n");
        flush();
    }
}
