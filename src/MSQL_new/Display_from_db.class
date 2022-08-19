
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
			ResultSet res = st.executeQuery("select *from std"); 
			while(res.next()){
				System.out.println("Id" + res.getInt(1) + "---  Name :  "+ res.getString(2)+ "---- Age : "+res.getInt(3) +"----- Phone : "+res.getString(4)); 
			}
		}catch (Exception e) 
		{
			// TODO Auto-generated catch block System.out.println(e);
				    	  System.out.println(e);

		}

	}
	

}


