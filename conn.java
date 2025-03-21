package project1;
import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;*/
public class conn {
    Connection connection;
    Statement statement;
   public conn(){
       try{
           connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","AKB9@9@2005");
           statement=connection.createStatement();
       }catch(Exception e){
           System.out.println(e);
       }
   }
}

