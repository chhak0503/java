package test1;

/*
 * 날짜 : 2024/07/03
 * 이름 : 김철학
 * 내용 : 자바 반복문 연습문제
 */
public class Test09 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=1 ; i<=9 ; i++) {
			
			if(i<=5) {
				count++;
			}else {
				count--;
			}
						
			for(int j=1 ; j<=5-count ; j++) {
				System.out.print(" ");
			}
			
			for(int k=1 ; k<=2*count-1 ; k++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}		
	}
}