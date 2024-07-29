package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 날짜 : 2024/07/29
 * 이름 : 김철학
 * 내용 : JDBC 접속 테스트 실습
 */
public class DBConnectionTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스명
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!");
			}else {
				System.out.println("데이터베이스 접속 실패!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
}
