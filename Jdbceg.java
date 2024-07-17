import java.sql.*;
class Jdbceg
{
 public static void main(String args[])
 {
 try
 {
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
  Statement stmt=con.createStatement();
  ResultSet rs=stmt.executeQuery("Select * from student");
 while(rs.next())
  {
         System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3) +"  "+ rs.getInt(4));
  }
   con.close();
  }
  catch(Exception e)
  { 
   System.out.println(e);
  } }}
