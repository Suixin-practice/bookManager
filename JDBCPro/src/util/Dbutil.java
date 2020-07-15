package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dbutil {
	//���ݿ��ַ��ʱ����Ϣ��Ҫ����jdbc:mysql://localhost:3306/db_book?serverTimezone=UTC
	private static String dbURL= "jdbc:mysql://localhost:3306/db_book?serverTimezone=UTC";
	
	//�û���
	private static String dbUserName = "root";
	
	//����
	private static String dbPassword = "root";
	
	//��������,ע�����������Ѿ�����
	private static String jdbcName =  "com.mysql.cj.jdbc.Driver";
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws Exception
	 */
	public Connection getConnection() throws Exception{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
		return con;
	}
	/**
	 * �ر�����
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
