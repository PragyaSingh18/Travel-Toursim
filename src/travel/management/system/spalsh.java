
package travel.management.system;
import javax.swing.*;

import java.awt.*;
public class spalsh {
    public static void main(String args[]){
     SplashFrame frame=new SplashFrame();
      frame.setVisible(true);
      int x=1;
      for(int i=0;i<=700;i+=6,x+=7){
      frame.setLocation(950-(x+i)/2,500-(i/2)); //to change the location of the jframe    
       frame.setSize(x+i,i);
    
     try{
         Thread.sleep(10);
         
     }
     catch(Exception e){
    }
      frame.setVisible(true);
    }
}
}

 class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    SplashFrame(){
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel\\management\\system\\icons\\splash.jpg")); // creating imageicon class object. Classloader is used to get system resource.
       Image i2=i1.getImage().getScaledInstance(1600, 700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
       JLabel l1=new JLabel(i1); //u can't add imageicon in frame hence put it into label.
        add(l1);
        
       
       //setBounds(200,200,1600,700); //it takes location and size.
       t1=new Thread(this);
       t1.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            new Login().setVisible(true);
        }
        catch(Exception e){
            //-----
        }
    }
}