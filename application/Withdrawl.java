
package online.banking.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl extends JFrame  implements ActionListener{
      JButton withdrawl,back;
      String pinnumber;
        JTextField amount;
    Withdrawl( String pinnumber){
        
        this.pinnumber=pinnumber;
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
         JLabel text=new JLabel("Enter the amount you want to withdrawl");
        text.setBounds(180,300,400,20);
         text.setFont(new Font("Raleway",Font.BOLD,17));
        text.setForeground(Color.WHITE);
        image.add(text);
        
         amount=new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,17));
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);
        
         withdrawl=new JButton("Withdraw");
         withdrawl.setBounds(355, 460, 150,30);
          withdrawl.addActionListener(this);
          image.add( withdrawl);
       
         back=new JButton("Back");
         back.setBounds(355, 493, 150,30);
         back.addActionListener(this);
          image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        //setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== withdrawl)
        {
            
            String number=amount.getText();
               Date date=new Date();
            if (amount.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
            }
            else{
            try{
             
                Conn conn=new Conn();
                String query ="insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+number+" Withdrawl Succesfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
                 
            catch(Exception e){
                System.out.println(e);
            }
        }
    }       
        else if(ae.getSource()==back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
            
        }
    }
    
    public static void main(String[]args){
        new Withdrawl(" ");
    }
}
