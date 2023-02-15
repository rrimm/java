import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample1 {

	public static void main(String[] args) {
		
		FileReader reader = null;
		
		try {
			reader = new FileReader("poem.txt");
			while (true) {
				int data = reader.read();	// read는 int로 설계되어있음
				if (data == -1)
					break;
				char ch = (char) data;
				System.out.print(ch);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {		// IOException는 FileNotFoundException의 부모클래스이므로 자식클래스를 먼저 사용해야 함
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
			}
		}

	}
}
