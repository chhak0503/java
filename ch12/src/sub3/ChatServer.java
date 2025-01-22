package sub3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜 : 2025/01/22
 * 이름 : 김철학
 * 내용 : Java 채팅 프로그래밍 실습
 */
public class ChatServer {
	
	public static void main(String[] args) {
		
		System.out.println("[Server]");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {			
			serverSocket = new ServerSocket(9001);
			System.out.println("연결 대기...");
			
			socket = serverSocket.accept();
			System.out.println("연결 수립...");
			
			Thread receiver = new ReceiverThread(socket);
			Thread sender = new SenderThread(socket);
			
			receiver.start();
			sender.start();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// System.out.println("Server 채팅 종료...");
	}
}









