package project1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login1 extends JFrame implements ActionListener {
JButton login,login2,login3;
JTextField createfield;
JPasswordField createfield2;
    Login1(){

        setTitle("ATM");
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon("C=]" +
                "=:\\Users\\ankit bhati\\Downloads\\icons8-bank-50.png");
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);

        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);

        add(label);

        JLabel text = new JLabel();
        text.setText("Welcome to ATM");

        text.setFont(new Font("Osward",Font.BOLD,40));
        text.setBounds(200,40,600,40);
        add(text);
        JLabel cardID= new JLabel();
        cardID.setText("Card No:");

        cardID.setFont(new Font("Raleway",Font.BOLD,30));
        cardID.setBounds(120,150,600,40);
        add(cardID);
         createfield= new JTextField();
        createfield.setBounds(300,150,350,30);
        createfield.setFont(new Font("Arial",Font.PLAIN,20));
        add(createfield);
        JLabel pin = new JLabel();
        pin.setText("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,30));
        pin.setBounds(120,220,600,40);
        add(pin);
         createfield2= new JPasswordField();
        createfield2.setBounds(300,220,350,30);
        createfield2.setFont(new Font("Arial",Font.PLAIN,20));
        add(createfield2);

         login = new JButton("Sign In");
        login.setBounds(300,300,150,40);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

         login2 = new JButton("CLEAR");
        login2.setBounds(500,300,150,40);
        login2.setBackground(Color.BLACK);
        login2.setForeground(Color.white);
        login2.addActionListener(this);
        add(login2);

         login3 = new JButton("Sign Up");
        login3.setBounds(300,350,350,40);
        login3.setBackground(Color.BLACK);
        login3.setForeground(Color.white);
        login3.addActionListener(this);
        add(login3);

       // getContentPane().setBackground(Color.WHITE);
        setSize(800,400);
        setVisible(true);
        setLocation(350,200);

    }


    public static void main(String[] args) {
       new Login1();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

   try{     if(e.getSource()==login){
            conn c = new conn();
            String card = createfield.getText();
            String pin = createfield2.getText();
            String q = "select* from login where card_number ='"+card+"'and Pin ='"+pin+"'";
            ResultSet r= c.statement.executeQuery(q);

            if(r.next()){
                setVisible(false);
                new transaction(pin);
            }
            else{
                JOptionPane.showMessageDialog(null,"Incorrect data");
            }


        }else if(e.getSource()==login2){
            createfield.setText("");
            createfield2.setText("");
        }else if(e.getSource()==login3){
                new SignUP();
                setVisible(false);
        }

    }catch(Exception E){E.printStackTrace();}

}}
