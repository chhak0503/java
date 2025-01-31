package controller;

import java.util.Scanner;

import entity.Customer;
import service.CustomerService;

public class CustomerController {

	// 서비스 객체
	private CustomerService service = CustomerService.getInstance();
	
	
	public void manage(Scanner sc) {
		
		// 로그인 Customer 객체
		Customer loginedCustomer = null;
		
		while(true) {
			System.out.println("------------ 회원관리 ------------");
			
			if(loginedCustomer == null) {
				System.out.println("0:메인, 1:회원가입, 2:로그인, 3:회원목록");
			}else {
				System.out.println("0:메인, 1:나의정보, 2:로그아웃, 3:회원목록");
			}
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				// 메인 이동
				return; // 메서드 종료
			case 1:
				
				if(loginedCustomer == null) {
					// 회원가입
					Customer inputCustomer = inputCustomer(sc);
					service.registerCustomer(inputCustomer);
					
					System.out.println("회원가입이 완료 되었습니다.");
				}else {
					// 나의정보
					System.out.println(loginedCustomer);				
				}
				break;
			case 2:
				if(loginedCustomer == null) {
					// 로그인
					String inputCustId = inputCustId(sc);				
					loginedCustomer = service.loginCustomer(inputCustId);
					
					if(loginedCustomer != null) {
						System.out.println(loginedCustomer.getName() + "님 로그인 했습니다.");
					}else {
						System.out.println("로그인에 실패했습니다.");
					}
				}else {
					// 로그아웃
					System.out.println(loginedCustomer.getName() + "님 로그아웃 했습니다.");
					loginedCustomer = null;					
				}
				break;
			case 3:
				// 회원목록
				break;
			default:
				System.out.println("잘못된 입력입니다.");
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
	
	public String inputCustId(Scanner sc) {
		sc.nextLine(); // 버퍼 비우기
		
		System.out.print("아이디 : ");
		String custId = sc.nextLine();
		
		return custId;
	}
	
}


















