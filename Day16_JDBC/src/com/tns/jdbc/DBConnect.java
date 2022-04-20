package com.tns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBConnect {

	public static void main(String[] args) {
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://127.0.0.1:3306/Capgemini1";
		String dbUserName="root";
		String dbPassword="Bharathi@1998";
		String query="select*from EnggStud1";
		try 
		 {
			 Class.forName(dbDriver);
		 }
		 catch(ClassNotFoundException e)
		 {
			 e.printStackTrace();
	     }
		try
		 {
			Connection con=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			 Statement st=con.createStatement();
			 ResultSet rs=st.executeQuery(query);
			 while(rs.next())
			 {
				 String Stud_data=" ";
				 for(int i=1;i<2;i++)
				 {
					 Stud_data=Stud_data+" "+rs.getString(i); 
				 }
				 System.out.println(Stud_data);
			 }
		 }
		catch(SQLException e)
		{
			System.out.println("An arror occured,May be password/Username invalid");
			e.printStackTrace();
		}
	}

}
