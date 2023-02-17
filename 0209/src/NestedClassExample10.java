
public class NestedClassExample10 {

	public static void main(String[] args) {
		Player obj = new Player() {
			public void play(String source) {
				System.out.println("플레이 시작:" + source);
			}

			public void stop() {
				System.out.println("플레이 종료");
			}
		};
		obj.play("LetItBe.mp3");
		obj.stop();

	}

}
