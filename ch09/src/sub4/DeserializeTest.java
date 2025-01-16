package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2025/01/16
 * 이름 : 김철학
 * 내용 : Java 역직렬화 실습하기
 */
public class DeserializeTest {
	
	public static void main(String[] args) {
		
		String source = "C:\\Users\\lotte6\\Desktop\\Apple";
		
		try {
			// 기본스트림 생성
			FileInputStream fis = new FileInputStream(source);
			
			// 객체 역직렬화를 위한 보조 스트림 생성 후 기본스트림과 연결
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 역직렬화
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			// 스트림 해제
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
