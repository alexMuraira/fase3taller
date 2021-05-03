/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.sql.*;
/**
 *
 * @author alex-
 */
public class Proyecto1 {

    Connection cn;
    Statement st;
    
    public Connection conexion(){
        try{
       Class.forName("com.mysql.jdbc.Driver");
      cn = DriverManager.getConnection("jdbc:mysql://localhost/caja","root","");
       System.out.println("se hizo la conexion bien");
        }catch(Exception e){
         System.out.println(e.getMessage());   
        }return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No soporto");
    }
    
    
}
