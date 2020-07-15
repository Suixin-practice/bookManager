package jdbc.chap04;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.java1234.jdbc.model.Book;

import util.Dbutil;

public class Demo2 {
	private static Dbutil dbutil = new Dbutil();
	/**
	 * 更新
	 * @param book
	 * @return
	 * @throws Exception
	 */
	private static int updateBook(Book book) throws Exception{
		Connection con = dbutil.getConnection();	//获取连接
		String sql = "update t_book set bookName=?,price=?,author=?,bookTypeId=? where id =?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, book.getBookName());
		pstmt.setFloat(2, book.getPrice());
		pstmt.setString(3, book.getBookName());
		pstmt.setInt(4, book.getBookTypeId());
		pstmt.setInt(5, book.getId());
		int result = pstmt.executeUpdate();
		dbutil.close(pstmt, con);
		return result;
	}
	/**
	 * 删除
	 * @param id
	 * @return
	 * @throws Exception
	 */
	private static int delectBook(int id) throws Exception{
		Connection con = dbutil.getConnection();
		String sql = "delete from t_book where id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		int result = pstmt.executeUpdate();
		dbutil.close(pstmt, con);
		return result;
	}
	
	private static int addBook(Book book) throws Exception{
		Connection con = dbutil.getConnection();
		String sql = "insert into t_book values(null,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, book.getBookName());
		pstmt.setFloat(2, book.getPrice());
		pstmt.setString(3, book.getBookName());
		pstmt.setInt(4, book.getBookTypeId());
		int result = pstmt.executeUpdate();
		return result;
	}
	public static void main(String[] args) throws Exception{
		
		int result = delectBook(5);
		if(result==1){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
	}
}
