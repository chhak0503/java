package shop;

import java.util.List;
import java.util.Scanner;

import shop.dao.CustomerDAO;
import shop.dao.OrderDAO;
import shop.dao.ProductDAO;
import shop.vo.CustomerVO;
import shop.vo.OrderVO;
import shop.vo.ProductVO;

/*
 * 날짜 : 2024/07/31
 * 이름 : 김철학
 * 내용 : Shop 미니 프로젝트 실습하기
 */
public class ShopMain {
	public static void main(String[] args) {
		
		System.out.println("-------------------");
		System.out.println("쇼핑몰에 오신것을 환영합니다.");
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		ProductDAO  productDAO = ProductDAO.getInstance();
		OrderDAO 	orderDAO = OrderDAO.getInstance();
		
		
		// 로그인 사용자 객체
		CustomerVO loginedCustomer = null;
		
		while(true) {
			
			if(loginedCustomer == null) {
				System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 주문하기:4");
			}else {
				System.out.println("종료:0, 로그아웃:1, 주문현황:2, 상품목록:3, 주문하기:4");
			}
			System.out.print("선택>");
				
			int answer = sc.nextInt();
			
			if(answer == 0) {
				break;
			}else if(answer == 1) {
				
				if(loginedCustomer == null) {
					// 로그인
					System.out.print("아이디 입력 : ");
					String custId = sc.next();
					
					loginedCustomer = customerDAO.selectCustomer(custId);
					
					if(loginedCustomer != null) {
						System.out.println(loginedCustomer.getName() + "님 어서오세요.");
					}else {
						System.out.println("일치하는 회원이 없습니다.");
					}
				}else {
					// 로그아웃
					System.out.println(loginedCustomer.getName() + "님 안녕히 가세요.");
					loginedCustomer = null;
				}
				
			}else if(answer == 2) {
				
				if(loginedCustomer == null) {
					// 회원가입
					CustomerVO customerVO = new CustomerVO();
					
					System.out.print("아이디 입력 : ");
					customerVO.setCustId(sc.next());
					
					System.out.print("이름 입력 : ");
					customerVO.setName(sc.next());
					
					System.out.print("휴대폰 입력 : ");
					customerVO.setHp(sc.next());
					
					System.out.print("주소 입력 : ");
					customerVO.setAddr(sc.next());
					
					int result = customerDAO.insertCustomer(customerVO);
					
					if(result > 0) {
						System.out.println("회원가입을 축하합니다.");
					}else {
						System.out.println("회원가입에 실패했습니다.");
					}
				}else {
					// 주문현황(주문번호, 상품번호, 상품명, 주문수량, 주문자이름, 주문일자)
					String orderId = loginedCustomer.getCustId();
					
					List<OrderVO> orders = orderDAO.selectOrders(orderId);
					
					System.out.println("----------- 주문목록 ------------");
					for(OrderVO order : orders) {
						System.out.print(order.getOrderNo() + ", ");
						System.out.print(order.getOrderProduct() + ", ");
						System.out.print(order.getProdName() + ", ");
						System.out.print(order.getOrderCount() + ", ");
						System.out.print(order.getOrderer() + ", ");
						System.out.println(order.getOrderDate());
					}
					System.out.println("-------------------------------");
					
					
				}
				
			}else if(answer == 3) {
				// 상품목록
				List<ProductVO> products = productDAO.selectProducts();
				
				System.out.println("----------- 상품목록 ------------");
				products.stream().forEach(System.out::println);
				System.out.println("-------------------------------");
				
			}else if(answer == 4) {
				// 주문하기
				if(loginedCustomer == null) {
					System.out.println("로그인을 먼저 하십시요.");
					continue;
				}
				
				OrderVO orderVO = new OrderVO(); 
				orderVO.setOrderId(loginedCustomer.getCustId());
				
				System.out.print("주문 상품번호 입력 : ");
				orderVO.setOrderProduct(sc.nextInt());
				
				System.out.print("주문 상품수량 입력 : ");
				orderVO.setOrderCount(sc.nextInt());
				
				int result = orderDAO.insertOrder(orderVO);
				
				if(result > 0) {
					System.out.println("상품 주문이 완료 되었습니다.");
				}else {
					System.out.println("상품 주문이 실패 했습니다.");
				}
			}
			
			
		}// end while
		
		sc.close();
		System.out.println("안녕히 가십시요.");
		
	}// end main
}




