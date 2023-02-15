import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {
	Socket socket;
	String name;

	SenderThread(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}

	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	// reader: 메세지 입력을 받기 위한 객체
			PrintWriter writer = new PrintWriter(socket.getOutputStream());	// writer: 메세지를 보낼 수 있는 송신 객체
			writer.println(name);	// 파라미터를 전달받을 name
			writer.flush();	// buffer 표현
			while (true) {
				String str = reader.readLine();	// 키보드로부터 메세지 입력받음
				if (str.equals("bye"))
					break;
				writer.println(str);	// 키보드 입력 내용 송신
				writer.flush();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (Exception ignored) {
			}
		}
	}
}