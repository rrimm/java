
public interface Lendable {		// 내부에 추상메소드만 가능
	void checkOut(String borrower, String date) throws Exception;	// 대출한다
	void checkIn();			// 반납한다
}
