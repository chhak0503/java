package controller;

import java.util.Scanner;

import entity.Customer;
import entity.Order;

public class OrderController {
	
	public void manage(Scanner sc, Customer loginedCustomer) {
		
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
				if(loginedCustomer != null) {
					
					Order inputOrder = inputOrder(sc, loginedCustomer);
					System.out.println(inputOrder);
					
				}else {
					System.out.println("주문을 하시려면 먼저 로그인을 하십시요.");
				}
				
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

	public Order inputOrder(Scanner sc, Customer loginedCustomer) {
				
		String orderId = loginedCustomer.getCustId();
		
		System.out.print("상품번호 : ");
		int orderProduct = sc.nextInt();
		
		System.out.print("주문수량 : ");
		int orderCount = sc.nextInt();
		
		return new Order(orderId, orderProduct, orderCount);
	}
}














