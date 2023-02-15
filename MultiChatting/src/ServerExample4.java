import java.net.ServerSocket;
import java.net.Socket;
class ServerExample4 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9002);
            while (true) {
                Socket socket = serverSocket.accept();	// 클라이언트와 소통하기 위한 소켓 생성
                Thread thread = new PerClinetThread(socket);	// 클라이언트가 보내는 메시지를 전달받아 배포하는 스레드 생성
                thread.start();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
