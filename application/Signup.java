
package online.banking.application;


import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;




public class Signup extends JFrame implements ActionListener{  
    long Random;
    JTextField nameTextField,fnameTextField,emailTextField,add,cit,sta,pin;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser dateChooser;
    JButton next;
    Signup(){
        setLayout(null);
        Random ran=new Random();
        Random =Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno =new JLabel("APPLICATION FORM NO:-"+Random);
        formno.setFont(new Font("Railway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personDetails=new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Railway",Font.BOLD,22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);
        
        
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Railway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
         nameTextField =new JTextField();
        nameTextField.setFont(new Font("Railway",Font.BOLD,17));
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setBackground(Color.PINK);
        add(nameTextField);
        
        
         JLabel fname=new JLabel("Fathers Name:");
        fname.setFont(new Font("Railway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
         fnameTextField =new JTextField();
        fnameTextField.setFont(new Font("Railway",Font.BOLD,17));
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setBackground(Color.PINK);
        add(fnameTextField);
        
        JLabel dob=new JLabel("Date Of Birth:");
        dob.setFont(new Font("Railway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser =new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        //dateChooser.setForeground(Color.red);
        //dateChooser.setForeground(new Color(105,105,105));
        //dateChooser.setForeground(Color.PINK);
        dateChooser.setBackground(Color.PINK);
        add(dateChooser);
        
    
         JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Railway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
         male=new JRadioButton("Male");
        male.setBounds(300, 290, 90, 30);
         male.setFont(new Font("Railway",Font.BOLD,17));
        male.setBackground(Color.PINK);
        add(male);
        
         female=new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
         female.setFont(new Font("Railway",Font.BOLD,17));
        female.setBackground(Color.PINK);
        add(female);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
         JLabel email=new JLabel("EmailAddress:");
        email.setFont(new Font("Railway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField =new JTextField();
        emailTextField.setFont(new Font("Railway",Font.BOLD,17));
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setBackground(Color.PINK);
        add(emailTextField);
        
         JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("Railway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
         married=new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setFont(new Font("Railway",Font.BOLD,17));
        married.setBackground(Color.PINK);
        add(married);
        
         unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 150, 30);
        unmarried.setFont(new Font("Railway",Font.BOLD,17));
        unmarried.setBackground(Color.PINK);
        add(unmarried);
        
         other=new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setFont(new Font("Railway",Font.BOLD,17));
        other.setBackground(Color.PINK);
        add(other);
        
        ButtonGroup marriedgroup=new ButtonGroup();
        marriedgroup.add(married);
        marriedgroup.add(unmarried);
        marriedgroup.add(other);
        
        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Railway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        add =new JTextField();
        add.setFont(new Font("Railway",Font.BOLD,17));
        add.setBounds(300,440,400,30);
        add.setBackground(Color.PINK);
        add(add);
        
         JLabel city=new JLabel("City:");
        city.setFont(new Font("Railway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cit =new JTextField();
        cit.setFont(new Font("Railway",Font.BOLD,17));
        cit.setBounds(300,490,400,30);
        cit.setBackground(Color.PINK);
        add(cit);
        
        JLabel state=new JLabel("State:");
        state.setFont(new Font("Railway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
         sta =new JTextField();
        sta.setFont(new Font("Railway",Font.BOLD,17));
        sta.setBounds(300,540,400,30);
        sta.setBackground(Color.PINK);
        add(sta);
        
        JLabel pincode=new JLabel("Pincode:");
        pincode.setFont(new Font("Railway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
         pin =new JTextField();
        pin.setFont(new Font("Railway",Font.BOLD,17));
        pin.setBounds(300,590,400,30);
        pin.setBackground(Color.PINK);
        add(pin);
        
        
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
        
        String formno=""+ Random;
        String name=nameTextField.getText();
        String fname=fnameTextField.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
            gender="Female";
    }
        String email=emailTextField.getText();
        String marital=null;
        if(married.isSelected()){
            marital="Married";
        }
        else if(unmarried.isSelected()){
            marital="Unmarried";
        }
        else if(other.isSelected()){
            marital="Other";
        }
        String address=add.getText();
        String city=cit.getText();
        String state=sta.getText();
        String pi=pin.getText();
        
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }
            else{
                Conn c=new Conn();
                String qi= "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pi+"','"+state+"')";
                c.s.executeUpdate(qi);
                setVisible(false);
               new Signup2(formno).setVisible(true);
        }
            
        }catch(Exception e){
            System.out.println(e);
               
            
        }
    }


    
    public static void main(String[]args){
        new Signup();
        
    }
}
    


