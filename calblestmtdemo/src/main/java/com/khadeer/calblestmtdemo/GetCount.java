package com.khadeer.calblestmtdemo;

import java.sql.*;


public class GetCount {
	public static void main( String[] args ) throws Exception
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/khadeer","root","khadeer12");
        //it calls the procedure created in database which is executed while running the program
        CallableStatement stmt = con.prepareCall("{CALL getCount(?)}");
        stmt.registerOutParameter(1,Types.INTEGER);
        stmt.execute();
        int count = stmt.getInt(1);
        System.out.println("Count : "+count);
        con.close();
    }
}
