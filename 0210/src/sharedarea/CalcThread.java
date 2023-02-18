package sharedarea;

public class CalcThread extends Thread {
	SharedArea sharedArea;

	public void run() {
		double total = 0.0;
		for (int cnt = 1; cnt < 150000; cnt += 2)
			if (cnt / 2 % 2 == 0)
				total += 1.0 / cnt;
			else
				total -= 1.0 / cnt;
		sharedArea.result = total * 4; // 계산 결과를 공유영역에 저장
		sharedArea.isReady = true;
	}
}
