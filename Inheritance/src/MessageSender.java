
public abstract class MessageSender {
	String title;
	String senderName;
	
	MessageSender(String title, String senderName) {
	this.title = title;
	this.senderName = senderName;
	}
	
	abstract void sendMessage(String recipient);	// 추상메소드 선언. 메소드를 오버라이딩하게 해서 다형성 형태로 사용하게 함
}
