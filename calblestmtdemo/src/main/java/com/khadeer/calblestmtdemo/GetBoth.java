package com.khadeer.calblestmtdemo;
import java.sql.*;
public class GetBoth {

	public static void main(String[] args) throws Exception
	  {
	    String url = "jdbc:mysql://localhost:3306/khadeer";
	    String username = "root";
	    String password = "khadeer12";
	    Connection con = DriverManager.getConnection( url, username, password);
	    CallableStatement stmt = con.prepareCall( "{ CALL getDetailsByInOut(?,?) }" );
	    stmt.registerOutParameter(2, Types.INTEGER);
	    stmt.setInt(1, 1);
	    stmt.execute();
	    int c = stmt.getInt(2);
	    System.out.println("No. of record with given EmpId:" + c);
	      
	    con.close();
	  }

}
