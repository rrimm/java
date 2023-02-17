
public class NestedIFExample1 {

	public static void main(String[] args) {
		MP3PlayerFactory factory = new MP3PlayerFactory();
		PlayerFactory.Player player = factory.createPlayer();
		player.play("아리랑");
		player.stop();

	}

}
