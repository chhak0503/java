package test4;

import java.util.Scanner;

/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 예외처리 연습문제
 */
class NotFoundException extends Exception {
	
	public NotFoundException() {
		super("해당하는 숫자를 찾을 수 없습니다.");
	}
}

public class Test02 {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 8, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을 숫자 입력 : ");
		int find = sc.nextInt();
		
		try {			
			searchArray(find, arr);
			System.out.println("해당하는 숫자 찾음!!!");
			
		}catch (NotFoundException e) {
			System.out.println(e.getMessage());
			
		}finally {
			sc.close();
		}
		
		System.out.println("프로그램 정상 종료...");
	}
	
	public static void searchArray(int find, int[] arr) throws NotFoundException {

		for(int i : arr) {
			if(i == find) {
				return;
			}
		}
		
		throw new NotFoundException();
	}
}