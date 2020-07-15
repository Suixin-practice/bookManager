package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dbutil {
	//数据库地址，时区信息需要进行jdbc:mysql://localhost:3306/db_book?serverTimezone=UTC
	private static String dbURL= "jdbc:mysql://localhost:3306/db_book?serverTimezone=UTC";
	
	//用户名
	private static String dbUserName = "root";
	
	//密码
	private static String dbPassword = "root";
	
	//驱动名称,注意驱动名称已经更改
	private static String jdbcName =  "com.mysql.cj.jdbc.Driver";
	/**
	 * 获取数据库连接
	 * @return
	 * @throws Exception
	 */
	public Connection getConnection() throws Exception{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
		return con;
	}
	/**
	 * 关闭连接
	 * @param con
	 * @throws Exception
	 */
	public void close(Statement stmt,Connection con)throws Exception{
		if(stmt!=null){
			stmt.close();
			if(con!=null){
				con.close();
			}
		}
	}
}
