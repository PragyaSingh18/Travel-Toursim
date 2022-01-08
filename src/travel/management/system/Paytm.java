/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;
import java.awt.event.*;
import javax.swing.*;
public class Paytm extends JFrame implements ActionListener{
     JButton b1;
    Paytm(){
        JEditorPane j=new  JEditorPane(); // you can edit in editor pane
        j.setEditable(false);
        try{
            j.setPage("https://paytm.com/credit-card-bill-payment");
          
            
        }catch(Exception e){  
            j.setContentType("text/html");
          j.setText("<html> Could not Fetch </html>");
        }
        JScrollPane js=new JScrollPane(j);
        getContentPane().add(js);
      
    
        b1=new JButton("Back");
        b1.setBounds(500,20,120,60);
        b1.addActionListener(this);
         j.add(b1);
        setBounds(670,240,800,600);
    }
    public  void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Payment().setVisible(true);
    }
    public static void main(String args[]){
        new Paytm().setVisible(true);
    }
}
