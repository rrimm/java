
public class InheritanceExample { 	// 다형성과 부모클래스

	public static void main(String[] args) {
		Account obj1 = new Account("AAA","AAAA", 10);
		Account obj2 = new CheckingAccount("111-22-33333333",
				"홍길동", 0, "5555-6666-7777-8888");
		CheckingAccount obj3 = new CheckingAccount("111-22-33333333",
				"홍길동", 0, "5555-6666-7777-8888");
		

		obj1.deposit(100000);
		
		try {
		int paidAmount = obj2.pay("5555-6666-7777-8888", 47000); // pay는 account에 속한 메소드가 아니므로 오류
		int paidAmount2 = obj3.pay("5555-6666-7777-8888", 47000); // CheckingAccount에 속한 메소드이므로 실행 가능
		System.out.println("지불액:" + paidAmount);
		System.out.println("잔액:" + obj2.balance); //balance는 account에 속해있으므로 실행가능
		}
		catch (Exception e) {
		String msg = e.getMessage();
		System.out.println(msg);
		}

	}

}
