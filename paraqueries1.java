package JDBCprgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.*;

public class paraqueries1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
	PreparedStatement pst=con.prepareStatement("insert into test values(?,?)");
	pst.setString(1, "t12");
	pst.setString(2, "test12");
	pst.executeUpdate();
	con.close();
}
catch(Exception e)
{
	System.out.println(e);
}
	}
}
	


