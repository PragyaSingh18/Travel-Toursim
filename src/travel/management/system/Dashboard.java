/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
        JButton b13,b14,b1,b2,b3,b5,b6,b7,b8,b9,b10,b11,b12,b15,b4;
        String username;
    Dashboard(String username){
        this.username=username; //we are passing username consructor parameter in username global variable 
        setExtendedState(JFrame.MAXIMIZED_BOTH); //it sets the screen size to the actual size of laptop...which is 2000*2000
        
        // if you have declared a variable global and local both then you need to remove the local declaration otherwise think as global variable to be null
        JPanel p1=new JPanel();
        p1.setBounds(0,0,2000,60);
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        add(p1);
        
        JLabel l3=new JLabel("Dashboard");
        l3.setFont(new Font("Tahoma",Font.BOLD,30));
        l3.setForeground(Color.WHITE);
        l3.setBounds(80,10,300,40);
        p1.add(l3);
        
         JPanel p2=new JPanel();
        p2.setBounds(0,50,300,2000);
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        add(p2);
        
         b1=new JButton("Add Personal Details");
        b1.setBackground(new Color(0,0,102));
        b1.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b1.setForeground(Color.WHITE);
        b1.setBounds(0,10,300,50);
        b1.addActionListener(this);
        p2.add(b1);
        
        
        
         b2=new JButton("Update Personal Details");
        b2.setBackground(new Color(0,0,102));
        b2.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b2.setForeground(Color.WHITE);
        b2.setBounds(0,60,300,50);
        b2.addActionListener(this);
        p2.add(b2);
        
          b3=new JButton("View Details");
        b3.setBackground(new Color(0,0,102));
        b3.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b3.setForeground(Color.WHITE);
        b3.setBounds(0,110,300,50);
         b3.addActionListener(this);
        p2.add(b3);
        
          b4=new JButton("Delete Personal Details");
        b4.setBackground(new Color(0,0,102));
        b4.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b4.setForeground(Color.WHITE);
        b4.setBounds(0,160,300,50);
         b4.addActionListener(this);
        p2.add(b4);
        
          b5=new JButton("Check Package");
        b5.setBackground(new Color(0,0,102));
        b5.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b5.setForeground(Color.WHITE);
        b5.setBounds(0,210,300,50);
          b5.addActionListener(this);
        p2.add(b5);
        
         b6=new JButton("Book Package");
        b6.setBackground(new Color(0,0,102));
        b6.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b6.setForeground(Color.WHITE);
        b6.setBounds(0,260,300,50);
          b6.addActionListener(this);
        p2.add(b6);
        
          b7=new JButton("View Package");
        b7.setBackground(new Color(0,0,102));
        b7.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b7.setForeground(Color.WHITE);
        b7.setBounds(0,310,300,50);
            b7.addActionListener(this);
        p2.add(b7);
        
          b8=new JButton("View Hotels");
        b8.setBackground(new Color(0,0,102));
        b8.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b8.setForeground(Color.WHITE);
        b8.setBounds(0,360,300,50);
        b8.addActionListener(this);
        p2.add(b8);
        
        b9=new JButton("Book Hotel");
        b9.setBackground(new Color(0,0,102));
        b9.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b9.setForeground(Color.WHITE);
        b9.setBounds(0,410,300,50);
            b9.addActionListener(this);
        p2.add(b9);
        
          b10=new JButton("View Booked Hotel Details");
        b10.setBackground(new Color(0,0,102));
        b10.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b10.setForeground(Color.WHITE);
        b10.setBounds(0,460,300,50);
             b10.addActionListener(this);
        p2.add(b10);
        
          b11=new JButton("Destination");
        b11.setBackground(new Color(0,0,102));
        b11.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b11.setForeground(Color.WHITE);
        b11.setBounds(0,510,300,50);
        b11.addActionListener(this);
        p2.add(b11);
        
        b12=new JButton("Payment");
        b12.setBackground(new Color(0,0,102));
        b12.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b12.setForeground(Color.WHITE);
        b12.setBounds(0,560,300,50);
        b12.addActionListener(this);
        p2.add(b12);
        
         b13=new JButton("Calculator");
        b13.setBackground(new Color(0,0,102));
        b13.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b13.setForeground(Color.WHITE);
        b13.setBounds(0,610,300,50);
        b13.addActionListener(this);
                
        p2.add(b13);
        
         b14=new JButton("Notepad");
        b14.setBackground(new Color(0,0,102));
        b14.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b14.setForeground(Color.WHITE);
        b14.setBounds(0,660,300,50);
        b14.addActionListener(this);
        p2.add(b14);
        
          b15=new JButton("About");
        b15.setBackground(new Color(0,0,102));
        b15.setFont(new Font("Tahoma",Font.PLAIN, 20));
        b15.setForeground(Color.WHITE);
        b15.setBounds(0,710,300,50);
          b15.addActionListener(this);
        p2.add(b15);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("travel\\management\\system\\icons\\dashboard.jpg"));
        Image i5=i4.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(0,0,70,70);
        p1.add(l2);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel\\management\\system\\icons\\home.jpg"));
        Image i2=i1.getImage().getScaledInstance(2000,2000, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,2000,2000);
        add(l1);
        
        JLabel l4= new JLabel("Travel And Tourism Management");
        l4.setBounds(700,80,1000,80);
        l4.setFont(new Font("Tahoma", Font.BOLD,55));
        l4.setForeground(Color.red);
        l1.add(l4); //becoz on l1 panel we have to stick this label...
        
        //b1.setMargin(new Insets(top,left,bottom,right)....it is a function in which we have to make object of inset class
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b13){
            try{
            Runtime.getRuntime().exec("calc.exe"); //iIn Runtime class there is a method getruntime in which we call exec function. in which we have to give the address of calc executable file.
                
                
            }catch(Exception e){}
        }
        else if(ae.getSource()==b14){
             try{
            Runtime.getRuntime().exec("notepad.exe");
                
                
            }catch(Exception e){}
        }else if(ae.getSource()==b1){
            new AddCustomer(username).setVisible(true); //username is passed into addcustomer class
        }else if(ae.getSource()==b2){
            new UpdateCustomer(username).setVisible(true);
    } else if(ae.getSource()==b3){
            new ViewCustomer(username).setVisible(true); 
    
    }else if(ae.getSource()==b5){
            new CheckPackage().setVisible(true);
    
    }else if(ae.getSource()==b6){
            new BookPackage(username).setVisible(true);
        
    }else if(ae.getSource()==b7){
            new ViewPackage(username).setVisible(true);
    }else if(ae.getSource()==b8){
            new CheckHotels().setVisible(true);
    }else if(ae.getSource()==b11){
           
             new Destinations().setVisible(true);
    }else if(ae.getSource()==b9){
           
             new BookHotel(username).setVisible(true);
    }else if(ae.getSource()==b10){
           
             new ViewBookedHotel(username).setVisible(true);
    }else if(ae.getSource()==b12){
           
             new Payment().setVisible(true);
    }else if(ae.getSource()==b15){
           
             new About().setVisible(true);
    }else if(ae.getSource()==b4){
           
             new DeleteCustomer(username).setVisible(true);
    }
    }
    public static void main(String args[]){
        new Dashboard("").setVisible(true);
    }
    
}
