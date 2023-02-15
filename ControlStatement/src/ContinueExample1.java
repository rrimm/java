
public class ContinueExample1 {

	public static void main(String[] args) {
		for (int cnt = 0; cnt < 10; cnt++) {
			if (cnt == 5)
			continue;
			System.out.println(cnt);  // cnt = 5일 때 출력으로 내려오지 않고 for문으로 다시 가서 다음 (cnt = 6)을 실행
			}
			System.out.println("Done.");

	}

}
