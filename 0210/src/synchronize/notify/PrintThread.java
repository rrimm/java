package synchronize.notify;

public class PrintThread extends Thread {
	SharedArea sharedArea;

	public void run() {
		if (sharedArea.isReady != true) {
			try {
				synchronized (sharedArea) {
					sharedArea.wait();	//공유객체로부터 신호가 올 때까지 cpu를 쓰지 않고 무한대기
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(sharedArea.result);
	}
}
	
