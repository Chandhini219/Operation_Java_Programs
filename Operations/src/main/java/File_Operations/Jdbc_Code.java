package File_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Code {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://vijayakumar@localhost/sample");
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery("select *from samples");
		while(rs.next())
		{
			System.out.println("Name:"+rs.getString(0)+"Age:"+rs.getString(1));
		}

	}

}
