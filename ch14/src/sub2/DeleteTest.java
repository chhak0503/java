package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2024/07/29
 * 이름 : 김철학
 * 내용 : Delete 실습하기
 */
public class DeleteTest {

	public static void main(String[] args) {		
		
		// 아이디 J101 삭제하기
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계
			Connection conn = DriverManager.getConnection(host, user, pass);
			// 2단계
			Statement stmt = conn.createStatement();
			// 3단계
			stmt.executeUpdate("DELETE FROM `user1` WHERE `uid`='J101'");
			// 4단계
			// 5단계
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료...");
		
	}
}
