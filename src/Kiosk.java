import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

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


    private void createTable(){
        Object[][] data ={
                {"데리버거", 4000, 2, 8000, 8000},
                {"데리버거", 4000, 1, 4000, 12000}
        };
        CartTable.setModel(new DefaultTableModel(
                data,
                new String[]{"상품명", "가격", "수량", "합계", "총 금액"}
        ));
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

    }

    private void createUIComponents() {

        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        new Kiosk();

    }
}

