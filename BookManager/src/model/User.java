package model;
/**
 * 用户实体类
 * @author Administrator
 *
 */
public class User {
	private int id;	//用户id
	private String userName; 	//用户名
	private String password;	//用户密码
	
	public User() {}
	
	
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
