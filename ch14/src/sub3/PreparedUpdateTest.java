package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2024/07/29
 * 이름 : 김철학
 * 내용 : PreparedStatement 실습하기
 */
public class PreparedUpdateTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		
		// 아이디 J101, '김철수', '부산광역시' 수정하기
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - SQL실행 객체(PreparedStatement) 생성
			String  sql = "UPDATE `user2` SET `name`=?, `addr`=? WHERE `uid`=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "김철수");
			psmt.setString(2, "부산광역시");
			psmt.setString(3, "J101");
			
			// 3단계 - SQL실행
			psmt.executeUpdate();
			
			// 4단계 - ResultSet 결과처리
			// 5단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
		
	}
}
