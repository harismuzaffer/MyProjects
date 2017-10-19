package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		Statement st= con.createStatement();
		ResultSet r= st.executeQuery("select * from departments");
		while(r.next()){
			System.out.print(r.getString(2)+"\t");
			System.out.println(r.getInt(1));
		}
		st.close();
		con.close();
	}

}
