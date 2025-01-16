package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*
 * 날짜 : 2025/01/16
 * 이름 : 김철학
 * 내용 : Java 파일 입출력 문자 스트림 실습하기
 */
public class FileReaderTest {
	
	public static void main(String[] args) {
		
		// 파일 경로 설정
		String source = "C:\\Users\\lotte6\\Desktop\\Test1.txt";
		String target = "C:\\Users\\lotte6\\Desktop\\Test2.txt";
		
		
		try {
			// 문자 스트림 생성
			FileReader fr = new FileReader(source);   // 입력 스트림
			FileWriter fw = new FileWriter(target); // 출력 스트림
			
			// 스트림 데이터 전송
			while(true) {
				
				// 입력스트림으로 파일 문자 데이터 읽기
				int data = fr.read();
				
				if(data == -1) {
					// 읽을 파일 데이터가 없을때
					break;					
				}
				
				// 숫자를 문자로 변환
				char ch = (char) data;
				System.out.print(ch);
				
				// 출력스트림으로 파일 문자 데이터 쓰기
				fw.write(data);
			}
			
			// 스트림 해제
			fr.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료...");
		
	}// main end
}
