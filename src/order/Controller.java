package order;

public class Controller {
//멤버 필드
    private int bill;  //주문 금액
    private boolean isPayCard;  //카드 결제 여부
    private CashManager cashManager = new CashManager();  //현금 결제 시 거스름돈 계산 기능 수행하는 객체 cashManager.


//오퍼레이션
    public boolean getIsPayCard() {
        return isPayCard;
    }

    public void setIsPayCard(boolean payCard) {
        this.isPayCard = payCard;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    //거스름돈 계산하는 cashManager 객체의 함수의 반환값(거스름돈) 반환.
    public int changeVal(int inputCash) {
        return cashManager.CalculateChange(inputCash, this.bill);
    }
}
