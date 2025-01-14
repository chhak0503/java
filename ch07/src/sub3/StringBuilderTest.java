package sub3;

/*
 * 날짜 : 2025/01/14
 * 이름 : 김철학
 * 내용 : Java StringBuilder 클래스 실습하기
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		
		// String 객체의 immutable(불변성) 특성으로 메모리 낭비가 발생
		String str = "Hello";
		System.out.println("str : " + str);
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		str += "World"; // 새로운 문자열 삽입
		System.out.println("str : " + str);
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		// String의 불변성을 개선한 StringBuilder로 문자열 가공
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb : " + sb);
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		sb.append("World");
		System.out.println("sb : " + sb);
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
	}
}


