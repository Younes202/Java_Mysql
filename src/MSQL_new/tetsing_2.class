package Java_Mysql_Delete;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner input = new Scanner(System.in);


	      try {
	    	  
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students_java","root","");
 
			System.out.println("Write Name of student  to delete it :");
			String Name = input.nextLine();		
	        String sql = "DELETE  FROM STD WHERE Name = "+Name+"";
		    Statement st = con.createStatement();	
	        st.executeUpdate(sql);	  
	        
	       System.out.println("Deleting of  Student : "+Name+" Effected in data base ");
	       
	      }catch (Exception e) {
	  		// TODO Auto-generated catch block
	    	  System.out.println(e);
	      
		}
	 

	}
}
