package util;
/**
 * ���ݿ⹤����
 * @author Administrator
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class db_Util {
	/*  ���ݿ��ַ*/
	private static String dbURL= "jdbc:mysql://localhost:3306/db_book?serverTimezone=UTC";
	//�û���
	private static String dbUserName = "root";
	
	//����
	private static String dbPassword = "root";
	
	private String jdbcName = "com.mysql.cj.jdbc.Driver";
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws Exception
	 */
	public Connection getConnection()throws Exception{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbURL,dbUserName,dbPassword);
		return con;
	}
	/**
	 * �ر����ݿ�����
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con)throws Exception{
		if(con!=null) {
			con.close();
		}
	}
	/**
	 * �������ݿ�����
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		db_Util db_util = new db_Util();
		db_util.getConnection();
		System.out.println("���ӳɹ�");
	}
}
