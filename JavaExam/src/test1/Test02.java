package test1;

import java.util.Scanner;

/*
 * 날짜 : 2024/07/03
 * 이름 : 김철학
 * 내용 : 자바 기본 입출력 연습문제
 */
public class Test02 {
	
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
        
        int year;
        int birth;
        String name;
        
        System.out.print("올해 년도 입력 : ");		
        year = sc.nextInt(); // 현재 년도 입력 받기
        
        System.out.print("태어난 년도 입력 : ");		
        birth = sc.nextInt(); // 태어난 년도 입력 받기
        
        sc.nextLine(); // 버퍼를 비워줌 (nextInt 후에 nextLine을 사용하기 위해)
        
        System.out.print("이름 입력 : ");
        name = sc.nextLine(); // 이름 입력 받기
        
        int age = year - birth; // 나이 계산
        
        System.out.printf("%s님 안녕하세요.\n당신은 올해 만 %d세 입니다.", name, age); // 출력
        
        sc.close(); // Scanner 닫기	
	}
}

