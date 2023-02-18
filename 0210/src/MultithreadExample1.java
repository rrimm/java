
public class MultithreadExample1 {
	public static void main(String args[]) {
		Thread thread = new DigitThread(); // 스레드를 생성
		thread.start(); // 스레드를 시작
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
