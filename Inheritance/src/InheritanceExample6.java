
public class InheritanceExample6 {

	public static void main(String[] args) {
		EMailSender obj1 = new EMailSender("생일을 축하합니다", "고객센터",
		"admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
		SMSSender obj2 = new SMSSender("생일을 축하합니다", "고객센터",
		"02-000-0000", "10% 할인쿠폰이 발행되었습니다.");
//		obj1.sendMessage("hatman@yeyeye.com");
//		obj1.sendMessage("stickman@hahaha.com");
//		obj2.sendMessage("010-000-0000");
		send(obj1, "hatman@yeyeye.com")	;
		send(obj1, "stickman@hahaha.com")	;
		send(obj2, "010-000-0000")	;
	}
	
	static void send(MessageSender obj, String recipient) {	// 메소드 다형성. 서로 다른 객체 주소를 한 가지 형식으로 받아서 동작
		obj.sendMessage(recipient);
	}

}
