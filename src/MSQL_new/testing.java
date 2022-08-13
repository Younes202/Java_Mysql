
package MSQL_new;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students_java","root","");
			Statement st = con.createStatement(); 
		}catch (Exception e)
		{
			System.out.println(e);
		}


	

	}
	

}


