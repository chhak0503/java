package sub1;

/*
 * 날짜 : 2025/01/14
 * 이름 : 김철학
 * 내용 : Java Object 클래스 실습하기
 */
public class ObjectTest {

	public static void  main(String[] arg) {
	
		// 자바 최상위 클래스 Object로 다형성
		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("일본", 2000);
		
		System.out.println(a1.toString()); // toString() 메서드를 직접 호출
		System.out.println(a2); // toString() 메서드를 간접 호출
		
		// 객체 비교
		if(a1 == a2) {
			System.out.println("객체 a1, a2 참조변수 주소값이 같다");
		}else {
			System.out.println("객체 a1, a2 참조변수 주소값이 다르다");
		}
		
		
		if(a1.equals(a2)) {
			System.out.println("객체 a1, a2 인스턴스가 서로 같다.");
		}else {
			System.out.println("객체 a1, a2 인스턴스가 서로 다르다.");
		}
		
		// 객체 해시값
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		
		
	}
}
