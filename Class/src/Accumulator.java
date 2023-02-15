
public class Accumulator {
	int total = 0;
	static int grandTotal = 0; // 정적 필드를 선언하는 선언문
	
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount; // 정적 필드를 사용하는 명령문
	}
}
