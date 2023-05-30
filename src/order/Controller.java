package order;

public class Controller {
    private int bill;
    private boolean isPayCard;
    private CashManager cashManager = new CashManager();

    public boolean getIsPayCard() {
        return isPayCard;
    }

    public void setIsPayCard(boolean payCard) {
        this.isPayCard = payCard;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int controlCash(int inputCash) {
        return cashManager.CalculateChange(inputCash, this.bill);
    }
}
