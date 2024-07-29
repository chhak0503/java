package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2024/07/29
 * 이름 : 김철학
 * 내용 : Insert 실습하기
 */
public class InsertTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - SQL실행 객체 statement 생성
			Statement stmt = conn.createStatement();
			
			// 3단계 - SQL실행
			String sql = "INSERT INTO `user1` VALUES ('J101', '김유신', '1990-01-21', '010-1234-1001', 23)";
			stmt.executeUpdate(sql);
			
			// 4단계 - Resultset 결과처리(Select일 경우)
			// 5단계 - 접속 종료
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
	}
}









