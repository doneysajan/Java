package JDBCprgm;

import java.sql.*;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
	Statement stmt = con.createStatement();
	
	String q=("insert into test values('t03','test3')");
	
	stmt.executeUpdate(q);
	System.out.println("values inserted");
	con.close();
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
