package JDBCprgm;

import java.sql.*;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
	Statement stmt = con.createStatement();
	String q=("update test set tid='t04' where tid='t12'");
	stmt.executeUpdate(q);
	System.out.println("row deleted");
	con.close();
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
