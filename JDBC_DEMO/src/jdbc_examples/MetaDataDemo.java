package jdbc_examples;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class MetaDataDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		
		DatabaseMetaData dmd= con.getMetaData();
		
		//System.out.println(dmd.getDriverName()+"\n"+dmd.getDriverVersion()+"\n"+dmd.getUserName()+"\n"+dmd.getDatabaseProductName());
		
		PreparedStatement pst= con.prepareStatement("select * from student2");
		ResultSet r= pst.executeQuery();
		ResultSetMetaData rm= r.getMetaData();
		
		System.out.println(rm.getColumnCount()+"\n"+rm.getColumnName(1)+"\n"+rm.getColumnTypeName(1));
		
		con.close();
	}

}
