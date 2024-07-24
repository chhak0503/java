package sub3;

import java.net.Socket;

/*
 * 날짜 : 2024/07/24
 * 이름 : 김철학
 * 내용 : 채팅 실습하기
 */
public class ChatClient {

	public static void main(String[] args) {
		
		System.out.println("[Client]");
		
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1", 9001);
			
			Thread t1 = new SendThread(socket);
			Thread t2 = new ReceiveThread(socket);
			
			t1.start();
			t2.start();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
