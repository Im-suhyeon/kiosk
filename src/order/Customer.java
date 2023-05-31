package order;

public class Customer {
//멤버 필드
    //이용자가 결제시 넣은 금액
    private int cashInput;

//오퍼레이션. getter와 setter
    public int getCashInput() {
        return cashInput;
    }
    public void setCashInput(int cashInput) {
        this.cashInput = cashInput;
    }
}
