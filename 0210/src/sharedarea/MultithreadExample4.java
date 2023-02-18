package sharedarea;

public class MultithreadExample4 {

	public static void main(String[] args) {
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		SharedArea obj = new SharedArea(); // 공유영역 객체를 생성
		thread1.sharedArea = obj; // SharedArea 객체의 참조값을 스레드의 필드에 저장
		thread2.sharedArea = obj;
		thread1.start();
		thread2.start();

	}

}
