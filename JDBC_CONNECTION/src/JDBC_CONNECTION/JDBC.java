
package JDBC_CONNECTION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

	public void createDatabase() {
			try {
				String url="jdbc:mysql://localhost:3306/";
				String db="connection";
				String userName="root";
				String password="9348933945";
				
				
				Connection con=DriverManager.getConnection(url,userName,password);
				System.out.println("connection sucessfully");
				
				String query="create database connection";
				Statement st=con.createStatement();
				System.out.println("database created sucessfully........");
				st.execute(query);
				con.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

	public void createTable() {
		try {
			String url="jdbc:mysql://localhost:3306/connection";
		//	String db="connection";
			String userName="root";
			String password="9348933945";
			
			
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("connection sucessfully");
			
			String query="create table jdbcc(name varchar(40),id int key,brach varchar(80))";
			Statement st=con.createStatement();
			System.out.println("table created sucessfully**********");
			st.execute(query);
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}		
	}

	public void createData() {
		try {
			String url="jdbc:mysql://localhost:3306/connection";
			//String db="connection";
			String userName="root";
			String password="9348933945";
			
			
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("connection sucessfully");
			
			String query="insert into jdbcc  (name,id,brach) values (?,?,?) ";
			PreparedStatement pst=con.prepareStatement(query);
			
			pst.setString(1, "rahul");
			pst.setInt(2, 78);
			pst.setString(3, "mca");
			pst.execute();
			
			
			
			System.out.println("data created sucessfully........");
			
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}		
	}

	public void readData() {
		try {
			String url="jdbc:mysql://localhost:3306/connection";
			//String db="connection";
			String userName="root";
			String password="9348933945";
			
			
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("connection sucessfully");
			
			String query="select*from jdbc";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next())
			{
				System.out.println("name \t="+rs.getString(1));
				System.out.println("id \t="+rs.getInt(2));
				System.out.println("branch \t="+rs.getString(3));

			}
			
			
			
			System.out.println("read data sucessfully........");
			
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace(); 
		}		
	}

	public void updatedata() {
		try {
			String url="jdbc:mysql://localhost:3306/connection";
			//String db="connection";
			String userName="root";
			String password="9348933945";
			
			
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("connection sucessfully");
			
			String query="update jdbc set name=? where id=? ";
			PreparedStatement pst=con.prepareStatement(query);
			
			pst.setString(1, "biswa");
			pst.setInt(2, 49);
			pst.execute();
			
			
			
			
			System.out.println(" update data sucessfully........");
			
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}		
	}

	public void deletedata() {
		try {
			String url="jdbc:mysql://localhost:3306/connection";
			//String db="connection";
			String userName="root";
			String password="9348933945";
			
			
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("connection sucessfully");
			
			String query="delete from jdbc where id=?";
			PreparedStatement pst=con.prepareStatement(query);
			
			//pst.setString(1, "biswaprakash");
			pst.setInt(1, 41);
			pst.execute();
			
			
			
			
			System.out.println(" delete data sucessfully........");
			
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}		
	}

}
