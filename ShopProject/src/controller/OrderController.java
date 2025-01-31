package controller;

import java.util.Scanner;

public class OrderController {
	
	public void manage(Scanner sc) {
		
		while(true) {
			System.out.println("------------ 주문관리 ------------");
			System.out.println("0:메인, 1:주문하기, 2:주문목록, 3:나의주문");
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				// 메인 이동
				return; // 메서드 종료
			case 1:
				// 주문하기
				break;
			case 2:
				// 주문목록
				break;
			case 3:
				// 나의주문
				break;
			default:
				break;
			} // switch end
		}// while end
	}// manage end

}
