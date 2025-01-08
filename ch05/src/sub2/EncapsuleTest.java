package sub2;

/*
 * 날짜 : 2025/01/07
 * 이름 : 김철학
 * 내용 : Java 클래스 캡슐화 실습하기 
 */
public class EncapsuleTest {
	
	public static void main(String[] args) {
		
		// Car 객체 생성 초기화
		Car sonata = new Car("소나타", "흰색", 10);
		
		// 캡슐화된 속성은 외부에서 참조할 수 없음
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 10;
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		/*
		 <출력>
		 차량명 : 아반테
		 차량색 : 검정
		 현재속도 : 20
		 */
		Car avante = new Car("아반테", "검정", 0);
		avante.speedUp(80);
		avante.speedDown(60);
		avante.show();
		
		avante.setColor("흰색"); // setter를 이용해 속성 수정
		avante.show();
		
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력>
		 은행명 : 국민은행
		 계좌번호 : 110-11-1011
		 입금주 : 김유신
		 현재잔액 : 10000
		*/
		Account kb = new Account("국민은행", "110-11-1011", "김유신", 1000);
		kb.deposit(30000);
		kb.withdraw(21000);
		kb.show();
		
		// 김유신 -> 김유진 개명
		kb.setName("김유진");
		kb.show();
		
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력>
		 은행명 : 우리은행
		 계좌번호 : 110-11-1211
		 입금주 : 김춘추
		 현재잔액 : 15000
		*/
		Account wr = new Account("우리은행", "110-11-1211", "김춘추", 10000);
		wr.deposit(30000);
		wr.withdraw(25000);
		wr.show();
		
		// 우리은행 -> 유리은행 상호변경
		wr.setBank("유리은행");
		wr.show();
		
		/*
		도서관 관리 시스템의 일부로 Book 클래스를 정의하세요.
		*/
		Book book1 = new Book("삼국지", "나관중", "10001", 10);
		book1.show();
		
		boolean isOk = book1.borrowBook();
		
		if(isOk) {
			System.out.println(book1.getTitle() + "도서 대출 성공!");
		}else {
			System.out.println(book1.getTitle() + "도서 대출 실패!");
		}
		
		book1.show();
		
		Book book2 = new Book("이것이 자바다", "신용권", "10002", 0);
		book2.show();
		
		if(book2.borrowBook()) {
			System.out.println(book2.getTitle() + "도서 대출 성공!");
		}else {
			System.out.println(book2.getTitle() + "도서 대출 실패!");
		}
		
		// 문제2. 다음 요구사항을 충족하는 Movie 클래스를 정의하세요.
		Movie movie1 = new Movie("글래디에이터", "리들리스콧", 8.0, 10);
		
		if(movie1.reserveSeat()) {
			System.out.println("영화 좌석 예매 완료!");
		}else {
			System.out.println("영화 좌석 예매 실패!");
		}
		
		movie1.showDetails();
		
		Movie movie2 = new Movie("타이타닉", "제임스카메론", 9.5, 0);
		if(movie2.reserveSeat()) {
			System.out.println("영화 좌석 예매 완료!");
		}else {
			System.out.println("영화 좌석 예매 실패!");
		}
		
		movie2.showDetails();
		
	}
}









