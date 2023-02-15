
public class BreakExample2 {

	public static void main(String[] args) {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.println("(" + row + ", " + col + ")");
				if ((row == 1) && (col == 3))     //row가 1이고 col이 3이면 안쪽 for 반복문을 빠져나갑니다.
					break;       //break가 포함된 for문만 빠져나오고 가장 바깥쪽 for문은 break 적용 x
				}
			}
			System.out.println("Done.");

	}

}
