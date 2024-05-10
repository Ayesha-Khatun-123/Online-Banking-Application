
package online.banking.application;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class PinChange extends JFrame implements ActionListener{
    JPasswordField pinfield, repinfield;
    JButton change,back;
    String pinnumber;
    
    PinChange(String pinnumber){
     
         this.pinnumber = pinnumber;
   
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Change Your Pin");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,20));
        text.setBounds(255, 300, 500, 35);
       image. add(text);
        
       JLabel pintext=new JLabel("New Pin:");
       pintext.setForeground(Color.WHITE);
       pintext.setFont(new Font("System",Font.BOLD,20));
       pintext.setBounds(160, 340, 180, 25);
       image. add(pintext);
       
        pinfield=new JPasswordField();
       pinfield.setFont(new Font("System",Font.BOLD,17));
       pinfield.setBounds(335,340,180,25);
       image.add(pinfield);
       
       JLabel rpintext=new JLabel("Re-Enter New Pin:");
        rpintext.setForeground(Color.WHITE);
        rpintext.setFont(new Font("System",Font.BOLD,20));
        rpintext.setBounds(160, 380, 180, 25);
       image. add(rpintext);
       
       repinfield=new JPasswordField();
       repinfield.setFont(new Font("System",Font.BOLD,17));
       repinfield.setBounds(335,380,180,25);
       image.add(repinfield);
       
       change=new JButton("Change");
       change.setBounds(355, 487, 150, 30);
      change.setFont(new Font("System",Font.BOLD,14));
      change.addActionListener(this);
       image.add(change);
       
       back=new JButton("Back");
       back.setBounds(355, 520, 150, 30);
      back.setFont(new Font("System",Font.BOLD,14));
      back.addActionListener(this);
       image.add(back);
       
       
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        
  
        
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() ==change){
            try{
                String npin=pinfield.getText();
                String rpin=repinfield.getText();
                
                if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null,"Enter Pin does not match");
                return;
                }
                
                if(npin.equals("")){
                    JOptionPane.showMessageDialog(null," Please Enter new pin:");
                      return;
                }
                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null," Please  Re-Enter new pin:");
                      return;
                }
                Conn  c=new Conn();
                String query1 = "update bank set pinnumber='"+rpin+"' where pinnumber='"+pinnumber+"'";
                String query2 = "update login set pin='"+rpin+"' where pin='"+pinnumber+"'";
                String query3 = "update signup3 set pin='"+rpin+"' where pin='"+pinnumber+"'";
                
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                
                 JOptionPane.showMessageDialog(null," Pin change successfully");
                 setVisible(false);
                 new Transactions(rpin).setVisible(true);
                
            }
           catch(Exception e){
                System.out.println(e);
           }
        }
        else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);     
    }
        
        
    }
    public static void main(String[]args){
        new PinChange("").setVisible(true);
    }
}
    

