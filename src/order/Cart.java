package order;

import menu.Burger;
import menu.Drink;
import menu.Menu;

public class Cart {
//----멤버 필드----
    //순서대로 불고기버거, 새우버거, 데리버거, 콜라, 스프라이트, 아이스크림의 카트에 담긴 수량
    private int[] cartItemAmountList = {0, 0, 0, 0, 0, 0};
    //카트에 담은 항목들의 총 금액
    private int priceAmount = 0;
    //Menu객체를 담는 배열. 각 메뉴들이 들어감.
    private Menu[] m = {new Burger("불고기버거", 6000), new Burger("새우버거", 5000), new Burger("데리버거", 4000),
            new Drink("콜라", 1000), new Drink("스프라이트", 1500), new Drink("아이스크림", 500)};
    //카트 객체는 order 객체를 가짐으로써 주문 완료 상태를 설정할 수 있음
    private Order order = new Order();


//----오퍼레이션-----
    //Menu객체 담는 배열 m의 getter
    public Menu[] getM() { return m; }

    //cartAmountList 의 setter
    public void setCartAmountList(int idx, int amount) {
        this.cartItemAmountList[idx] += amount;
    }

    //카트에 담긴 항목들의 총 금액 priceAmount 계산해 할당해주는 함수
    public void calcPrice() {
        priceAmount = 0;
        for (int i = 0; i < 6; i++) {
            priceAmount += cartItemAmountList[i] * (m[i].getPrice());
        }
    }

    //priceAmount의 getter
    public int getPriceAmount() {
        calcPrice();
        return priceAmount;
    }

    //cart객체에 담긴 항목들 리셋, 총 금액 리셋
    public void resetCart() {
        for(int i = 0; i < 6; i++) { // 담긴 항목들의 개수 모두 0으로 리셋
            cartItemAmountList[i] = 0;
        }
        priceAmount = 0; // 총 금액 0으로 리셋
    }

    //order의 getter
    public Order getOrder() {
        return order;
    }

    //order 객체에 주문 완료 상태를 전달
    public void cartComplete() {
        order.setOrderCompleteState(true);
    }
}
