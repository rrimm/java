
public class SMSSender extends MessageSender {
	String phoneNo;
	String responsePhoneNo;

	SMSSender(String phoneNo, String responsePhoneNo) {
		this.phoneNo = phoneNo;
		this.responsePhoneNo = responsePhoneNo;
	}

	void send(String message) {
		System.out.println("전화번호:" + phoneNo);
		System.out.println("내용:" + message);
		System.out.println("회신전화번호:" + responsePhoneNo);
		System.out.println();
	}
}
