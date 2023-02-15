
public class Account {
	String accountNo; // 계좌번호
	String ownerName; // 예금주 이름
	int balance; // 잔액
	
	Account(String accountNo, String ownerName, int balance) { // 생성자
	this.accountNo = accountNo;
	this.ownerName = ownerName;
	this.balance = balance;
	}
	
	void deposit(int amount) {
	balance += amount;
	}
	
	int withdraw(int amount) throws Exception {
	if (balance < amount)
//		return 0;   출금을 어차피 못하니까 0 반환. 제대로 하려면 예외처리를 활용하여 출금을 못한다는 오류메시지 등을 보낼 수 있음
		throw new Exception("잔액이 부족합니다.");
		balance -= amount;
	return amount;
	}
}
