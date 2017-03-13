package pack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO{
	public String validate(String uname, String pass) throws SQLException{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String str=null;
		try{
			con=DriverConnection.getConnection();
			stmt=con.createStatement();
			String query="select * from mvctable where name=\'"+uname+"\' and password=\'"+pass+"\'";
			rs =stmt.executeQuery(query);
			while (rs.next()) {
				str=rs.getString(3);
				
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		 return str;
	}
}