package model;
/**
 * �û�ʵ����
 * @author Administrator
 *
 */
public class User {
	private int id;	//�û�id
	private String userName; 	//�û���
	private String password;	//�û�����
	
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
