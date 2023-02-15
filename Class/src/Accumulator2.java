
public class Accumulator2 {
	int total = 0;
	static int grandTotal = 0;
	
	void accumulate(int amount) {
	total += amount;
	grandTotal += amount;
	}
	
	static int getGrandTotal() { // 정적 메소드 선언
		return grandTotal;
	}
}
