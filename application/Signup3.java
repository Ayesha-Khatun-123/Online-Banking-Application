
package online.banking.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Signup3  extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
   JCheckBox c1,c2,c3,c4,c5,c6,c7;
   JButton submit,cancel;
   JLabel type, card,pin;
   String formno,cardnumber, pinnumber;
    Signup3( String formno){
        
        this.formno=formno;
        setLayout(null);
        JLabel l1=new JLabel("Page 3:Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        l1.setBackground(Color.WHITE);
        add(l1);
        
         type=new JLabel("Account Type:");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,19));
        r1.setBackground(Color.PINK);
        r1.setBounds(100,180,190,20);
        add(r1);
        
        r2=new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway",Font.BOLD,19));
        r2.setBackground(Color.PINK);
        r2.setBounds(350,180,190,20);
        add(r2);
        
        r3=new JRadioButton("Fixed Deposite Account");
        r3.setFont(new Font("Raleway",Font.BOLD,19));
        r3.setBackground(Color.PINK);
        r3.setBounds(100,220,250,20);
        add(r3);
        
        r4=new JRadioButton("Reccrring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,19));
        r4.setBackground(Color.PINK);
        r4.setBounds(350,220,300,20);
        add(r4);
        
        ButtonGroup groupaccount= new ButtonGroup();
                groupaccount.add(r1);
                groupaccount.add(r2);
                groupaccount.add(r3);
                groupaccount.add(r4);
                
                
         card=new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-7226");
        number.setFont(new Font("Raleway",Font.BOLD,20));
        number.setBounds(330,300,290,30);
      
        add(number);
        
         JLabel carddetail=new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,330,300,20);
        add(carddetail);
        
        
          pin=new JLabel("PIN Number:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnnumber=new JLabel("XXXX");
        pnnumber.setFont(new Font("Raleway",Font.BOLD,20));
        pnnumber.setBounds(330,370,290,30);
        add(pnnumber);
        
         JLabel pindetail=new JLabel("Your 4 Digit Pin Number");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,400,300,20);
        add(pindetail);
        
         JLabel services=new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,260,30);
        add(services);
        
        c1=new JCheckBox("Atm Card");
        c1.setBackground(Color.PINK);
        c1.setFont(new Font("Raleway",Font.BOLD,19));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.PINK);
        c2.setFont(new Font("Raleway",Font.BOLD,19));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.PINK);
        c3.setFont(new Font("Raleway",Font.BOLD,19));
        c3.setBounds(100,540,200,30);
        add(c3);
        
        c4=new JCheckBox("Email & Sms Alert");
        c4.setBackground(Color.PINK);
        c4.setFont(new Font("Raleway",Font.BOLD,19));
        c4.setBounds(350,540,200,30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.PINK);
        c5.setFont(new Font("Raleway",Font.BOLD,19));
        c5.setBounds(100,580,200,30);
        add(c5);
        
        c6=new JCheckBox("E statement");
        c6.setBackground(Color.PINK);
        c6.setFont(new Font("Raleway",Font.BOLD,19));
        c6.setBounds(350,580,200,30);
        add(c6);
        
        c7=new JCheckBox("I hereby declare that the above details are correct to the best of my knowledge");
        c7.setBackground(Color.PINK);
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100,650,660,30);
        add(c7);
        
        cancel=new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,19));
        cancel.setBounds(250,700,100,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        submit=new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,19));
        submit.setBounds(440,700,100,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        
                
        getContentPane().setBackground(Color.PINK);
                setSize(850,820);
                setLocation(350,0);
                 //setUndecorated(true);
                setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            
            String atype =null;
            
            
          if(r1.isSelected()){
                   atype="Saving Account";
           }   else if(r2.isSelected()){
                   atype="Current Account";
           }   else if(r3.isSelected()){
                  atype="Fixed Deposite Account";
           }     else if(r4.isSelected()){
                   atype="Reccrring Deposite Account";
           }            
        
       
        Random random=new Random();
       cardnumber=""+Math.abs((random.nextLong()%90000000L)+7634892000000000L);
        
         pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
        
        String facility= " ";
        if(c1.isSelected()){
            facility=facility + "Atm Card";
        }
        else if(c2.isSelected()){
            facility=facility+"Internet Banking";
        }
        
        else if(c3.isSelected()){
            facility=facility+"IMobile Banking";
        }
        
        else if(c4.isSelected()){
            facility=facility+"Email & Sms Alert";
        }
        else if(c5.isSelected()){
            facility=facility+"Cheque Book";
        }
        else if(c6.isSelected()){
            facility=facility+"E statement";
        }
        try{
            if(type.equals("")){
                JOptionPane.showMessageDialog(null, "Account Type required");
            }
            else {
                Conn con=new Conn();
 
                 String q3="insert into signup3 values('"+formno+"','"+atype+"','"+ cardnumber+"','"+pinnumber+"','"+facility+"')"; 
                  String q4="insert into login values('"+formno+"','"+ cardnumber+"','"+pinnumber+"')";
                  
                   con.s .executeUpdate(q3);
                   con.s .executeUpdate(q4);
                   
                JOptionPane.showMessageDialog(null, "Card Number "+cardnumber +"\n Pin: "+pinnumber);
            }
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        
        catch(Exception e){
            System.out.println(e);
            
        }
        }
        else if(ae.getSource()==cancel){
            setVisible(true);
            new Login().setVisible(true);
        }
    
        
    }
    public static void main(String[]args){
        new Signup3("");
    }
    
}
