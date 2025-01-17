package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 날짜 : 2000/00/00
 * 이름 : 김철학
 * 내용 : 리스트 연습문제
 */
public class Test06 {
	public static void main(String[] args) {
		
		// 60 ~ 100 사이 임의의 수 10개를 더하므로 결과값이 항상 다름
		printList(createList());
	}
	
	public static void printList(List<Integer> scoreList) {
		
		int total = 0;
		int size = scoreList.size();
		
		for(int i=0 ; i<size ; i++) {
			
			int score = scoreList.get(i);
			
			total += score;
			
			System.out.print(score);
			
			if(i == size - 1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}			
		}		
		System.out.println(total);
	}
	
	public static List<Integer> createList(){
		
		List<Integer> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for(int i=1 ; i<=10 ; i++) {
			// 60 ~ 100 사이 임의의 수
			int num = rand.nextInt(41) + 60;
			scoreList.add(num);
		}
		
		return scoreList;
	}
}