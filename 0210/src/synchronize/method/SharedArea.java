package synchronize.method;

public class SharedArea {	// 동기화 메소드 예제
	Account account1; // 이몽룡의 계좌
	Account account2; // 성춘향의 계좌

	synchronized void transfer(int amount) { // 계좌 이체를 한다

		account1.withdraw(1000000);
		System.out.print("이몽룡 계좌: 100만원 인출,");
		account2.deposit(1000000);
		System.out.println("성춘향 계좌: 100만원 입금");

	}

	synchronized int getTotal() { // 잔액 합계를 구한다

		return account1.balance + account2.balance;

	}
}
