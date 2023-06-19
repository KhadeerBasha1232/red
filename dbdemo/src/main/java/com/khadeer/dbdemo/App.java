package com.khadeer.dbdemo;
import java.sql.*;
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	String url = "jdbc:mysql://localhost:3306/khadeer";
        Connection con = DriverManager.getConnection(url,"root","Khajavali12@");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from students");
        while(rs.next()) {
        	System.out.println("Roll No : "+rs.getInt(1)+"\t Name : "+rs.getString(2));
        }
        con.close();
    }
}
