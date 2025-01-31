package controller;

import java.util.Scanner;

import entity.Customer;

public class CustomerController {

	
	public void manage(Scanner sc) {
		
		while(true) {
			System.out.println("------------ 회원관리 ------------");
			System.out.println("0:메인, 1:회원가입, 2:회원목록, 3:로그인");
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				// 메인 이동
				return; // 메서드 종료
			case 1:
				// 회원가입
				Customer inputCustomer = inputCustomer(sc);
				System.out.println(inputCustomer);
				
				
				break;
			case 2:
				// 회원목록
				break;
			case 3:
				// 로그인
				break;
			default:
				break;
			} // switch end
		}// while end
	}// manage end
	
	public Customer inputCustomer(Scanner sc) {
		
		sc.nextLine();
		
		System.out.print("아이디 : ");
		String custId = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("휴대폰 : ");
		String hp = sc.nextLine();
		
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		
		return new Customer(custId, name, hp, addr);
	}
	
	
	
	
	
	
}


















