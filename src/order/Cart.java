package order;

import menu.Burger;
import menu.Drink;
import menu.Menu;

public class Cart {
    //순서대로 불고기버거, 새우버거, 데리버거, 콜라, 스프라이트, 아이스크림의 카트에 담긴 수량
    private int[] cartItemAmountList = {0, 0, 0, 0, 0, 0};
    private int priceAmount = 0;
    private Menu[] m = {new Burger("불고기버거", 6000), new Burger("새우버거", 5000), new Burger("데리버거", 4000),
            new Drink("콜라", 1000), new Drink("스프라이트", 1500), new Drink("아이스크림", 500)};

    private Order order = new Order();

    public Menu[] getM() {
        return m;
    }

    public void setCartAmountList(int idx, int amount) {
        this.cartItemAmountList[idx] += amount;
    }

    public void calcPrice() {
        priceAmount = 0;
        for (int i = 0; i < 6; i++) {
            priceAmount += cartItemAmountList[i] * (m[i].getPrice());
        }
    }

    public int getPriceAmount() {
        calcPrice();
        return priceAmount;
    }

    public void resetCart() {
        for(int i = 0; i < 6; i++) {
            cartItemAmountList[i] = 0;
        }
        priceAmount = 0;
    }

    public Order getOrder() {
        return order;
    }

    public void cartComplete() {
        order.setOrderCompleteState(true);
    }
}
