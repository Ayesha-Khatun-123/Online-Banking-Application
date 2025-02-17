
package online.banking.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transactions extends JFrame implements ActionListener{
     JButton deposit, withdrawl,fastcash,ministatement,change, BalanceEnquiry,exit;
     String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber=pinnumber;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Please select your Transaction");
        text.setBounds(200,300,700,35);
         text.setFont(new Font("Raleway",Font.BOLD,19));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        
         deposit=new JButton("Deposit");
        deposit.setBounds(170, 390, 150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl=new JButton("Cash Withdrawl");
        withdrawl.setBounds(355, 390, 150,30);
         withdrawl.addActionListener(this);
        image.add(withdrawl);
        
         fastcash=new JButton("Fast Cash");
        fastcash.setBounds(170, 425, 150,30);
         fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement=new JButton("Mini Statement");
        ministatement.setBounds(355, 425, 150,30);
         ministatement.addActionListener(this);
       image.add(ministatement);
       
         change=new JButton("Pin Change");
        change.setBounds(170, 460, 150,30);
         change.addActionListener(this);
       image.add(change);
        
         BalanceEnquiry=new JButton("Balance Enquiry");
         BalanceEnquiry.setBounds(355, 460, 150,30);
          BalanceEnquiry.addActionListener(this);
          image.add( BalanceEnquiry);
       
        exit=new JButton("Exit");
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
            System.exit(0);
        }
        else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if (ae.getSource()== withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
        else if(ae.getSource()== fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
        
        else if(ae.getSource()== change){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if(ae.getSource()== BalanceEnquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()== ministatement){
            setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String[]args){
        new Transactions(" ");
        
    }
    
}
