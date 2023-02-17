
public class NestedClassExample3 {

	public static void main(String[] args) {
		PiggyBank bank1 = new PiggyBank();
		PiggyBank bank2 = new PiggyBank();
		PiggyBank bank3 = new PiggyBank();
		bank2.slot.put(100);
		System.out.println("첫번째돼지저금통:" + bank1.total);
		System.out.println("두번째돼지저금통:" + bank2.total);
		System.out.println("세번째돼지저금통:" + bank3.total);

	}

}
