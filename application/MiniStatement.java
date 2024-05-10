/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.banking.application;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.sql.*;  


public class MiniStatement extends JFrame {
  //  String pinnumber;
    MiniStatement(String pinnumber){
     //   this.pinnumber=pinnumber;
        setLayout(null);
        setTitle("Mini Statement");
        
        JLabel mini=new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);
        
        JLabel bank=new JLabel("State Bank OF India");
        bank.setBounds(100, 20, 200, 20);
       bank.setFont(new Font("System",Font.BOLD,20));
        add(bank);
        
        
        JLabel card=new JLabel();
        card.setBounds(20,80,300,20);
        card.setFont(new Font("System",Font.BOLD,15));
        add(card);
        
        JLabel balance =new JLabel();
        balance.setBounds(30,400,300,20);
        balance.setFont(new Font("System",Font.BOLD,15));
        add(balance);
        
        try{
            Conn c=new Conn();
         ResultSet re=   c.s.executeQuery("select * from login where pin='"+pinnumber+"'");
         
         while(re.next()){
             card.setText("Card Number:"+re.getString("cardnumber").substring(0,4)+"XXXXXXXX"+re.getString("cardnumber").substring(12));
             
             
             
         }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        try{
            Conn c=new Conn();
            int bal=0;
             ResultSet re=   c.s.executeQuery("select * from bank where pinnumber='"+pinnumber+"'");
             while(re.next()){
             mini.setText(mini.getText() + "<html>" +re.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+re.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+re.getString("amount")+"<br><br><html>");
             
              if(re.getString("type").equals("Deposit")){
                       bal += Integer.parseInt(re.getString("amount"));    
                   }
                   else{
                       bal -= Integer.parseInt(re.getString("amount")); 
                   }
             
         }
             balance.setText("Your current account balance is Rs "+bal);
            
        }catch(Exception e){
            
            System.out.println(e);
        }
        
        
        
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.PINK);
        setVisible(true);
        
    }
    public static void main(String[]args){
        new MiniStatement("");
        
    }
    
}
