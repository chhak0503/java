package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {

	// DB 정보
	private final String HOST = "jdbc:mysql://localhost:3306/shop";
	private final String USER = "shop";
	private final String PASS = "1234";
		
	// DB 자원
	protected Connection conn = null;
	protected Statement stmt = null;
	protected PreparedStatement psmt = null;
	protected ResultSet rs = null;
	
	// 접속 커넥션
	protected Connection getConnection() throws SQLException {
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	
	// DB 종료
	protected void closeAll() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		
		if(psmt != null) {
			psmt.close();
		}
		
		if(stmt != null) {
			stmt.close();
		}
		
		if(conn != null) {
			conn.close();
		}
	}
}











