
import java.io.File;
import java.io.FileInputStream;
         import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AGAMUYI PRECIOUS
 */
public class MyConnection {
    
       public static Connection getConnection(){
        Connection con  = null;
        
        try{
            
           try{
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost/fee receipt System","root","");
               
               
           }catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
               
           }
            
        }catch (Exception e){
            
        }
        return con;
    
}
       
       //insert image into db
       public Boolean add(File img,FileInputStream fis) 
       {
          try{ 
           String sql = "INSERT INTO image(Image) VALUES(?)";
           MyConnection.getConnection();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fee receipt system","root","");
            PreparedStatement pst; 
          pst= con.prepareStatement(sql);
           
           
           
            
           
           
           
       
       
 }  catch(Exception ex){
    Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE,null,ex);
     
 }    
           return null;
    
}
}