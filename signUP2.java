package project1;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

public class signUP2 extends JFrame implements ActionListener {

    JTextField namet,fnamet,em,addr,ct,sta,pn,formnt1;
    JButton n;
    JRadioButton sny,snn;

    JComboBox religion,cate,Inc,ed,Occ;

    signUP2(String formn1){
        //JDateChooser dateChooser;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION");
       JLabel additionalDetails= new JLabel("Additional Details ");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,40));
        additionalDetails.setBounds(210,40,800,40);
        add(additionalDetails);

        formnt1 = new JTextField();
        formnt1.setBounds(300,100,400,25);
        formnt1.setFont(new Font("Raleway",Font.BOLD,18));
        add(formnt1);


        JLabel form1= new JLabel("Religion");
        form1.setFont(new Font("Raleway",Font.BOLD,25));
       form1.setBounds(100,100,600,25);
        add(form1);

        String validR[]={"Hindu","Muslim","Christian","Other"};
         religion = new JComboBox(validR);
        religion.setBounds(320,100,400,25);

        add(religion);




        namet= new JTextField();
        namet.setFont(new Font("Raleway",Font.BOLD,25));
        namet.setBounds(300,160,400,25);
        add(namet);

        String validC[]={"Genrel","OBC","SC","ST","Other"};

         cate= new JComboBox(validC);
        cate.setBounds(320,160,400,25);
        cate.setFont(new Font("Raleway",Font.BOLD,16));

        add(cate);
        JLabel name= new JLabel("Category:");
        name.setFont(new Font("Raleway",Font.BOLD,25));
        name.setBounds(100,160,600,25);
        add(name);

        fnamet= new JTextField();
        fnamet.setFont(new Font("Raleway",Font.BOLD,25));
        fnamet.setBounds(300,210,400,25);
        add(fnamet);

        String validI[]={"Null","<150000","<300000","500000","More than 500000"};

         Inc= new JComboBox(validI);
        Inc.setBounds(320,210,400,25);
        Inc.setFont(new Font("Raleway",Font.BOLD,16));

        add(Inc);

        JLabel fn=new JLabel("Income:");
        fn.setFont(new Font("Raleway",Font.BOLD,25));
        fn.setBounds(100,215,600,25);
        add(fn);
       /* JTextField date= new JTextField();
        date.setFont(new Font("Raleway",Font.BOLD,25));
        date.setBounds(300,270,400,25);
        add(date);*/



        JLabel Gender=new JLabel("Educational:");
        Gender.setFont(new Font("Raleway",Font.BOLD,25));
        Gender.setBounds(100,330,600,25);
        add(Gender);


        em= new JTextField();
        em.setFont(new Font("Raleway",Font.BOLD,25));
        em.setBounds(300,355,400,25);
        add(em);


        JLabel email= new JLabel("qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,25));
        email.setBounds(100,355,600,25);
        add(email);
        String validE[]={"Non Graduate","Graduate","Post-Graduate","Doctrate"};

         ed= new JComboBox(validE);
        ed.setBounds(320,355,400,25);
        ed.setFont(new Font("Raleway",Font.BOLD,16));

        add(ed);



        String validO[]={"Salaried","Self-Employed","Bussinessman","Retired","Other"};

         Occ= new JComboBox(validO);
        Occ.setBounds(300,445,400,25);
        Occ.setFont(new Font("Raleway",Font.BOLD,16));

        add(Occ);

        JLabel MStatus = new JLabel("Occupation:");
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

        JLabel Pan = new JLabel("Pan No:");
        Pan.setFont(new Font("Raleway",Font.BOLD,25));
        Pan.setBounds(100,555,600,25);
        add(Pan);

        sta= new JTextField();
        sta.setFont(new Font("Raleway",Font.BOLD,25));
        sta.setBounds(300,610,400,25);
        add(sta);

        JLabel Aadhar = new JLabel("Aadhar No:");
        Aadhar.setFont(new Font("Raleway",Font.BOLD,25));
        Aadhar.setBounds(100,610,600,25);
        add(Aadhar);

        pn= new JTextField();
        pn.setFont(new Font("Raleway",Font.BOLD,25));
        pn.setBounds(300,665,400,25);
        add(pn);

        JLabel PINCode = new JLabel("Existing Account:");
        PINCode.setFont(new Font("Raleway",Font.BOLD,25));
        PINCode.setBounds(100,665,600,25);
        add(PINCode);


        sny= new JRadioButton("yes");
        sny.setBounds(300,270,600,25);
        sny.setOpaque(false);
        add(sny);

        snn= new JRadioButton("No");
        snn.setBounds(400,270,600,25);
        snn.setOpaque(false);
        add(snn);

       /* vd= new JRadioButton("others");
        vd.setBounds(500,445,100,25);
        vd.setOpaque(false);
        add(vd);*/

        ButtonGroup hgroup= new ButtonGroup();
        hgroup.add(sny);
        hgroup.add(snn);


        JLabel dob=new JLabel("Senior Citizen:");
        dob.setFont(new Font("Raleway",Font.BOLD,25));
        dob.setBounds(100,270,600,25);
        add(dob);


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



        String Sreligion = (String)religion.getSelectedItem();
        String Category = (String)cate.getSelectedItem();
        String sincome= (String)Inc.getSelectedItem();
        String educ=(String)ed.getSelectedItem();
        String Occup=(String)Occ.getSelectedItem();
        String seniorcit=null;
        String span= ct.getText();
        String adhar=sta.getText();
        String eaccount= pn.getText();
        /*String gender=null;
        if(sny.isSelected()){
            gender="Male";
        }else if(female.isSelected()){
            gender="Female";
        }*/

        if(sny.isSelected()){
            seniorcit="yes";
        }else if(snn.isSelected()){
            seniorcit="No";
        }


        try{

                conn con1= new conn();
                String q= "insert into signUP2 values('"+Sreligion+"','"+Category+"','"+sincome+"','"+educ+"','"+Occup+"','"+seniorcit+"','"+span+"','"+adhar+"','"+eaccount+"')";
                con1.statement.executeUpdate(q);
                new signUP3();
                setVisible(false);

            }

        catch(Exception E){
            E.printStackTrace();
        }


    }
    public static void main(String[] args) {

        new signUP2("");
    }}
