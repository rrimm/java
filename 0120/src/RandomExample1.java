import java.util.Random;

public class RandomExample1 {

	public static void main(String[] args) {
//		Random random = new Random();
		Random random = new Random(349239L);
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));

	}

}
