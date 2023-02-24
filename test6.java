package JDBCprgm;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*; 
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
	Statement stmt=con.createStatement();
	String q="create table student2(sid varchar2(10),sname varchar2(10),sage varchar2(10))"
			+ "";
	stmt.executeUpdate(q);
	System.out.println("Table created");
	con.close();
}
catch(Exception e)
{
	System.out.println(e);
}
	
	}

}
