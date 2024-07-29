package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2024/07/29
 * 이름 : 김철학
 * 내용 : PreparedStatement 실습하기
 */
public class PreparedInsertTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - SQL실행 객체(PreparedStatement) 생성 후 값 매핑
			String sql = "INSERT INTO `user2` VALUES (?,?,?,?)"; // 준비된 쿼리문(쿼리 파라미터 ?가 사용된 임시 쿼리문)
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "J101");
			psmt.setString(2, "홍길동");
			psmt.setString(3, "1999-09-09");
			psmt.setString(4, "부산광역시");
						
			// 3단계 - SQL실행
			psmt.executeUpdate();
			
			// 4단계 - ResultSet 결과처리
			// 5단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료...");
	}
}





