package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User1;

/*
 * 날짜 : 2025/01/23
 * 이름 : 김철학
 * 내용 : Java CRUD 실습하기 
 */
public class PreparedSelectTest {

	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://localhost:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		List<User1> users = new ArrayList<User1>();
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			String sql = "select * from `user1`";
			PreparedStatement psmt = conn.prepareStatement(sql);
						
			// 4단계 - SQL 실행
			ResultSet rs = psmt.executeQuery();
			
			// 5단계 - 조회결과 처리
			while(rs.next()) {
				
				User1 user1 = new User1();
				user1.setUid(rs.getString(1));
				user1.setName(rs.getString(2));
				user1.setHp(rs.getString(3));
				user1.setAge(rs.getInt(4));
				
				users.add(user1);
			}
			
			// 6단계 - 데이터베이스 종료
			rs.close();
			psmt.close();
			conn.close();			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// 리스트 출력
		for(User1 user1 : users) {
			System.out.println(user1);
		}
		
		System.out.println("Select 완료...");
	}
}














