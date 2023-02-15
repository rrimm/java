import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread {
	Socket socket;

	ReceiverThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));	// reader: 수신 객체
			while (true) {
				String str = reader.readLine();	// 메세지 수신
				if (str == null)
					break;
				System.out.println(str);	// 수신한 메세지 화면 출력
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}