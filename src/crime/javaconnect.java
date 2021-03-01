/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crime;

/**
 *
 * @author Prashanth.M
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {

 public static Connection ConnecrDb(){
     try{
          Connection conn;
        Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","mysql");
        return conn;
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
     }
 }
}
