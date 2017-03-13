/**
 * 
 */
package pack;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Satheesh
 *
 */
public class LoginBean {
	private String name;
	private String password;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	public String validate(String uname, String pwd){
		String name = null;
		try {
			name = (String) new UserDAO().validate(uname, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}

}
