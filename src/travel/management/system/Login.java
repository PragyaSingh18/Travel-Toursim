
package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    
    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField t2;
    Login(){
        //setSize(100,200); /* both these methods are in jframe class */
       //bydefault visibility is false.
         setBounds(550,250,900,500); // first 2 are location and next 2 are size of frame.
        setLayout(null); //borderlayout,gridlayout we have to make it null as to create our own components on frame.
        
        getContentPane().setBackground(Color.WHITE);
        JPanel p1=new JPanel(); //it does the same as div tag in html.
        p1.setBackground(new Color(131,193,233));  //color object is created becoz it is a component. color is given in rgb value.
        
        p1.setLayout(null);
        p1.setBounds(50,0,400,400);
        add(p1); //we have to add component on frame.
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel\\management\\system\\icons\\login.png"));
        Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(100,120,200,200); //now l1 is added on p1 frame.
       p1.add(l1);
       
       JPanel p2=new JPanel();
       p2.setLayout(null);
       p2.setBounds(400,0,430,400);
       add(p2);
       
        JLabel l2=new JLabel("Username"); //we add component on frame with labels.
        l2.setBounds(60,20,100,25);
        l2.setFont(new Font("SAN_SHERIF",Font.PLAIN,20));
        p2.add(l2);
        
        t1=new JTextField();
        t1.setBounds(60,60,300,30);
        t1.setBorder(BorderFactory.createEmptyBorder()); // to remove border from text field borderfactory is a class
        p2.add(t1);
        
         JLabel l3=new JLabel("Password"); //we add component on frame with labels.
        l3.setBounds(60,110,100,25);
        l3.setFont(new Font("SAN_SHERIF",Font.PLAIN,20));
        p2.add(l3);
        
        t2=new  JPasswordField(); // for character in password form.
        t2.setBounds(60,150,300,30);
        t2.setBorder(BorderFactory.createEmptyBorder()); // to remove border from text field borderfactory is a class
        p2.add(t2);
        
         b1= new JButton("Login");
        b1.setBounds(60,230,130,30);
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.WHITE);
            b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        p2.add(b1);
        
        
         b2= new JButton("SignUp");
        b2.setBounds(230,230,130,30);
         b2.setBackground(new Color(133,193,233));
        b2.setForeground(Color.WHITE);
            b2.setBorder(new LineBorder(new Color(133,193,233)));
            b2.addActionListener(this);
        p2.add(b2);
        
         b3= new JButton("Forget Password");
        b3.setBounds(130,300,150,30);
         b3.setBackground(new Color(133,193,233));
        b3.setForeground(Color.WHITE);
            b3.setBorder(new LineBorder(new Color(133,193,233)));
            b3.addActionListener(this);// if we want to perform some action then we have to add this function with the object of the class.
        p2.add(b3);
        
        JLabel l4=new JLabel("Trouble in Login....");
        l4.setBounds(300,300,100,20);
        p2.add(l4);
        
         setVisible(true); 
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
           
            try{
                String username=t1.getText();
                  String password=t2.getText();
                  String sql="select * from account where username='"+username+"'AND password='"+password+"'";
                  Conn c=new Conn();
                  ResultSet rs=c.s.executeQuery(sql);
                  if(rs.next()){
                      this.setVisible(false);
                      new Loading(username).setVisible(true); // we are passing username in loading
                  }
                  else{
                      JOptionPane.showMessageDialog(null, "Invalid Login");
                  }
            }catch(Exception e){}
            
            
            
            
            
            
        }else if(ae.getSource()==b2){
            new SignUp().setVisible(true);// here signup constructor will be called and visibility is true
            this.setVisible(false);// we want to close login form when signup form opens. hence we make its visibility false.
        }else if(ae.getSource()==b3){
            
            this.setVisible(false);
            new ForgetPassword().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Login();
    }
}
