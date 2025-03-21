package project1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signUP3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton S,c;

    signUP3(){


        JLabel l1= new JLabel("page 3");
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setBounds(250,40,400,40);
        add(l1);
        JLabel l2= new JLabel("Acount Details");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(250,70,400,40);
        add(l2);
        JLabel l3= new JLabel("Acount Type");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1= new JRadioButton("Saving account");
        r1.setFont(new Font("Raleway",Font.BOLD,15));
        r1.setBounds(100,180,200,30);
        r1.setBackground(Color.lightGray);
        add(r1);
        r2= new JRadioButton("Fixed Deposit Acoount");
        r2.setFont(new Font("Raleway",Font.BOLD,15));
        r2.setBounds(400,180,300,30);
        r2.setBackground(Color.lightGray);
        add(r2);
        r3= new JRadioButton("Current account");
        r3.setFont(new Font("Raleway",Font.BOLD,15));
        r3.setBounds(100,220,250,30);
        r3.setBackground(Color.lightGray);
        add(r3);
        r4= new JRadioButton("Recurring Deposit account");
        r4.setFont(new Font("Raleway",Font.BOLD,15));
        r4.setBounds(400,220,600,30);
        r4.setBackground(Color.lightGray);
        add(r4);
        ButtonGroup bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        JLabel l4= new JLabel("Card No");
        l4.setFont(new Font("Raleway",Font.BOLD,30));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5= new JLabel("(Your 16 digit card no)");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,330,400,30);
        add(l5);

        JLabel l6= new JLabel("XXXX-XXXX-XXXX-2005");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7= new JLabel("It would appear in ATM Cardand Cheque Book");
        l7.setFont(new Font("Raleway",Font.BOLD,13));
        l7.setBounds(330,330,500,40);
        add(l7);
        JLabel l8= new JLabel("PIN");
        l8.setFont(new Font("Raleway",Font.BOLD,15));
        l8.setBounds(100,370,200,30);
        add(l8);
        JLabel l9= new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,15));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10= new JLabel("(4-Digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,15));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11= new JLabel("Services Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,19));
        l11.setBounds(100,450,200,30);
        add(l11);

        c1= new JCheckBox("ATM CARD");
        c1.setBackground(Color.lightGray);
        c1.setFont(new Font("Raleway",Font.BOLD,15));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2= new JCheckBox("Online Banking");
        c2.setBackground(Color.lightGray);
        c2.setFont(new Font("Raleway",Font.BOLD,15));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3= new JCheckBox("Mobile Banking");
        c3.setBackground(Color.lightGray);
        c3.setFont(new Font("Raleway",Font.BOLD,15));
        c3.setBounds(100,550,200,30);
        add(c3);
        c4= new JCheckBox("Email Alerts");
        c4.setBackground(Color.lightGray);
        c4.setFont(new Font("Raleway",Font.BOLD,15));
        c4.setBounds(350,550,200,30);
        add(c4);
        c5= new JCheckBox("Cheque Book");
        c5.setBackground(Color.lightGray);
        c5.setFont(new Font("Raleway",Font.BOLD,15));
        c5.setBounds(350,600,200,30);
        add(c5);
      /*  c6= new JCheckBox("E-Statement");
        c6.setBackground(Color.lightGray);
        c6.setFont(new Font("Raleway",Font.BOLD,15));
        c6.setBounds(100,800,200,30);
        add(c6);*/

        JCheckBox c7= new JCheckBox("I have checked every details correctly",true);

        c7.setBackground(Color.lightGray);
        c7.setFont(new Font("Raleway",Font.BOLD,19));
        c7.setBounds(100,690,600,20);
        add(c7);

        JLabel l12= new JLabel("FORM NO ");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,500,30);
        add(l12);

        JLabel l13= new JLabel();
        l13.setFont(new Font("Raleway",Font.BOLD,25));
        l13.setBounds(290,80,600,35);
        add(l13);

        S= new JButton("Submit");
        S.setFont(new Font("Raleway",Font.BOLD,14));
        S.setBackground(Color.BLACK);
        S.setForeground(Color.WHITE);
        S.setBounds(250,720,100,30);
        S.addActionListener(this);
        add(S);

        c= new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420,720,100,30);
        c.addActionListener(this);
        add(c);





        getContentPane().setBackground(Color.lightGray);
        setSize(900,850);
        setLayout(null);
        setLocation(440,30);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent e){
       String at="";
        if(r1.isSelected()){
            at="Saving account";
        }else if(r2.isSelected()){
            at="Fixed Deposit Acoount";
        }
       else if(r3.isSelected()){
            at="Current account";
        }
       else if(r4.isSelected()){
            at="Recurring Deposit account";}
        Random ran= new Random();
       long f= (ran.nextLong()%90000000L)+1409963000000000L;
       String cardno = ""+Math.abs(f);
       long f3=(ran.nextLong()%9000L)+1000L;
       String pin=""+Math.abs(f3);
       String fac="";
       if(c1.isSelected()){
           fac=fac+"ATM CARD";

       }else if(c2.isSelected()){
            fac=fac+"Online Banking";

        }else if(c3.isSelected()){
            fac=fac+"Mobile Banking";

        }else if(c4.isSelected()){
            fac=fac+"Email Alerts";

        }else if(c5.isSelected()){
            fac=fac+"Cheque Book";

        }
       /* else if(c6.isSelected()){
            fac=fac+"E-Statement";

        }*/
       /* try{
            if(e.getSource()==S){
                if(at.equals("")){
                    JOptionPane.showMessageDialog(null,"fill it");

                }else{
                    conn con1=new conn();
                    String q1= "insert into signUP3 values('"+at+"','"+cardno+"',','"+pin+"','"+fac+"','"+cardno+"','"+pin+"')";

                   // String q2 ="insert into login values()";
                    con1.statement.executeUpdate(q1);
                   // con1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number:"+cardno+"\nPin:"+pin);
                    new deposit(pin);
                    setVisible(false);
                }
                }if(e.getSource()==c){
                System.exit(0);
            }

        }catch(Exception E){
            E.printStackTrace();
        }*/
        try {
            if (e.getSource() == this.S) {
                if (at.equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Fill all the fields");
                } else {
                    conn c1 = new conn();
                    String q1 = "insert into signUP3 values( '" + at+ "','" + cardno + "','" + pin + "','" + fac + "')";
                    String q2 = "insert into login values('" + cardno + "','" + pin + "')";
                     c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog((Component)null, "Card Number : " + cardno + "\n Pin : " + pin);
                    new deposit(pin);
                    this.setVisible(false);
                }
            } else if (e.getSource() == this.c) {
                System.exit(0);
            }
        } catch (Exception var14) {
            var14.printStackTrace();
        }


    }
    public static void main(String[] args) {
new signUP3();
    }
}
