import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class PerClinetThread extends Thread {
    static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
    Socket socket;
    PrintWriter writer;
    PerClinetThread(Socket socket) {
        this.socket= socket;
        try {
            writer = new PrintWriter(socket.getOutputStream());
            list.add(writer);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void run() {
        String name = null;
        try {
            BufferedReader reader = new BufferedReader(	// 데이터를 수신할 수 있는 객체 생성
                new InputStreamReader(socket.getInputStream()));
            name = reader.readLine();  // 수신 - 닉네임         
            sendAll("#" + name + "님이 들어오셨습니다");
            while (true) {
                String str = reader.readLine();	// 실제 메시지 수신
                if (str == null)
                    break;
                sendAll(name + ">" + str);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            list.remove(writer);
            sendAll("#" + name + "님이 나가셨습니다");
            try {
                socket.close();
            }
            catch (Exception ignored) {
            }
        }
    }
    private void sendAll(String str) {  
        for (PrintWriter writer : list) {
            writer.println(str);
            writer.flush();
        }
    }
}
