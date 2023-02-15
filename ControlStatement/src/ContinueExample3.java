
public class ContinueExample3 {

	public static void main(String[] args) {
		outerLoop:
				for (int row = 0; row < 3; row++) {
					for (int col = 0; col < 5; col++) {
						if ((row == 1) && (col == 3))
							continue outerLoop;   //바로 위의 조건문이 아닌 바깥루프까지 빠져나오고 싶을 때 라벨(outloop) 활용
						System.out.println("(" + row + ", " + col + ")");
						}
					}
			System.out.println("Done.");

	}

}
