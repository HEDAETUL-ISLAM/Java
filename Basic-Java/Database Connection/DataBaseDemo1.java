import java.sql.*;
import java.util.*;

public class DataBaseDemo1 {

    public static void main(String[] args) throws SQLException {

        
         Statement statement = connection.createStatement();
        String query  = "insert into Student values(162,'rasel','modonpur','rasel@gmail.com')";
        statement.executeUpdate(query);
        
        ResultSet resultset = statement.executeQuery("select * from Student");
        
        while(resultset.next()){
        
            System.out.println(resultset.getInt("Id"));
            System.out.println(resultset.getString("Name"));
            System.out.println(resultset.getString("Address"));
            System.out.println(resultset.getString("Mail"));
        }
    }
    
}
