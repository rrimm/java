
public class PiggyBank {
	int total;
	Slot slot;

	PiggyBank() {
		total = 0;
		slot = new Slot();
	}

	class Slot {// 입구클래스
		void put(int amount) {
			total += amount;	// 인클로징클래스인 PiggyBank의 total을 바로 사용 가능
		}
	}
}
