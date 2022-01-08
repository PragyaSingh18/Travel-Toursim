
package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Loading extends JFrame implements Runnable{
    JProgressBar p;
    Thread t;
    String username; //
    public void run(){// run() is in Runnable class we just have to overwrite it.
        try{
            for(int i=1;i<=101;i++){
               int m=p.getMaximum(); // max value of progress bar      // 100
                int n=p.getValue(); //current value of progress bar         //32
                if(n<m){    //32<100
           // if the value has not reached 100. then we have to increase the value of bar.
                    p.setValue(p.getValue()+1);     //33
                }
        
               else{
                    i=101; // becoz when i value is 101 dashboard frame will open
                    setVisible(false);
                    new Dashboard(username).setVisible(true);
                    
                }
                Thread.sleep(50);
            }
        }
        catch(Exception e){}
    }
    Loading(String user){ // we make it a parametrized constructor to pass the name..
         username=user;
        t=new Thread(this);
        setBounds(700,250,700,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel l1=new JLabel("Travel And Tourism Application");
        l1.setBounds(70,20,600,40);
        l1.setFont(new Font("Raleway", Font.BOLD,35));
        l1.setForeground(Color.BLUE);
        add(l1);
        
        p=new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(100,100,400,25);
        add(p);
        
         JLabel l2=new JLabel("Please Wait.....");
        l2.setBounds(400,150,600,40);
        l2.setFont(new Font("Raleway", Font.BOLD,20));
        l2.setForeground(Color.RED);
        add(l2);
        
        
         JLabel l3=new JLabel("Welcome" +" "+ username);
        l3.setBounds(30,370,400,25);
        l3.setFont(new Font("Tahoma", Font.BOLD,15));
        l3.setForeground(Color.BLUE);
        add(l3);
        
        t.start();
        
        
    }
    
    public static void main(String args[]){
        new Loading("").setVisible(true); //we give it a empty string...
    }
}
