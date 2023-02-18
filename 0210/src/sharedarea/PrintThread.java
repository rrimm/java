package sharedarea;

public class PrintThread extends Thread {
	SharedArea sharedArea;

	public void run() {
		while (sharedArea.isReady != true) {
			continue;
		}
		System.out.println(sharedArea.result); // 공유영역의 데이터 출력
	}
}
