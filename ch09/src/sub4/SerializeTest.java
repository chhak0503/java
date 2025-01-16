package sub4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2025/01/16
 * 이름 : 김철학
 * 내용 : Java 직렬화 실습하기
 */
public class SerializeTest {

	public static void main(String[] args) {
		
		// 직렬화를 위한 객체 준비
		Apple apple = new Apple("한국", 3000);
		
		String target = "C:\\Users\\lotte6\\Desktop\\Apple";
		
		try {
			// 기본스트림 생성
			FileOutputStream   fos = new FileOutputStream(target);
			
			// 객체 직렬화를 위한 보조 스트림 생성 후 기본스트림과 연결
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// 객체 직렬화(객체를 파일로 쓰기)
			oos.writeObject(apple);
			
			// 스트림 해제
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}









