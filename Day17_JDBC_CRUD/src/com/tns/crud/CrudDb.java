package com.tns.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudDb {

	//private static final String PreparedStatement = null;

	public static void main(String[] args)  {
		String dbURL="jdbc:mysql://127.0.0.1:3306/sample";
		String dbUserName="root";
		String dbPassword="Bharathi@1998";
		/*try
		{
		Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
		String sql = "update  Employee set user_name=?,password=? where user_id=?";
		PreparedStatement p=c. prepareStatement(sql);
		//p.setString(1,"101");
		p.setString(1,"Bharathi S");
		p.setString(2,"Bharathi@123");
		p.setInt(3, 101);
		int rows=p.executeUpdate();
		if(rows>0)
		{
			System.out.println("An existing user was updated successfully");
		}
		c.close();*/
		/*String sql = "INSERT INTO Employee (user_id,user_name, password,email) VALUES (?, ?, ?, ?)";
		PreparedStatement p=c. prepareStatement(sql);
		p.setString(1,"101");
		p.setString(2,"Bharathi");
		p.setString(3,"pass123");
		p.setString(4,"bharathi@gmail.com");
		int row = p.executeUpdate();
		    if (row > 0) 
		    {
		        System.out.println("A new user was inserted successfully!");
		    }
		    c.close();*/
		try
		{
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			String sql = "delete from  Employee where user_id=?";
			PreparedStatement p=c. prepareStatement(sql);
			p.setString(1,"101");
			int rows=p.executeUpdate();
			 if (rows> 0) 
			    {
			        System.out.println("A new user was deleted successfully!");
			    }
			    c.close();
		// String sql = "select* from Employee";
		// Statement st=c.createStatement();
		 //ResultSet rs=st.executeQuery(sql);
		 
		/* while(rs.next())
		 {
			 int id=rs.getInt(1);
			 String name=rs.getString(2);
			 String pass=rs.getString(3);
			 String email=rs.getString("email");
			 String res="User %d: %s - %s - %s";
			 System.out.println(String.format(res, id, name, pass, email));
		 }
		 c.close();*/
		 
		 }
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
