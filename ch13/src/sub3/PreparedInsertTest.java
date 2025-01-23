package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2025/01/23
 * 이름 : 김철학
 * 내용 : Java CRUD 실습하기 
 */
public class PreparedInsertTest {

	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://localhost:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			// 쿼리 파라미터 ?를 사용해 쿼리문 작성
			String sql = "INSERT INTO `user1` VALUES (?,?,?,?)";
			
			// prepared 객체 생성
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 쿼리 파라미터 맵핑(사상)
			psmt.setString(1, "j101");
			psmt.setString(2, "홍길동");
			psmt.setString(3, "010-1234-1001");
			psmt.setInt(4, 23);			
			System.out.println(psmt);
						
			// 4단계 - SQL 실행
			psmt.executeUpdate();
			
			// 5단계 - 조회결과 처리
			
			// 6단계 - 데이터베이스 종료
			psmt.close();
			conn.close();			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
		
		
	}
}
