package controller;

import java.util.Scanner;

public class ProductController {

	public void manage(Scanner sc) {
		
		while(true) {
			System.out.println("------------ 상품관리 ------------");
			System.out.println("0:메인, 1:상품등록, 2:상품목록, 3:상품검색");
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				// 메인 이동
				return; // 메서드 종료
			case 1:
				// 상품등록
				break;
			case 2:
				// 상품목록
				break;
			case 3:
				// 상품검색
				break;
			default:
				break;
			} // switch end
		}// while end
	}// manage end
}
