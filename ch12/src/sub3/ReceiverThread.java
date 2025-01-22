package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

// 수신처리 스레드 클래스
public class ReceiverThread extends Thread {
	
	private Socket socket;
	
	public ReceiverThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {				
				String msg = br.readLine();
				
				if(msg == null) {
					break;
				}
				
				System.out.println(msg);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
