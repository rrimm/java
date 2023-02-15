
public class ArrayExample1 {

	public static void main(String[] args) {
		int arr[];  // 배열 변수 선언. 값을 저장하는 것이 아닌 주소를 저장하는 레퍼런스 변수 arr
		arr = new int[10];  // 배열 생성
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = arr[0] + arr[1];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[9]);

	}

}
