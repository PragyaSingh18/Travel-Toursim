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
public class CheckHotels extends JFrame implements Runnable {
    Thread t1;
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;//in these labels images are stored
        JLabel[] label=new JLabel[]{ l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
        JLabel caption;
   public void run(){
       String[] text=new String[]{"JW Marriot Hotel","Manderian Oriental Hotel","Four Seasons Hotel","Radison Hotel","Classic Hotel","The Bay Club Hotel","Breeze Blow Hotel","Quick Step Hotel","Happy Morning Hotel","Moss View Hotel"};
       try{
      for(int i=0;i<=9;i++){
          this.label[i].setVisible(true);
          caption.setText(text[i]);
          this.label[i].setVisible(true);
          Thread.sleep(2800);
          this.label[i].setVisible(false);
      } 
       }catch(Exception e){}
   }
    CheckHotels (){
        setBounds(650,240,900,700);
         ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
    ImageIcon[] image =new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
    
    Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
    Image[] jimage=new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
    
      ImageIcon i11=null,i12=null,i13=null,i14=null,i15=null,i16=null,i17=null,i18=null,i19=null,i110=null;
    ImageIcon[] image1 =new ImageIcon[]{i11,i12,i13,i14,i15,i16,i17,i18,i19,i110};
    
    caption= new JLabel();
    caption.setBounds(50,550,1000,70);
    caption.setForeground(Color.white);
    caption.setFont(new Font("Tahoma",Font.BOLD,50));
    add(caption);
        for(int i=0;i<=9;i++){
         image[i]=new ImageIcon(ClassLoader.getSystemResource("travel\\management\\system\\icons\\hotel"+(i+1)+".jpg"));
        jimage[i]=image[i].getImage().getScaledInstance(900,700,Image.SCALE_DEFAULT);
        image1[i]=new ImageIcon(jimage[i]);
         this.label[i]=new JLabel(image1[i]);
        this.label[i].setBounds(0,0,900,700);
        add(this.label[i]);
        
    }
        t1=new Thread(this); // whenever we make object of thread class explicitly then we have to give reference of current class.Otherwise it will not call run method.
        t1.start();
    }
    
    public static void main(String args[]){
        new CheckHotels().setVisible(true);
    }
}
