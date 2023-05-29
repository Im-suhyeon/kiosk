import order.Cart;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kiosk extends JFrame{
    private JPanel BasePanel;
    private JPanel NorthPanel;
    private JPanel SouthPanel;
    private JPanel RightPanel;
    private JPanel LeftPanel;
    private JButton OrderCancel;
    private JButton OrderComplete;
    private JButton PayCard;
    private JPanel deriPanel;
    private JPanel shrimpPanel;
    private JPanel bulgogiPanel;
    private JPanel cokePanel;
    private JPanel icecreamPanel;
    private JComboBox bulgogiAmount;
    private JButton bulgogiCart;
    private JComboBox shrimpAmount;
    private JButton shrimpCart;
    private JComboBox deriAmount;
    private JButton deriCart;
    private JComboBox cokeAmount;
    private JButton cokeCart;
    private JLabel Title;
    private JComboBox icecreamAmount;
    private JButton icecreamCart;
    private JPanel deriImagePanel;
    private JLabel deriLabel;
    private JLabel deriPrice;
    private JLabel bulgogiLabel;
    private JLabel bulgogiPrice;
    private JLabel shrimpLabel;
    private JLabel shrimpPrice;
    private JPanel shrimpImagePanel;
    private JPanel cokeImagePanel;
    private JLabel cokeLabel;
    private JLabel cokePrice;
    private JLabel icecreamLabel;
    private JPanel icecreamImagePanel;
    private JLabel icecreamPrice;
    private JComboBox spriteAmount;
    private JButton spriteCart;
    private JPanel spritePanel;
    private JLabel spriteLabel;
    private JPanel spriteImagePanel;
    private JLabel spritePrice;
    private JTable CartTable;
    private JScrollPane CartScrollPane;
    private JPanel bulgogiImagePanel;

    private JLabel bulgogiImageLabel;
    private JLabel deriImageLabel;
    private JLabel shrimpImageLabel;
    private JLabel cokeImageLabel;
    private JLabel icecreamImageLabel;
    private JLabel spriteImageLabel;


    int count; int total=0; int col=0; int row=0; String contents = "";


    DefaultTableModel model;
    private void createTable(){
        String[] [] data = new String[0][0];
        String[] title = {"메뉴명", "단가", "수량", "합계", "총 금액"};
        model = new DefaultTableModel(data, title);

        CartTable.setModel(model);
    }




    public Kiosk() {

        setContentPane(BasePanel);
        setTitle("hamburger kiosk");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,1000);
        setLocationRelativeTo(null);
        setVisible(true);

        createTable();

        // 참고 : https://eating-coding.tistory.com/5
        ImageIcon bulgogiicon = new ImageIcon("img/bulgogi.jpg");
        Image bulgogiimg = bulgogiicon.getImage();
        Image bulgogichangeImg = bulgogiimg.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon bulgogichangeIcon = new ImageIcon(bulgogichangeImg);
        bulgogiImageLabel = new JLabel(bulgogichangeIcon);
        bulgogiImagePanel.add(bulgogiImageLabel);
        bulgogiImagePanel.setSize(100,100);
        bulgogiImagePanel.setVisible(true);


        ImageIcon shrimpicon = new ImageIcon("img/shrimp.jpg");
        Image shrimpimg = shrimpicon.getImage();
        Image shrimpchangeImg = shrimpimg.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon shrimpchangeIcon = new ImageIcon(shrimpchangeImg);
        shrimpImageLabel = new JLabel(shrimpchangeIcon);
        shrimpImagePanel.add(shrimpImageLabel);
        shrimpImagePanel.setSize(100,100);
        shrimpImagePanel.setVisible(true);


        ImageIcon deriicon = new ImageIcon("img/deri.jpg");
        Image deriimg = deriicon.getImage();
        Image derichangeImg = deriimg.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon derichangeIcon = new ImageIcon(derichangeImg);
        deriImageLabel = new JLabel(derichangeIcon);
        deriImagePanel.add(deriImageLabel);
        deriImagePanel.setSize(100,100);
        deriImagePanel.setVisible(true);


        ImageIcon cokeicon = new ImageIcon("img/coke.jpg");
        Image cokeimg = cokeicon.getImage();
        Image cokechangeImg = cokeimg.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon cokechangeIcon = new ImageIcon(cokechangeImg);
        cokeImageLabel = new JLabel(cokechangeIcon);
        cokeImagePanel.add(cokeImageLabel);
        cokeImagePanel.setSize(100,100);
        cokeImagePanel.setVisible(true);


        ImageIcon spriteicon = new ImageIcon("img/sprite.jpg");
        Image spriteimg = spriteicon.getImage();
        Image spritechangeImg = spriteimg.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon spritechangeIcon = new ImageIcon(spritechangeImg);
        spriteImageLabel = new JLabel(spritechangeIcon);
        spriteImagePanel.add(spriteImageLabel);
        spriteImagePanel.setSize(100,100);
        spriteImagePanel.setVisible(true);


        ImageIcon icecreamicon = new ImageIcon("img/icecream.jpg");
        Image icecreamimg = icecreamicon.getImage();
        Image icecreamchangeImg = icecreamimg.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon icecreamchangeIcon = new ImageIcon(icecreamchangeImg);
        icecreamImageLabel = new JLabel(icecreamchangeIcon);
        icecreamImagePanel.add(icecreamImageLabel);
        icecreamImagePanel.setSize(100,100);
        icecreamImagePanel.setVisible(true);

        //여기서부터 로직 구현
        order.Cart cart = new Cart();

        TextArea txt = new TextArea();

        String inputStr[] = new String[5];

        bulgogiAmount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = Integer.valueOf(bulgogiAmount.getSelectedItem().toString());
            }
        });
        bulgogiCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cart.setCartAmountList(0, count);
                total += count;


                inputStr[0] = cart.getM()[0].getName();
                inputStr[1] = String.valueOf(cart.getM()[0].getPrice()) + "원";
                inputStr[2] = ""+count;
                inputStr[3] = (cart.getM()[0].getPrice()) * count + "원";
                inputStr[4] = String.valueOf(cart.getPriceAmount()) + "원";

                model.addRow(inputStr);
//                System.out.println(inputStr[0]);
//                System.out.println(inputStr[1]);
//                System.out.println(count + "   ..");
//                System.out.println(inputStr[4]);
            }
        });

        shrimpAmount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = Integer.valueOf(shrimpAmount.getSelectedItem().toString());
            }
        });
        shrimpCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cart.setCartAmountList(1, count);
                total += count;



                inputStr[0] = cart.getM()[1].getName();
                inputStr[1] = String.valueOf(cart.getM()[1].getPrice()) + "원";
                inputStr[2] = ""+count;
                inputStr[3] = (cart.getM()[1].getPrice()) * count + "원";
                inputStr[4] = String.valueOf(cart.getPriceAmount()) + "원";

                model.addRow(inputStr);
            }
        });

        deriAmount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = Integer.valueOf(deriAmount.getSelectedItem().toString());
            }
        });

        deriCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cart.setCartAmountList(2, count);
                total += count;

                inputStr[0] = cart.getM()[2].getName();
                inputStr[1] = String.valueOf(cart.getM()[2].getPrice()) + "원";
                inputStr[2] = ""+count;
                inputStr[3] = (cart.getM()[2].getPrice()) * count + "원";
                inputStr[4] = String.valueOf(cart.getPriceAmount()) + "원";

                model.addRow(inputStr);
            }
        });


        cokeAmount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = Integer.valueOf(cokeAmount.getSelectedItem().toString());
            }
        });
        cokeCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cart.setCartAmountList(3, count);
                total += count;

                inputStr[0] = cart.getM()[3].getName();
                inputStr[1] = String.valueOf(cart.getM()[3].getPrice()) + "원";
                inputStr[2] = ""+count;
                inputStr[3] = (cart.getM()[3].getPrice()) * count + "원";
                inputStr[4] = String.valueOf(cart.getPriceAmount()) + "원";

                model.addRow(inputStr);
            }
        });


        spriteAmount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = Integer.valueOf(spriteAmount.getSelectedItem().toString());
            }
        });
        spriteCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cart.setCartAmountList(4, count);
                total += count;

                inputStr[0] = cart.getM()[4].getName();
                inputStr[1] = String.valueOf(cart.getM()[4].getPrice()) + "원";
                inputStr[2] = ""+count;
                inputStr[3] = (cart.getM()[4].getPrice()) * count + "원";
                inputStr[4] = String.valueOf(cart.getPriceAmount()) + "원";

                model.addRow(inputStr);
            }
        });

        icecreamAmount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = Integer.valueOf(icecreamAmount.getSelectedItem().toString());
            }
        });
        icecreamCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cart.setCartAmountList(5, count);
                total += count;

                inputStr[0] = cart.getM()[5].getName();
                inputStr[1] = String.valueOf(cart.getM()[5].getPrice()) + "원";
                inputStr[2] = ""+count;
                inputStr[3] = (cart.getM()[5].getPrice()) * count + "원";
                inputStr[4] = String.valueOf(cart.getPriceAmount()) + "원";

                model.addRow(inputStr);
            }
        });

        //장바구니 초기화
        OrderCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cart.resetCart();

                model.setNumRows(0);
                total = 0;
                txt.setText("");
            }
        });


        //장바구니 담기 완료 버튼 누를 시
        OrderComplete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cart.cartComplete(); // cart가 가지는 order 객체의 필드인 orderCompleteState의 값은 true로 변경해주는 함수
            }
        });

        //카드 결제 버튼 누를 시
        PayCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //장바구니 담기 완료 버튼 안 눌렀을 경우
                if(!cart.getOrder().getOrderCompleteState()) {
                    JOptionPane.showMessageDialog(BasePanel, "장바구니 담기를 완료해주세요.", "error",JOptionPane.ERROR_MESSAGE);
                }
                //장바구니 담기 완료 버튼 눌렀을 경우
                else {
                    JOptionPane.showMessageDialog(BasePanel, "결제가 완료되었습니다.", "message", JOptionPane.INFORMATION_MESSAGE);
                    //장바구니 초기화
                    cart.resetCart();
                    cart.getOrder().setOrderCompleteState(false);
                    model.setNumRows(0);
                    total = 0;
                    txt.setText("");
                }
            }
        });




    }

    private void createUIComponents() {

        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        new Kiosk();

    }
}

