package order;

//현금 결제 시 거스름돈 계산해주는 class
public class CashManager {
//멤버 필드 없음

//오퍼레이션
    //거스름돈 계산해 반환하는 함수
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
