
public class MP3PlayerFactory extends PlayerFactory {
	public Player createPlayer() {
		return new MP3Player();
	}

	class MP3Player implements Player {
		public void play(String source) {
			System.out.println("플레이시작:" + source);
		}

		public void stop() {
			System.out.println("플레이종료");
		}
	}
}
