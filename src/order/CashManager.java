package order;

public class CashManager {


    public int CalculateChange (int inputCash, int bill) {
        int change = inputCash - bill;

        if(change < 0) {
            return -1;
        }

        else if (change == 0) {
            return 0;
        }

        else return change;
    }
}
