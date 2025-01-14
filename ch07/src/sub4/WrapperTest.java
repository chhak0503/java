package sub4;

/*
 * 날짜 : 2025/01/14
 * 이름 : 김철학
 * 내용 : Java Wrapper 클래스 실습하기
 */
public class WrapperTest {

	public static void main(String[] args) {
		
		// 기본타입 - primitive
		int 	var1 = 1;
		double 	var2 = 1.2;
		boolean var3 = true;
		
		// Wrapper 포장(Boxing)
		Integer box1 = var1;
		Double  box2 = var2;
		Boolean box3 = var3;
		
		System.out.println("box1 : " + box1);
		System.out.println("box2 : " + box2);
		System.out.println("box3 : " + box3);
		
		// 문자열 -> 기본타입 변환
		String str1 = "1";
		String str2 = "3.14";
		String str3 = "false";
		
		int 	value1 = Integer.parseInt(str1);
		double  value2 = Double.parseDouble(str2);
		boolean value3 = Boolean.parseBoolean(str3);
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		// 문자열 -> Wrapper 변환
		Integer w1 = Integer.valueOf(str1);
		Double  w2 = Double.valueOf(str2);
		Boolean w3 = Boolean.valueOf(str3);
		
		System.out.println("w1 : " + w1);
		System.out.println("w2 : " + w2);
		System.out.println("w3 : " + w3);
		
		// Wrapper -> 문자열 변환
		String s1 = w1.toString();
		String s2 = w2.toString();
		String s3 = w3.toString();
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
		// Wrapper -> 기본타입 변환(Unboxing)
		int 	v1 = w1;
		double 	v2 = w2;
		boolean v3 = w3;
		
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		System.out.println("v3 : " + v3);
		
	}
}









