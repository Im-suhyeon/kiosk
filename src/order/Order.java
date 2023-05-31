package order;

public class Order {
//멤버 필드
    //결제 완료 여부
    private boolean orderCompleteState = false;

//오퍼레이션. getter와 setter.
    public boolean getOrderCompleteState() {
        return orderCompleteState;
    }

    public void setOrderCompleteState(boolean orderCompleteState) {
        this.orderCompleteState = orderCompleteState;
    }
}
