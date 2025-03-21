package project1;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUP extends JFrame implements ActionListener {
    long random;
    JTextField namet,fnamet,em,addr,ct,sta,pn;
    JButton n;
    JRadioButton male,female,vd,married,unmarried;
    JDateChooser dateChooser;

    SignUP(){
        //JDateChooser dateChooser;
        setLayout(null);

        Random r= new Random();
        long ran=(Math.abs(r.nextLong()%9000L)+1000L);
        JLabel formn= new JLabel("FORM NO "+ran);
        formn.setFont(new Font("Raleway",Font.BOLD,40));
        formn.setBounds(210,40,800,40);
        add(formn);
        JLabel formn1= new JLabel("User Details");
        formn1.setFont(new Font("Raleway",Font.BOLD,25));
        formn1.setBounds(290,80,600,35);
        add(formn1);

         namet= new JTextField();
        namet.setFont(new Font("Raleway",Font.BOLD,25));
        namet.setBounds(300,160,400,25);
        add(namet);

        JLabel name= new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,25));
        name.setBounds(100,160,600,25);
        add(name);

         fnamet= new JTextField();
        fnamet.setFont(new Font("Raleway",Font.BOLD,25));
        fnamet.setBounds(300,210,400,25);
        add(fnamet);


        JLabel fn=new JLabel("Father Name:");
        fn.setFont(new Font("Raleway",Font.BOLD,25));
        fn.setBounds(100,215,600,25);
        add(fn);
       /* JTextField date= new JTextField();
        date.setFont(new Font("Raleway",Font.BOLD,25));
        date.setBounds(300,270,400,25);
        add(date);*/

         dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,270,400,25);
        add(dateChooser);

        JLabel dob=new JLabel("DOB:");
        dob.setFont(new Font("Raleway",Font.BOLD,25));
        dob.setBounds(100,270,600,25);
        add(dob);

        JLabel Gender=new JLabel("Gender:");
        Gender.setFont(new Font("Raleway",Font.BOLD,25));
        Gender.setBounds(100,330,600,25);
        add(Gender);
         male= new JRadioButton("Male");
        male.setBounds(300,330,60,25);
       male.setOpaque(false);
        add(male);

         female= new JRadioButton("Female");
        female.setBounds(400,330,90,25);
        female.setOpaque(false);
        add(female);

        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);


         em= new JTextField();
        em.setFont(new Font("Raleway",Font.BOLD,25));
        em.setBounds(300,385,400,25);
        add(em);


        JLabel email= new JLabel("Email Adderss:");
        email.setFont(new Font("Raleway",Font.BOLD,25));
        email.setBounds(100,385,600,25);
        add(email);

         married= new JRadioButton("Married");
        married.setBounds(300,445,100,25);
        married.setOpaque(false);
        add(married);

         unmarried= new JRadioButton("Unmarried");
        unmarried.setBounds(400,445,100,25);
        unmarried.setOpaque(false);
        add(unmarried);

         vd= new JRadioButton("others");
        vd.setBounds(500,445,100,25);
        vd.setOpaque(false);
        add(vd);

        ButtonGroup hgroup= new ButtonGroup();
        hgroup.add(married);
        hgroup.add(unmarried);
        hgroup.add(vd);

        JLabel MStatus = new JLabel("Marital status:");
        MStatus.setFont(new Font("Raleway",Font.BOLD,25));
        MStatus.setBounds(100,445,600,25);
        add(MStatus);

         addr= new JTextField();
        addr.setFont(new Font("Raleway",Font.BOLD,25));
        addr.setBounds(300,500,400,25);
        add(addr);

        JLabel Address = new JLabel("Address:");
        Address.setFont(new Font("Raleway",Font.BOLD,25));
        Address.setBounds(100,500,600,25);
        add(Address);

         ct= new JTextField();
        ct.setFont(new Font("Raleway",Font.BOLD,25));
        ct.setBounds(300,555,400,25);
        add(ct);

        JLabel city = new JLabel("city:");
        city.setFont(new Font("Raleway",Font.BOLD,25));
        city.setBounds(100,555,600,25);
        add(city);

         sta= new JTextField();
        sta.setFont(new Font("Raleway",Font.BOLD,25));
        sta.setBounds(300,610,400,25);
        add(sta);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,25));
        state.setBounds(100,610,600,25);
        add(state);

         pn= new JTextField();
        pn.setFont(new Font("Raleway",Font.BOLD,25));
        pn.setBounds(300,665,400,25);
        add(pn);

        JLabel PINCode = new JLabel("PIN code:");
        PINCode.setFont(new Font("Raleway",Font.BOLD,25));
        PINCode.setBounds(100,665,600,25);
        add(PINCode);


         n= new JButton("Next");
        n.setBackground(Color.BLACK);
        n.setForeground(Color.white);
        n.setFont(new Font("Arial",Font.BOLD,18));
        n.setBounds(700,750,80,30);
        n.addActionListener(this);
        add(n);
        getContentPane().setBackground(Color.gray);
        setSize(900,700);
        setLocation(400,20);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String formno= ""+ random;
        String name= namet.getText();
        String fname = fnamet.getText();
        String dob= ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }else if(female.isSelected()){
            gender="Female";
        }
        String email=em.getText();
        String marital=null;
        if(unmarried.isSelected()){
            marital="Single";
        }else if(married.isSelected()){
            marital="married";
        }else if(vd.isSelected()){
            marital="other";
        }
        String address= addr.getText();
        String city=ct.getText();
        String state= sta.getText();
        String pin= pn.getText();

        try{
            if(namet.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the required data");
            }else{
                conn con1= new conn();
                String q= "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                con1.statement.executeUpdate(q);
                new signUP2("");
                setVisible(false);


            }

        }catch(Exception E){
            E.printStackTrace();
        }


    }
    public static void main(String[] args) {

        new SignUP();
    }


}
