/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Payment extends JFrame implements ActionListener{
    JButton b1,b2;
    Payment(){
       setBounds(650,200,800,700);
       setLayout(null);
       getContentPane().setBackground(Color.white);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel\\management\\system\\icons\\paytm.jpeg"));
       Image i2=i1.getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel l1=new JLabel(i3);
       l1.setBounds(100,100,600,500);
       add(l1);
       
        b1=new JButton("Pay");
       b1.setBounds(150,0,100,30);
       b1.setBackground(Color.blue);
       b1.setForeground(Color.white);
        b1.addActionListener(this);
       l1.add(b1);
       
        b2=new JButton("Back");
       b2.setBounds(350,0,100,30);
         b2.setBackground(Color.blue);
       b2.setForeground(Color.white);
       b2.addActionListener(this);
       l1.add(b2);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
          this.setVisible(false);
          new Paytm().setVisible(true);
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }
    public static void main(String args[]){
       new Payment().setVisible(true); 
    }
}
