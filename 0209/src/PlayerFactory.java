
public abstract class PlayerFactory {
	abstract Player createPlayer();

	interface Player {	// static
		void play(String source);

		void stop();
	}
}
