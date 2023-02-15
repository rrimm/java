
public class BonusPointAccount extends Account {
	int bonusPoint; // 누적 포인트
	
	BonusPointAccount(String accountNo, String ownerName, int balance,
	int bonusPoint) {
	super(accountNo, ownerName, balance);
	this.bonusPoint = bonusPoint;
	}
	
	void deposit(int amount) { // 예금한다(오버라이딩된 메소드)
//		super.deposit(amount); //중복되는 내용을 또 쓸 필요가 없으니 그대로 가져온다는 뜻. super는 부모클래스를 가리킴
	balance += amount;
	bonusPoint += (int) (amount * 0.001);
	}
}
