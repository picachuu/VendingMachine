import java.util.ArrayList;

public class Record {
    private ArrayList<Integer> StockList;
    private int TotalIncome;

    public Record() 
    {

    }

    public void addTotal(int amt)
    {
        this.TotalIncome += amt;
    }

    public int getTotalIncome()
    {
        return this.TotalIncome;
    }
}
