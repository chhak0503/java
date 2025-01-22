package sub1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/*
 * 날짜 : 2025/01/22
 * 이름 : 김철학
 * 내용 : Java Http 통신 실습하기
 */
public class HttpClientTest {
	
	public static void main(String[] args) {
		
		HttpClient httpClient = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest
								.newBuilder()
								.uri(URI.create("https://google.com"))
								.GET()
								.build();
		
		try {
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			
			System.out.println("상태코드 : " + response.statusCode());
			System.out.println("응답내용 : " + response.body());
			
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("HTTP 통신 끝...");
	}
}
