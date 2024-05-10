
package online.banking.application;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;




public class Signup2 extends JFrame implements ActionListener{  
    
    JTextField aadhar,add,cit,sta,pan,pin,fnameTextField,emailTextField;
    JRadioButton syes,sno,female,married,unmarried,other,male, eyes, eno;
    JDateChooser dateChooser;
    JButton next;
    JComboBox religion,category, incomecategory,education,occupation;
    String formno;
    Signup2(String formno){
        this.formno=formno;
        setLayout(null);
        setTitle("ACCOUNT APPLICATION FORM-PAGE 2");
        
        
        
        JLabel additionalDetails=new JLabel("Page 2: Additional  Details");
        additionalDetails.setFont(new Font("Railway",Font.BOLD,22));
        additionalDetails.setBounds(290,50,400,30);
        add(additionalDetails);
        
        
        JLabel name=new JLabel("Religion:");
        name.setFont(new Font("Railway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[]={"Hindu","Islam","Sikh","Christian","other"};
         religion =new JComboBox(valReligion);
         religion.setFont(new Font("Railway",Font.BOLD,16));
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.PINK);
        add(religion);
        
        
        JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Railway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valCategory[]={"General","OBC-A","OBC-B","SC","ST","Other"};
          category =new JComboBox(valCategory);
         category.setFont(new Font("Railway",Font.BOLD,16));
        category.setBackground(Color.PINK);  
        category.setBounds(300,190,400,30);
        add(category);
        
        JLabel dob=new JLabel("Income Details:");
        dob.setFont(new Font("Railway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String incomeCategory[]={"Null","<100000","<150000","<200000","<250000","Up to 1000000"};
        incomecategory =new JComboBox(incomeCategory);
         incomecategory.setFont(new Font("Railway",Font.BOLD,16));
        incomecategory.setBackground(Color.PINK);  
        incomecategory.setBounds(300, 240, 400, 30);
        add(incomecategory);
        
        
   
    
         JLabel gender=new JLabel("Educational");
        gender.setFont(new Font("Railway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
       
         JLabel email=new JLabel("Qulification:");
        email.setFont(new Font("Railway",Font.BOLD,20));
        email.setBounds(100,320,200,30);
        add(email);
        
        String educationalValues[]={"Non-Graduation","Graduation","Post-Graduation","Doctorate","Other"};
         education=new JComboBox(educationalValues);
          education.setFont(new Font("Railway",Font.BOLD,16));
         education.setBackground(Color.PINK);  
         education.setBounds(300, 315, 400, 30);
        add( education);
        
        
        
    
        JLabel marital=new JLabel("Occupation:");
        marital.setFont(new Font("Railway",Font.BOLD,20));
        marital.setBounds(100,380,200,30);
        add(marital);
        
        String occupationValues[]={"Self-Employed","Business","Student","Salaried","Retired","Other"};
        occupation=new JComboBox(occupationValues);
           occupation.setFont(new Font("Railway",Font.BOLD,16));
          occupation.setBackground(Color.PINK);  
          occupation.setBounds(300, 380, 400, 30);
             add(  occupation);
        
        
        
        
       
        
        JLabel address=new JLabel("PAN Number");
        address.setFont(new Font("Railway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan =new JTextField();
        pan.setFont(new Font("Railway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        pan.setBackground(Color.PINK);
        add(pan);
        
         JLabel city=new JLabel("Aadhar Number:");
        city.setFont(new Font("Railway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadhar =new JTextField();
        aadhar.setFont(new Font("Railway",Font.BOLD,16));
        aadhar.setBounds(300,490,400,30);
        aadhar.setBackground(Color.PINK);
        add(aadhar);
        
        JLabel state=new JLabel("Senior Citizen:");
        state.setFont(new Font("Railway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(400, 540, 100, 30);
         syes.setFont(new Font("Railway",Font.BOLD,16));
       
        syes.setBackground(Color.PINK);
        add(syes);
        
         sno=new JRadioButton("No");
         sno.setBounds(540, 540, 100, 30);
          sno.setFont(new Font("Railway",Font.BOLD,16));
         sno.setBackground(Color.PINK);
         add( sno);
        
         ButtonGroup seniorgroup=new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        
        
        
        
        
         
        JLabel pincode=new JLabel("Exisiting Account:");
        pincode.setFont(new Font("Railway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(400, 590, 100, 30);
        eyes.setFont(new Font("Railway",Font.BOLD,16));
        eyes.setBackground(Color.PINK);
        add(eyes);
        
         eno=new JRadioButton("No");
         eno.setBounds(540, 590, 100, 30);
         eno.setBackground(Color.PINK);
          eno.setFont(new Font("Railway",Font.BOLD,16));
         add( eno);
        
         ButtonGroup accountgroup=new ButtonGroup();
       accountgroup.add(eyes);
        accountgroup.add(eno);
        
        
        
         
        
         next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
     
        
        getContentPane().setBackground(Color.PINK);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
   public void actionPerformed(ActionEvent ae)
    {
        
       
        String sreligion=(String) religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)incomecategory.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }
        else if(sno.isSelected()){
             seniorcitizen="Female";
    }
        
        String existingAccount=null;
        if(syes.isSelected()){
           existingAccount ="Yes";
        }
        else if(sno.isSelected()){
            existingAccount="No";
        } 
        String saadhra=aadhar.getText();
        String span= pan.getText();
        
        
        try{
            
          Conn c=new Conn();
                String qi= "insert into signup2 values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+seniorcitizen+"','"+existingAccount+"','"+saadhra+"','"+span+"')";
                c.s.executeUpdate(qi);
                
                setVisible(false);
                new Signup3(formno).setVisible(true);
        }
            
         catch(Exception e){
            System.out.println(e);
               
            
        }
    }
    


    
    public static void main(String[]args){
        new Signup2(" ");
        
    }
}
    


