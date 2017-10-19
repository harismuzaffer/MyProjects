package jdbc_examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedStatementsDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		PreparedStatement pst= con.prepareStatement("insert into student2 values(?, ?)");
//		for(int i=0; i<3; i++){
//			pst.setInt(1, 1000+i);
//			pst.setString(2, "vijay"+i);
//			System.out.println(pst.executeUpdate());
//		}
//		pst= con.prepareStatement("update student2 set sname=? where sname=?");
//		pst.setString(1, "sanjay");
//		pst.setString(2, "vijay0");
//		System.out.println(pst.executeUpdate());
		pst= con.prepareStatement("delete from student2 where sid=?");
		pst.setInt(1, 1002);
		System.out.println(pst.executeUpdate());
		
		pst= con.prepareStatement("select * from student2 where sname=?");
		pst.setString(1, "vijay1");
		ResultSet r= pst.executeQuery();
		while(r.next()){
			System.out.print(r.getInt(1)+"\t");
			System.out.println(r.getString(2));
		}
		//System.out.println(r.getMetaData());
		pst.close();
		con.close();
	}

}
