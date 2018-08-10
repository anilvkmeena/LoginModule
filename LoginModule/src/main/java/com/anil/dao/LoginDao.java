package com.anil.dao;
import java.sql.*;

public class LoginDao {
	String url = "jdbc:mysql://localhost:3306/login";
	String sql = "select * from uinfo where uname= ? and pass = ?";
	
	public boolean check(String uname,String pass)
	{
		
		
		try {
			//System.out.println("hello 1");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("hello 2");
			Connection con = DriverManager.getConnection(url, "root", "root");
			System.out.println("hello 3");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			System.out.println("hello 4");
			
			ResultSet rs = st.executeQuery();
			System.out.println("hello 5");
			if(rs.next())
			{
				return true;
			}
		} 
		catch (Exception e) {
			System.out.println("hello 6");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
