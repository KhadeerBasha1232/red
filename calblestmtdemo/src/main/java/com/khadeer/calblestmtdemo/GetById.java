package com.khadeer.calblestmtdemo;

import java.sql.*;

public class GetById {

	public static void main( String[] args ) throws Exception
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/khadeer","root","khadeer12");
        //it calls the procedure created in database which is executed while running the program
        CallableStatement stmt = con.prepareCall("{CALL getDetailsById(?)}");
        stmt.setInt(1, 2);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()) {
        	System.out.println("Emp ID : "+rs.getInt(1)+"\tEmp Name : "+rs.getString(2)+"\tEmp Dept : "+rs.getString(3));
        }
        con.close();
    }

}
