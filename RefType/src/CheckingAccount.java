
public class CheckingAccount extends Account {	// Account 상속
	String cardNo;	// 직불카드번호에 해당하는 필드
	
	CheckingAccount(){
		super();
	}
	CheckingAccount(String accountNo, String ownerName,
			int balance, String cardNo) { 		// 생성자
//			super();	
			super(accountNo, ownerName, balance);	// 생성자 호출문장은 이 메소드 내에서 가장 먼저 와야 함
//			this.accountNo = accountNo;
//			this.ownerName = ownerName;
//			this.balance = balance;
			this.cardNo = cardNo;
			}
	
	int pay(String cardNo, int amount) throws Exception {	// 직불카드 사용액을 지불한다에 해당하는 메소드
	if (!cardNo.equals(this.cardNo) || (balance < amount))	// balance 잔고 amount 출금액
		throw new Exception("지불이 불가능합니다.");
	return withdraw(amount);
	}
}
