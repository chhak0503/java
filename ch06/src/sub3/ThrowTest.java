package sub3;

/*
 * 날짜 : 2024/07/15
 * 이름 : 김철학
 * 내용 : 예외 발생 시키기 실습하기
 */

class Score {
	
	public void check(int score) throws Exception {
		
		if(score < 0) {
			// 예외 발생 시키기
			throw new Exception("점수는 음수가 될 수 없습니다.");
			
		}else if(score > 100) {
			// 예외 발생 시키기
			throw new Exception("점수는 100점을 초과할 수 없습니다.");
		}else {
			System.out.println("점수가 정상입니다.");
		}
	}
}

public class ThrowTest {

	public static void main(String[] args) {
	
		Score score = new Score();
		
		try {
			score.check(-10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			score.check(80);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			score.check(120);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}	
}













