package JDBCprgm;

import java.sql.*;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
	Statement stmt = con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from test");
	ResultSetMetaData rm=rs.getMetaData();
	for(int i=1;i<rm.getColumnCount();i++)
	{
		System.out.println(rm.getColumnName(i)+"");
	}
	System.out.println("------------");
	while(rs.next());
	{
		for(int j=1;j<rm.getColumnCount();j++)
		{
			System.out.println(rs.getString(j)+"");
		}
		System.out.println("values updated");
		con.close();
	}
	}
			
			
catch(Exception e)
{
	System.out.println(e);
}
	}

}
