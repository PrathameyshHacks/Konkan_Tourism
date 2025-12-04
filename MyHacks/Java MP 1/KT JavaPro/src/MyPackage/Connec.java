package MyPackage;

import java.sql.*;

public class Connec {

	Connection c ;
	Statement s ;
	PreparedStatement ps;

	Connec (){
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/konkantourism","root","pratal");
			
			s = c.createStatement();
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	public PreparedStatement prepareStatement(String string) {
		// TODO Auto-generated method stub
		
		try {
			ps = c.prepareStatement(string);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ps;
		
	}
	
	
	
}
