package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void testA() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/sel";
		String un="root";
		String pw="sql@123";
		
		//connection to DB
		Connection con= DriverManager.getConnection(url, un, pw);
		
		//To send the query to DB
		Statement stmt = con.createStatement();
		
		//send the query to DB and get the record
		ResultSet res = stmt.executeQuery("select * from empinfo where Name='spandana'");
		
		while(res.next())
		{
			String name = res.getString("Name");
			Reporter.log("Name is:"+name,true);
			String id = res.getString("Id");
			Reporter.log("id is:"+id,true);
			String dept = res.getString("Dept");
			Reporter.log("Dept is:"+dept,true);
			String gender = res.getString("Gender");
			Reporter.log("gender is:"+gender,true);
			String name1 = res.getString(1);
			Reporter.log("name is:"+name1,true);
			}
		// to disconnect
		con.close();
		}

}
