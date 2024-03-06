package com.edu;
/*
 * Register the driver class
Creating connection
Creating statement
executing queries
Closing connection
 * 
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClassDataBase {

	public static void main(String[] args) throws SQLException {
		String driver="com.mysql.cj.jdbc.Driver"; //Driver class
		String url="jdbc:mysql://localhost:3306/studentdatabase";
		String un="root";
		String up="root";
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			Class.forName(driver); //load the driver at run time, register 
			conn = DriverManager.getConnection(url,un,up); //create the connection
			st=conn.createStatement(); //Creating statement
			System.out.println(conn);
			String sel="select * from student";
			
			  rs=st.executeQuery(sel);
			System.out.println(rs);
			  System.out.println("sid\tsname\tcid\tfees");
			  
			  while(rs.next()) {
				  
				  int sn=rs.getInt(1);// or rs.getInt("sid");
				  String sname=rs.getString(2);//or rs.getString("sname");
				  int cid=rs.getInt(3); //or rs.getInt("cid");
				  float fs=rs.getFloat(4); //rs.getFloat("fees");
				  System.out.println(sn+"\t"+sname+"\t"+cid+"\t"+fs);
			  }
			 }catch(Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}

	}

}

