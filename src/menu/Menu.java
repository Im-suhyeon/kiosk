package menu;

//햄버거, 음료에 상속할 부모 클래스
public class Menu {
    //멤버 필드. 이름, 가격
    private String name;
    private Integer price;


    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

}
