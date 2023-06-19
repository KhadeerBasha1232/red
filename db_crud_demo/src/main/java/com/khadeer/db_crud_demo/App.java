package com.khadeer.db_crud_demo;
import java.sql.*;
public class App
{
  public static void main(String[] args) throws Exception
  {
    String url = "jdbc:mysql://localhost:3306/khadeer";
    String username = "root";
    String password = "Khajavali12@";
    Connection con = DriverManager.getConnection( url, username, password);
    Statement stmt = con.createStatement();
    String sqlqry = "insert into students values(1005, 'akv')";
    stmt.executeUpdate(sqlqry);
    System.out.println("Record Inserted.....");
    String sqlqry1 = "update students set name='vel' where rollno=1005";
    stmt.executeUpdate(sqlqry1);
    System.out.println("Record Updated.....");
    String sqlqry2 = "delete from students where rollno=1005";
    stmt.executeUpdate(sqlqry2);
    System.out.println("Record Deleted.....");
    ResultSet rs = stmt.executeQuery( "select * from students");
    while(rs.next())
    {
      System.out.println("Roll No:" + rs.getInt(1));
      System.out.println("Name:" + rs.getString(2));
    }

    con.close();
  }
}
