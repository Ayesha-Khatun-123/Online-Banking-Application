
package online.banking.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
     JButton deposit, withdrawl,fastcash,ministatement,change, BalanceQuery,exit;
     String pinnumber;
     
    FastCash(String pinnumber){
        this.pinnumber=pinnumber;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Please Select Withdrawl Amount");
        text.setBounds(180,300,700,35);
         text.setFont(new Font("Raleway",Font.BOLD,19));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        
         deposit=new JButton("Rs 100");
        deposit.setBounds(170, 390, 150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl=new JButton("Rs 500");
        withdrawl.setBounds(355, 390, 150,30);
         withdrawl.addActionListener(this);
        image.add(withdrawl);
        
         fastcash=new JButton("Rs 1000");
        fastcash.setBounds(170, 425, 150,30);
         fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement=new JButton("Rs 2000");
        ministatement.setBounds(355, 425, 150,30);
         ministatement.addActionListener(this);
       image.add(ministatement);
       
         change=new JButton("Rs 5000");
        change.setBounds(170, 460, 150,30);
         change.addActionListener(this);
       image.add(change);
        
         BalanceQuery=new JButton("Rs 10000");
         BalanceQuery.setBounds(355, 460, 150,30);
          BalanceQuery.addActionListener(this);
          image.add( BalanceQuery);
       
        exit=new JButton("Back");
         exit.setBounds(355, 493, 150,30);
          exit.addActionListener(this);
       image.add( exit);
        
        setSize(900,900);
        setLocation(300,0);
        //setUndecorated(true);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
           setVisible(false);
           new Transactions(pinnumber).setVisible(true);
        }
        else{
            String amount =((JButton)ae.getSource()).getText().substring(3);//Rs 500
            Conn con=new Conn();
           try{
               ResultSet re=con.s.executeQuery("select * from bank where pinnumber='"+pinnumber+"'");
               int balance=0;
               
               while(re.next()){
                   if(re.getString("type").equals("Deposit")){
                       balance += Integer.parseInt(re.getString("amount"));    
                   }
                   else{
                       balance -= Integer.parseInt(re.getString("amount")); 
                   }
               }
               
               if(ae.getSource()!= exit && balance < Integer.parseInt(amount)){
                   JOptionPane.showMessageDialog(null, "Insufficient Balance");
                   return;
               }
               Date date =new Date();
               String qu3 ="insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
               con.s.executeUpdate(qu3);
               JOptionPane.showMessageDialog(null,"Rs "+amount+"Debited Succesfully");
               
               setVisible(false);
               new Transactions(pinnumber).setVisible(true);
               
           } catch(Exception e){
               System.out.println(e);
           }
        }
    }
    
    
    
    public static void main(String[]args){
        new FastCash(" ");
        
    }
    
}
