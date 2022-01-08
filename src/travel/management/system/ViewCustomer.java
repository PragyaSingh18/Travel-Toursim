package travel.management.system;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class ViewCustomer extends JFrame implements ActionListener{
    
    
   
    JButton b1;
   ViewCustomer(String username){
     setBounds(600,250,900,600);
       getContentPane().setBackground(java.awt.Color.WHITE);
       setLayout(null);
       
      
     JLabel l1=new JLabel("Username");
    l1.setBounds(30,50,150,30);
    add(l1);
    
   JLabel l11=new JLabel();
    l11.setBounds(220,50,150,30);
    add(l11);
    
    JLabel l2=new JLabel("ID");
    l2.setBounds(30,100,150,30);
    add(l2);
    
    JLabel l12=new JLabel();
    l12.setBounds(220,100,150,30);
    add(l12);
    
    JLabel l3=new JLabel("Number : ");
    l3.setBounds(30,150,150,30);
    add(l3);
    
    JLabel l13=new JLabel();
    l13.setBounds(220,150,150,30);
    add(l13);
    
     JLabel l4=new JLabel("Name : ");
    l4.setBounds(30,200,150,30);
    add(l4);
    
     JLabel l14=new JLabel();
    l14.setBounds(220,200,150,30);
    add(l14);
    
     JLabel l5=new JLabel("Gender : ");
    l5.setBounds(30,250,150,30);
    add(l5);
    
  JLabel l15=new JLabel();
    l15.setBounds(220,250,150,30);
    add(l15);
    
      JLabel l6=new JLabel("Country : ");
    l6.setBounds(500,50,150,30);
    add(l6);
    
    JLabel l16=new JLabel();
    l16.setBounds(700,50,150,30);
    add(l16);
    JLabel l7=new JLabel("Address : ");
    l7.setBounds(500,100,150,30);
    add(l7);
    
    JLabel l17=new JLabel();
    l17.setBounds(700,100,150,30);
    add(l17);
    
    JLabel l8=new JLabel("Phone : ");
    l8.setBounds(500,150,150,30);
    add(l8);
    
    JLabel l18=new JLabel();
    l18.setBounds(700,150,150,30);
    add(l18);
    
     JLabel l9=new JLabel("Email : ");
    l9.setBounds(500,200,150,30);
    add(l9);
    
    
  JLabel l19=new JLabel();
    l19.setBounds(700,200,150,30);
    add(l19);
    
    
    
    b1=new JButton("Back");
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    b1.setBounds(270,300,130,35);
    
    b1.addActionListener(this);
    add(b1);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel\\management\\system\\icons\\viewall.jpg"));
    Image i2=i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel l10=new JLabel(i3);
    l10.setBounds(30,300,400,300);
    add(l10);
    
     ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("travel\\management\\system\\icons\\viewall.jpg"));
    Image i5=i4.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
    ImageIcon i6=new ImageIcon(i5);
    JLabel l20=new JLabel(i6);
    l20.setBounds(430,300,390,300);
    add(l20);
    
    try{
        Conn c=new Conn();
        ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'"); // we need to find data from customer where username is Pragya.
        while(rs.next()){
            l11.setText(rs.getString("username"));
            l12.setText(rs.getString("id"));
              l13.setText(rs.getString("number"));
              l14.setText(rs.getString("name"));
              l15.setText(rs.getString("gender"));
              l16.setText(rs.getString("country"));
               l17.setText(rs.getString("address"));
               l18.setText(rs.getString("phone"));
               l19.setText(rs.getString("email"));
        }
    }catch(Exception e){}
    
    
    }
    public void actionPerformed(ActionEvent ae){
      
           
        if(ae.getSource()==b1){
           this.setVisible(false);
       } 
        
        
        
        
    }
    public static void main(String args[]){
        new  ViewCustomer("").setVisible(true);
    }
}

