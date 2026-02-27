package bank.management.system;

import java.sql.*; // SQL library imported
public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try{
            // STEP 1. To Register the Driver
            //Class.forName(com.mysql.cj.jdbc.Driver); we do not need to register the driver anymore
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "@sql7bip");
            // STEP 2. Create connection
            // DriverManager Class, getConnection function
            // Generally mql runs on local host and port no.3306
            // Database name: bankmanagementsystem, mysqlusername: root, mysql pass: @sql7bip 
            
            s = c.createStatement(); // STEP 3. Create Statement
        }
        catch(Exception e){
            System.out.println(e);
            
        }
            
    }
}
