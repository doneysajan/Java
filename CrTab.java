package JDBCprgm;

import java.sql.*;

//create table emp(empid varchar2(10),empage number);
public class CrTab{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	   //Register the driver class-forName() method
	   Class.forName("oracle.java.driver.OracleDriver");//specify the db"
	   		Class.forName("oracle.jdbc.driver.OracleDriver");
	   		//Create a connection
	   		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca");
	   		
   //instance of the db, db username, 
	   		//Create sql stmt
	   		Statement stmt=con.createStatement();
	   		//execute stmt
	   		ResultSet rs=stmt.executeQuery("select * from project");
	   		
	   		//emp->empid,empage
	   		while(rs.next())
	   		{
	   			System.out.println();
	   			System.out.println();
	   		}
	   		}catch(Exception e) {System.out.println(e);}
	}
}
	   		
   
   
   
   
   
   
   
   
   
   }
   
   
   
   
   
   
   
   
	}

}
