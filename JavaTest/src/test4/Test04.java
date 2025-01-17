package test4;

/*
 * 날짜 : 0000/00/00
 * 이름 : 김철학
 * 내용 : 자바 문자열 연습문제
 */
public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.indexOf(".");
		
		String title = fileName.substring(0, idx);
		String ext   = fileName.substring(idx + 1);
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String   strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(",");
		
		int total = 0;
		
		for(String score : scores) {
		
			total += Integer.parseInt(score.trim()); // trim : 공백 문자열 제거
			
		}
		
		System.out.println("strScores 총점 : " + total);	
	}
	
}