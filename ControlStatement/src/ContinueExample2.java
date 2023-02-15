
public class ContinueExample2 {

	public static void main(String[] args) {
		int cnt = 0;
		
		while (cnt < 10) {
			
		if (cnt == 5)
		continue;   // 0~4를 출력하고 무한루프.
			System.out.println(cnt);
			cnt++;
		}
		System.out.println("Done.");

	}

}
