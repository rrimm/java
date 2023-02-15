import java.io.File;
import java.util.GregorianCalendar;

public class FileExample1 {

	public static void main(String[] args) {
		File file = new File(".");	// 이 프로젝트 폴더
		File arr[] = file.listFiles();	// 현재 프로젝트 폴더의 정보
		
		for (int cnt = 0; cnt < arr.length; cnt++) {
			String name = arr[cnt].getName();
			if (arr[cnt].isFile()) {
				System.out.printf("%-25s %7d ", name, arr[cnt].length());
			}
			else {
				System.out.printf("%-25s <DIR> ", name);
			}
			
			long time = arr[cnt].lastModified();
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis(time);		// ms로 바꿈
			System.out.printf("%1$tF %1$tT %n", calendar);
		}

	}

}
