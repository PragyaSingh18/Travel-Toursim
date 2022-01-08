
package travel.management.system;
import java.sql.*;

public class Conn {
    Connection c;//creating object of connection class
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//it is a class in java with name Class. it has static method forname.this driver is inside mysql.jdbc library.
            c= DriverManager.getConnection("jdbc:mysql:///tnt","root","root"); //it is the connection string through which the connection is done.
            s=c.createStatement();//it is just function call.
          
            
        }catch(Exception e){
            
        }
    }
}
