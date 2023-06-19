package com.khadeer.prepstmtdemo;
import java.sql.*;
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/khadeer","root","khadeer12");
          PreparedStatement p = con.prepareStatement("insert into employee values(?,?,?)");
          p.setInt(1,4);
          p.setString(2, "jp");
          p.setString(3, "CSE");
          p.execute();
          System.out.println("Row inserted...");
         
          PreparedStatement p1 = con.prepareStatement("update employee set name=? where roll=?");
          p1.setInt(2,4);
          p1.setString(1, "Prakash");
          p1.execute();
          System.out.println("Row Updated..."); 
          
          PreparedStatement p2 = con.prepareStatement("delete from employee where roll=?");
          p2.setInt(1,4);
          p2.execute();
          System.out.println("Row Deleted...");
          
          PreparedStatement p3 = con.prepareStatement("select * from employee where roll= ? ");
          p3.setInt(1,4 );
          ResultSet rs =  p3.executeQuery();
          if(rs.next())
          {
            System.out.println("roll:" + rs.getInt(1));
            System.out.println("Name:" + rs.getString(2));
          }
          else
          {
            System.out.println("Record not found");
          }
          
          
          con.close();
    }
}
