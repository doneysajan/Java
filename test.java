package JDBCprgm;

import java.sql.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
	Statement stmt = con.createStatement();
	String q="create table test00(tid varchar2(10),tname varchar2(10))"
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
