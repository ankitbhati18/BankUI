package project1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class transaction extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6;
    String pin;
    JTextField t;
    transaction(String pin){
        this.pin= pin;
        ImageIcon i1 = new ImageIcon("C:\\Users\\ankit bhati\\Downloads\\29665834.jpg");
        Image i2=i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1200,700);
        add(l1);

        JLabel l2 =new JLabel("Select the type of transaction");
        l2.setBounds(300,230,600,50);
        l2.setFont(new Font("Raleway",Font.BOLD, 16));
        l2.setForeground(Color.DARK_GRAY);
        l1.add(l2);

        b1= new JButton("DEPOSIT");
        b1.setBounds(300,310,120,24);
        b1.setForeground(Color.white);
        b1.setBackground(Color.green);
        b1.addActionListener(this);
        l1.add(b1);

        b2= new JButton("WITHDRAW");
        b2.setBounds(610,310,120,24);
        b2.setForeground(Color.white);
        b2.setBackground(Color.green);
        b2.addActionListener(this);
        l1.add(b2);

        b3= new JButton("FAST CASH");
        b3.setBounds(300,335,120,24);
        b3.setForeground(Color.white);
        b3.setBackground(Color.green);
        b3.addActionListener(this);
        l1.add(b3);

        b4= new JButton("MINISTATE");
        b4.setBounds(610,335,120,24);
        b4.setForeground(Color.white);
        b4.setBackground(Color.green);
        b4.addActionListener(this);
        l1.add(b4);

        b5= new JButton("ENQUIRY");
        b5.setBounds(300,360,120,24);
        b5.setForeground(Color.white);
        b5.setBackground(Color.green);
        b5.addActionListener(this);
        l1.add(b5);

        b6= new JButton("EXIT");
        b6.setBounds(610,360,120,24);
        b6.setForeground(Color.white);
        b6.setBackground(Color.green);
        b6.addActionListener(this);
        l1.add(b6);


        setLayout(null);
        setSize(1500,700);
        setLocation(0,0);
  getContentPane().setBackground(Color.lightGray);
        setVisible(true);



    }
    public static void main(String[] args) {
        new transaction("");



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        if(e.getSource()==b1){
            new deposit(pin);
           setVisible(false);


        }
        else if(e.getSource()==b2){
           new withdrawl();

            setVisible(false);
        }else if(e.getSource()==b3){
            new SignUP();
            setVisible(false);
        }
        else if(e.getSource()==b6){
            System.exit(10);
        }
    }catch(Exception E){
            E.printStackTrace();
        }}}
