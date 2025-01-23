package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 : 2025/01/23
 * 이름 : 김철학
 * 내용 : Java CRUD 실습하기
 */
public class DeleteTest {
	
	public static void main(String[] args) {
		
		// DB정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		try {			
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "DELETE FROM `user1` WHERE `uid`='j101'";
			stmt.executeUpdate(sql);
			
			// 5단계 - 조회결과 처리(Select 경우)
			// 6단계 - 데이터베이스 종료(자원해제)
			stmt.close();
			conn.close();			
			
		}catch (Exception e) {			
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료...");
	}
}
