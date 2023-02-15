
public class InheritanceExample7 {

	public static void main(String[] args) {
		Account obj1 = new Account("111-22-333333", "임꺽정", 10000);
		CheckingAccount obj2 = new CheckingAccount("444-55-666666", "홍길동", 20000, "5555-6666-7777-8888");
		Account obj2_1 = new CheckingAccount("444-55-666666", "홍길동", 20000, "5555-6666-7777-8888");	// CheckingAccount가 Account로부터 상속받은 필드와 메소드에만 접근가능 
		CreditLineAccount obj3 = new CreditLineAccount("777-88-999999", "김선달", 30000, 20000000);
		BonusPointAccount obj4 = new BonusPointAccount("000-00-000000", "김미영", 0, 0);
		
//		printAccountInfo(obj1);
//		printAccountInfo(obj2);
		printAccountInfo(obj3);
//		printAccountInfo(obj2_1);
//		printAccountInfo(obj4);

	}
	static void printAccountInfo(Account obj) {		// 가져오는 클래스가 Account
		System.out.println("계좌번호:" + obj.accountNo);
		System.out.println("예금주 이름:" + obj.ownerName);
		System.out.println("잔액:" + obj.balance);
		System.out.println(obj.creditLine); // Account에 없는 것이므로 접근 불가
		System.out.println();
		}

}
