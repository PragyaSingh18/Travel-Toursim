
package travel.management.system;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class SignUp extends JFrame implements ActionListener {
    JButton b1,b2;// we have declared it globally as to access it in actionListener class.
    JTextField t1,t2,t3,t4;
    Choice c1;
    SignUp(){
        setBounds(600,250,900,400);
        getContentPane().setBackground(Color.WHITE); //Contentpane is for the whole frame
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1=new JLabel("Username");
        l1.setFont(new Font("Tahoma",Font.BOLD,16));//font function
        l1.setBounds(40,20,100,25);
        p1.add(l1);
        t1=new  JTextField();
        t1.setBounds(200,20,200,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        add(t1);
        
         JLabel l2=new JLabel("Name");
        l2.setFont(new Font("Tahoma",Font.BOLD,16));//font function
        l2.setBounds(40,65,100,25);
        p1.add(l2);
        
        t2=new  JTextField();
        t2.setBounds(200,65,200,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        add(t2);
        
        
         JLabel l3=new JLabel("Password");
        l3.setFont(new Font("Tahoma",Font.BOLD,16));//font function
        l3.setBounds(40,110,100,25);
        p1.add(l3);
        
         t3=new  JTextField();
        t3.setBounds(200,110,200,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        add(t3);
        
         JLabel l4=new JLabel("Security Question");
        l4.setFont(new Font("Tahoma",Font.BOLD,16));//font function
        l4.setBounds(40,155,150,25);
        p1.add(l4);
        
         c1=new Choice();
        c1.add("Your fav character from TVD");
        c1.add("Your pet name");
        c1.add("Where you were born");
        c1.add("Your almamater");
        c1.setFont(new Font("Tahoma",Font.PLAIN,14));
          c1.setBounds(200,155,200,25);
          
        p1.add(c1);
        
        JLabel l5=new JLabel("Answer");
        l5.setFont(new Font("Tahoma",Font.BOLD,16));//font function
        l5.setBounds(40,200,100,25);
        p1.add(l5);
        
         t4=new  JTextField();
        t4.setBounds(200,200,200,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        add(t4);
        
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel\\management\\system\\icons\\signup.png"));
        Image i2=i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l6=new JLabel(i3);
        l6.setBounds(580,50,250,250);
        add(l6);
        
        
        b1=new JButton("Create");
        b1.setBounds(90,257,100,30);
      b1.addActionListener(this);
        p1.add(b1);
        
          b2=new JButton("Back");
        b2.setBounds(280,255,107,31);
        b2.addActionListener(this);
        p1.add(b2);
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
           
        String username=t1.getText();
             String name=t2.getText();
             String password=t3.getText();
             String security=c1.getSelectedItem();
             String answer=t4.getText();
            
            
            String  query="INSERT INTO account values('"+username+"', '"+name+"','"+password+"','"+security+"','"+answer+"')";   
          
            try{
               
                Conn c=new Conn();//database class
           
               
                c.s.executeUpdate(query);//it is for adding data into table.
                JOptionPane.showMessageDialog(null, "Account created");
                
                
                this.setVisible(false);
                new Login().setVisible(true);
            }catch (Exception e){
                
                
            }   
        
            
            
            
        }else if(ae.getSource()==b2){
            this.setVisible(false);
            new Login().setVisible(true);
            
        }
    }
    
    
    
    public static void main(String args[]){
        new SignUp().setVisible(true);
    }
}
