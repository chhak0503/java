package sub2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜 : 2025/01/22
 * 이름 : 김철학
 * 내용 : Java 소켓 프로그래밍 실습
 */
public class SocketServer {
	
	public static void main(String[] args) {
		
		System.out.println("[Server]");
		
		ServerSocket serverSocket = null;
		
		try {			
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			System.out.println("연결 대기...");
			
			Socket socket = serverSocket.accept();
			System.out.println("연결 수립...");
			
			// 데이터 수신
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			int readBytes = is.read(bytes);
			
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			System.out.println("데이터 수신 완료...");
			
			// 데이터 송신
			OutputStream os = socket.getOutputStream();
			String msg = "Hello Client!";
			
			byte[] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			System.out.println("데이터 송신 완료...");
			
			os.close();
			is.close();			
			socket.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Server 종료...");
	}
}





