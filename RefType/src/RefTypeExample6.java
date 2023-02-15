
public class RefTypeExample6 {

	public static void main(String[] args) {
		Account obj1 = new Account("AAA", "AAA", 100000);
//		CheckingAccount obj2 = (CheckingAccount) obj1;
		Account obj2 = new CheckingAccount("111-22-33333333", "홍길동", 100000, "4444-5555-6666-7777");
//		CheckingAccount obj2 = (CheckingAccount) obj;
		if (obj2 instanceof CheckingAccount) 	// obj1일 때 false, obj2일 때 true
			pay((CheckingAccount) obj2);
		else
			System.out.println("캐스트할 수 없는 타입입니다.");
	}
	
	static void pay(CheckingAccount obj) {
		try {
			int amount = obj.pay("4444-5555-6666-7777", 47000);
			System.out.println("인출액: " + amount);
			System.out.println("카드번호: " + obj.cardNo);
		}
			catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
