package project1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.*;


public class withdrawl extends JFrame implements ActionListener {
    String pin;
    TextField t;
    JButton b1,b2;
    withdrawl(){
        ImageIcon i1 = new ImageIcon("C:\\Users\\ankit bhati\\Downloads\\29665834.jpg");
        Image i2=i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1200,700);
        add(l1);

        JLabel label2=new JLabel("ENTER AMOUNT(Max limit is 10000)");
        label2.setFont(new Font("System",Font.BOLD,10));
        label2.setBounds(410,230,400,45);
        l1.add(label2);

       /* JLabel label3=new JLabel("ENTER AMOUNT TO WITHDRAW");
        label3.setFont(new Font("System",Font.BOLD,10));
        label3.setBounds(410,270,400,45);
        l1.add(label3);*/

        t = new TextField();
        t.setBounds(380,280,300,20);

        t.setFont(new Font("Raleway",Font.BOLD,16));
        t.setBackground(Color.lightGray);
        l1.add(t);

        b1=new JButton("WITHDRAW");
        b1.setBounds(300,310,100,24);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l1.add(b1);

        b2= new JButton("BACK");
        b2.setBounds(300,335,100,24);
        b2.setForeground(Color.white);
        b2.setBackground(Color.red);
        b2.addActionListener(this);
        l1.add(b2);



        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        setSize(1500,1000);
        setLocation(0,0);
        setVisible(true);


    }

    public static void main(String[] args) {
        new withdrawl();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount =t.getText();
            Date d = new Date();
            if(t.equals("")){
                JOptionPane.showMessageDialog(null,"Enter amount correctly");

            }else{
                conn c = new conn();
                ResultSet r= c.statement.executeQuery("Select * from where d ='"+pin+"'");
                int balance =0;
                while(r.next()){
                    if(r.getString("type").equals("deposit")){
                        balance+= Integer.parseInt(r.getString("amount"));
                    }
                    else {
                        balance-=Integer.parseInt(r.getString("amount"));
                    }
                }
                if(balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+d+"','withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"transaction completed");
                setVisible(false);
               new transaction(pin);
            }

    }catch(Exception E){}
}}
