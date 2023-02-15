
public class BreakExample3 {

	public static void main(String[] args) {
		loop1:
		for (int row = 0; row < 3; row++) {
			loop2:
				for (int col = 0; col < 5; col++) {
					System.out.println("(" + row + ", " + col + ")");
					if ((row == 1) && (col == 3))     
						break loop1;   //라벨 활용하여 한 번에 반복문을 빠져나오는 방법     
				}
			}
			System.out.println("Done.");

	}
}
