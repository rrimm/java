
public class NestedClassExample8 {

	public static void main(String[] args) {
//		class SatelliteSender extends MessageSender {
//			void send(String message) {
//				System.out.println("발신:마이다스");
//				System.out.println("수신:빌게이츠");
//				System.out.println("메시지:" + message);
//				System.out.println();
//			}
//		}
//		SatelliteSender obj = new SatelliteSender();
//		obj.send("굿모닝");
//
//	}
		MessageSender obj = new MessageSender() {	// 익명 로컬 이너 클래스: 일회성 목적일 때 주로 사용
			void send(String message) {
				System.out.println("발신:마이다스");
				System.out.println("수신:빌게이츠");
				System.out.println("메시지:" + message);
				System.out.println();
			}
		};
		obj.send("굿모닝");

	}
}
