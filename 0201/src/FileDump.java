import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDump {

	public static void main(String[] args) {	// String[] args: 명령행 매개변수를 전달받음
		if (args.length < 1) {
			System.out.println("Usage: java FileDump <filename>");
			return;
		}
//		FileInputStream in = null;
		BufferedInputStream in = null;
		try {
//			in = new FileInputStream(args[0]);
			in = new BufferedInputStream(new FileInputStream(args[0]));
			
			byte arr[] = new byte[16];
			while (true) {
				int num = in.read(arr);
				if (num < 0) {
					break;
				}
				for (int cnt = 0; cnt < num; cnt++) {
					System.out.printf("%02X ", arr[cnt]);	// %02X: 16진수 출력
				}
				System.out.println();
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println(args[0] + " 파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println(args[0] + " 파일을 읽을 수 없습니다.");
		} finally {
			try {
				in.close();
			} catch (Exception e) {
			}
		}

	}

}
