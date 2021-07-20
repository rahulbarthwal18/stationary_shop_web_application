package com.connection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class econn {
    private static Connection con;
    public static Connection getConnection() throws SQLException
    {
      try
      {   if(con==null){
          Class.forName("com.mysql.jdbc.Driver");
                
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stationary","root","");
      }
          
      }catch(Exception e){
          e.printStackTrace();
      }
      return con;
    }
    
    
}
