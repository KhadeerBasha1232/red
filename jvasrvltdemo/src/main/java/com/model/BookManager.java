package com.model;
import java.sql.*;
import java.util.*;
public class BookManager
{
 Connection con = null;
 PreparedStatement ps = null;
 public List<Book> getDetails() throws Exception
{
  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/khadeer","root","khadeer12");
  ps = con.prepareStatement("select * from Book");
  ResultSet rs = ps.executeQuery();
  List<Book> L = new ArrayList<Book>();
  while(rs.next())
  {
    Book B = new Book();
    B.setBookid(rs.getInt(1));
    B.setTitle(rs.getString(2));
    B.setPrice(rs.getInt(3));
    L.add(B);
  }
  return L;
}
}