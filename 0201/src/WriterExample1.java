import java.io.FileWriter;
import java.io.IOException;

public class WriterExample1 {

	public static void main(String[] args) {

		FileWriter writer = null;
		try {
			writer = new FileWriter("output.txt");	// try블럭 내에 객체 생성. writer을 실행하면 자동으로 파일 생성
			char arr[] = { '뇌', '를', ' ', '자', '극', '하', '는', ' ', 'J', 'A', 'V', 'A' };
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
			}
		}
		// 실행 후 refresh 실행하면 파일 생성됨
	}

}
