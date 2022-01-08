/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class About extends JFrame implements ActionListener {
    String s;
    JButton b1;
    About(){
        setBounds(800,240,900,600);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        JLabel l1=new JLabel("Travel And Tourism Management System");
        l1.setBounds(180,10,800,80);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma",Font.BOLD, 20));
        
        s="ABOUT PROJECT \n"+"\n"+"The objective of the Travel And Tourism Management System Project is to develop a system where user can find the worlds best Hotels and Travelling Destinations easily.\n "+
                "\n"+"This software will help user access the information about travel and tourism easily and reliably.\n"+"\n"+"Advantage of Project: \n"+"* Gives the accurate information. \n"+
                "* Simplifies the manual work. \n"+"* It minimizes the documentation realated work. \n"+"* Provides uptodate information. \n"+"* Friendly environment by providing reliable messages. \n"+
                "* Travellers details can be provided. \n"+"* Booking confirmation notification. \n";
                
        TextArea t1= new TextArea(s,10,40,Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20,100,800,300);
        add(t1);
        add(l1);
        b1=new JButton("Back");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(400,420,100,40);
        b1.addActionListener(this);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
        }
    }
    public static void main(String args[]){
        new About().setVisible(true);
    }
}
