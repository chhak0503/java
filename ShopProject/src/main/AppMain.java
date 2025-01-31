package main;

import java.util.Scanner;

import controller.CustomerController;
import controller.OrderController;
import controller.ProductController;
import entity.Customer;

/*
 * 날짜 : 2025/01/31
 * 이름 : 김철학
 * 내용 : JAVA Shop 미니 프로젝트 실습
 * 
 * Controller
 *  - 사용자의 요청을 처리하는 컴포넌트
 *  - 일반적으로 사용자의 입력값을 서비스로 전달
 *  
 * Service
 *  - Controller와 DAO 사이에 중간 처리 역할
 *  - 비지니스 처리 담당
 * 
 * DAO
 *  - Data Access Object
 *  - 데이터베이스 테이블 CRUD 처리 담당
 */
public class AppMain {

	public static void main(String[] args) {
		
		// 컨트롤러 생성
		CustomerController customerController = new CustomerController();
		OrderController orderController = new OrderController();
		ProductController productController = new ProductController();
		
		Scanner sc = new Scanner(System.in);
		
		boolean isRunning = true;
		Customer loginedCustomer = null;
		
		while(isRunning) {
			System.out.println("========== Shop 미니 프로젝트 ==========");
			System.out.println("0:종료, 1:회원관리, 2:상품관리, 3:주문관리");
			System.out.print("선택 : ");
			
			int answer = sc.nextInt();
			
			switch (answer) {
			case 0: 
				isRunning = false;
				break;
			case 1:
				// 회원관리
				loginedCustomer = customerController.manage(sc);
				break;
			case 2:
				// 상품관리
				productController.manage(sc);
				break;
			case 3:
				// 주문관리
				orderController.manage(sc, loginedCustomer);
				break;
			default:
				System.out.println("다시 선택하세요.");
				break;
				
			} // switch end
			
		} // while end
		
		sc.close();
		System.out.println("프로그램 종료...");
		
	} // main end
}















