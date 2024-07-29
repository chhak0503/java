package sub3;


/*
 * 날짜 : 2024/07/29
 * 이름 : 김철학
 * 내용 : PreparedStatement 실습하기
 */
public class PreparedSelectTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - 데이터베이스 접속
			// 2단계 - SQL실행 객체(PreparedStatement) 생성
			// 3단계 - SQL실행
			// 4단계 - ResultSet 결과처리
			// 5단계 - 데이터베이스 종료
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
