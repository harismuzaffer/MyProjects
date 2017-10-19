package jdbc_examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement st= con.createStatement();
		st.executeUpdate("update student2 set sname='vijay' where sid=2");
		st.executeUpdate("insert into student2 values(13, 'farha')");
		System.out.println(st.executeUpdate("insert into student2 values(13, 'vijay')"));
		st.executeUpdate("delete from student2 where sname='farha'");
		st.executeUpdate("delete from student2 where sname='farha2'");
		ResultSet r= st.executeQuery("select * from student2");
		while(r.next()){
			System.out.print(r.getInt(1)+"\t");
			System.out.println(r.getString(2));
		}
		st.close();
		con.close();
	}

}
