
public class ForExample4 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 }; // 배열 객체를 저장할 변수를 만듦
		int tot = 0;
		for (int cnt = 0; cnt < arr.length; cnt++) {  //배열의 장점: 간결한 처리
			tot += arr[cnt];
			
		}
		System.out.println(tot);
		System.out.println("Done.");

		/* int arr[] = { 10, 20, 30, 40, 50 };
		for (int cnt = 0; cnt < arr.length; cnt++) {
		System.out.println(arr[cnt]);
		}
		System.out.println("Done.");
		
		배열의 항목을 순서대로 출력합니다 */
	}

}
