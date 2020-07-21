package util;
/**
 * 数据库工具类
 * @author Administrator
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class db_Util {
	/*  数据库地址*/
	private static String dbURL= "jdbc:mysql://localhost:3306/db_book?serverTimezone=UTC";
	//用户名
	private static String dbUserName = "root";
	
	//密码
	private static String dbPassword = "root";
	
	private String jdbcName = "com.mysql.cj.jdbc.Driver";
	/**
	 * 获取数据库连接
	 * @return
	 * @throws Exception
	 */
	public Connection getConnection()throws Exception{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbURL,dbUserName,dbPassword);
		return con;
	}
	/**
	 * 关闭数据库连接
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con)throws Exception{
		if(con!=null) {
			con.close();
		}
	}
	/**
	 * 测试数据库连接
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		db_Util db_util = new db_Util();
		db_util.getConnection();
		System.out.println("连接成功");
	}
}
