import java.net.Socket;

public class ClientExample4 {

	public static void main(String[] args) {
		if (args.length != 1) {	// 명령행 매개변수
			System.out.println("Usage:javaClientExample4<user-name>");
			return;
		}
		try {
			Socket socket = new Socket("192.168.219.103", 9002);
			Thread thread1 = new SenderThread(socket, args[0]);	// 닉네임 전달 및 송신 작업
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
